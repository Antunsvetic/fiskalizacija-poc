package com.example.demo;


import com.example.demo.gen.BrojRacunaType;
import com.example.demo.gen.CanonicalizationMethodType;
import com.example.demo.gen.DigestMethodType;
import com.example.demo.gen.KeyInfoType;
import com.example.demo.gen.NacinPlacanjaType;
import com.example.demo.gen.OznakaSlijednostiType;
import com.example.demo.gen.RacunOdgovor;
import com.example.demo.gen.RacunType;
import com.example.demo.gen.RacunZahtjev;
import com.example.demo.gen.ReferenceType;
import com.example.demo.gen.SignatureMethodType;
import com.example.demo.gen.SignatureType;
import com.example.demo.gen.SignatureValueType;
import com.example.demo.gen.SignedInfoType;
import com.example.demo.gen.TransformType;
import com.example.demo.gen.TransformsType;
import com.example.demo.gen.X509Data;
import com.example.demo.gen.X509IssuerSerial;
import com.example.demo.gen.ZaglavljeType;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.xml.security.utils.IdResolver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


@Component
public class StartUp implements CommandLineRunner {


  private final Jaxb2Marshaller jaxb2Marshaller;
  private final FiskalizacijaService fiskalizacijaService;

  public StartUp(Jaxb2Marshaller jaxb2Marshaller, FiskalizacijaService fiskalizacijaService) {
    this.jaxb2Marshaller = jaxb2Marshaller;

    this.fiskalizacijaService = fiskalizacijaService;
  }

  @Override
  public void run(String... args) throws Exception {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy'T'HH:mm:ss");
    LocalDateTime localDateTime = LocalDateTime.now();
    String currentLocalDateTime = localDateTime.format(formatter);

    RacunZahtjev request = new RacunZahtjev();
    request.setId("signXmlId");

    ZaglavljeType zaglavlje = new ZaglavljeType();
    zaglavlje.setIdPoruke(UUID.randomUUID().toString());
    zaglavlje.setDatumVrijeme(currentLocalDateTime);

    request.setZaglavlje(zaglavlje);

    RacunType racun = new RacunType();
    racun.setOib("06362716309");
    racun.setUSustPdv(false);
    racun.setDatVrijeme(currentLocalDateTime);
    racun.setOznSlijed(OznakaSlijednostiType.P);
    racun.setIznosUkupno("11.0");
    racun.setNacinPlac(NacinPlacanjaType.K);
    racun.setOibOper("06362716309");
    racun.setNakDost(false);

    request.setRacun(racun);

    BrojRacunaType brojRacuna = new BrojRacunaType();
    brojRacuna.setBrOznRac("1");
    brojRacuna.setOznNapUr("1");
    brojRacuna.setOznPosPr("1");

    racun.setBrRac(brojRacuna);

    test(request, localDateTime);
  }

  public void test(RacunZahtjev racunZahtjev, LocalDateTime localDateTime) throws Exception {

    StringWriter writer = new StringWriter();
    jaxb2Marshaller.marshal(racunZahtjev, new StreamResult(writer));
    String racunToXml = writer.toString();

    String fileName = "certifikat_firme.p12";
    String p12Password = "ceps123";
    String keyAlias = "cn=fiskal 1";

    KeyStore keyStore = KeyStore.getInstance("PKCS12");
    try (FileInputStream fis = new FileInputStream(new ClassPathResource(fileName).getFile())) {
      keyStore.load(fis, p12Password.toCharArray());
    }

    X509Certificate certificate = (X509Certificate) keyStore.getCertificate(keyAlias);
    PrivateKey privateKey = (PrivateKey) keyStore.getKey(keyAlias, p12Password.toCharArray());

    String zki = generateZki(privateKey, localDateTime);
    racunZahtjev.getRacun().setZastKod(zki);



    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    InputSource is = new InputSource(new StringReader(racunToXml));
    Document xmlDoc = db.parse(is);

    Element element = xmlDoc.getDocumentElement();
    Attr idAttr = element.getAttributeNode("Id");
    element.setIdAttributeNode(idAttr,true);

    String id = "#" + xmlDoc.getDocumentElement().getAttribute("Id");

    // Create XML Signature
    XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
    Reference ref = fac.newReference(id, fac.newDigestMethod(DigestMethod.SHA256, null),
        List.of(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null),
            fac.newTransform(CanonicalizationMethod.EXCLUSIVE, (TransformParameterSpec) null)), null, null);

    SignedInfo si = fac.newSignedInfo(
        fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE, (C14NMethodParameterSpec) null),
        fac.newSignatureMethod(SignatureMethod.RSA_SHA256, null), List.of(ref));

    // Load private key
    KeyInfoFactory kif = fac.getKeyInfoFactory();
    javax.xml.crypto.dsig.keyinfo.X509Data x509Data = kif.newX509Data(List.of(certificate));
    KeyInfo ki = kif.newKeyInfo(List.of(x509Data));

    // Create DOMSignContext
    DOMSignContext dsc = new DOMSignContext(privateKey, xmlDoc.getDocumentElement());

    // Create and sign XML Signature
    XMLSignature signature = fac.newXMLSignature(si, ki);
    signature.sign(dsc);

    NodeList digestValueList = xmlDoc.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    String digestValue = digestValueList.item(0).getTextContent();

    // Get SignatureValue
    NodeList signatureValueList = xmlDoc.getElementsByTagName("SignatureValue");
    String signatureValue = signatureValueList.item(0).getTextContent();

    NodeList x509CertificateList = xmlDoc.getElementsByTagName("X509Certificate");
    String x509Certificate = x509CertificateList.item(0).getTextContent();

    SignatureType signatureType = new SignatureType();
    racunZahtjev.setSignature(signatureType);

    SignedInfoType signedInfoType = new SignedInfoType();
    signatureType.setSignedInfo(signedInfoType);

    CanonicalizationMethodType canonicalizationMethodType = new CanonicalizationMethodType();
    signedInfoType.setCanonicalizationMethod(canonicalizationMethodType);
    canonicalizationMethodType.setAlgorithm("http://www.w3.org/2001/10/xml-exc-c14n#");

    SignatureMethodType signatureMethodType = new SignatureMethodType();
    signedInfoType.setSignatureMethod(signatureMethodType);
    signatureMethodType.setAlgorithm("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");

    ReferenceType referenceType = new ReferenceType();
    signedInfoType.setReference(List.of(referenceType));
    referenceType.setDigestValue(digestValue);

    DigestMethodType digestMethodType = new DigestMethodType();
    referenceType.setDigestMethod(digestMethodType);
    digestMethodType.setAlgorithm("http://www.w3.org/2001/04/xmlenc#sha256");

    TransformType transformType1 = new TransformType();
    transformType1.setAlgorithm("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
    TransformType transformType2 = new TransformType();
    transformType2.setAlgorithm("http://www.w3.org/2001/10/xml-exc-c14n");

    TransformsType transformsType = new TransformsType();
    transformsType.setTransform(List.of(transformType1, transformType2));

    SignatureValueType signatureValueType = new SignatureValueType();
    signatureType.setSignatureValue(signatureValueType);
    signatureValueType.setValue(signatureValue.replaceAll("\\s+", ""));

    KeyInfoType keyInfoType = new KeyInfoType();
    signatureType.setKeyInfo(keyInfoType);

    X509Data x509DataType = new X509Data();
    keyInfoType.setContent(List.of(x509DataType));
    x509DataType.setX509Certificate(x509Certificate.replaceAll("\\s+", ""));

    X509IssuerSerial x509IssuerSerial = new X509IssuerSerial();
    x509DataType.setX509IssuerSerialOrX509SKIOrX509SubjectName(List.of(x509IssuerSerial));
    x509IssuerSerial.setX509IssuerName(certificate.getIssuerX500Principal().getName());
    x509IssuerSerial.setX509SerialNumber(certificate.getSerialNumber());

    RacunOdgovor racunOdgovor = fiskalizacijaService.sendRequest(racunZahtjev);

    System.out.println(racunOdgovor);
  }

  private String generateZki(PrivateKey privateKey, LocalDateTime localDateTime) throws Exception {

    String oib = "06362716309";

    String medjurezultat = oib;
    // pročitaj (datVrij – datum i vrijeme izdavanja računa zapisain kao tekst u
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    String datVrij = localDateTime.format(formatter);
    // medjurezultat = medjurezultat + datVrij
    medjurezultat = medjurezultat + datVrij;
    // pročitaj (bor – brojčana oznaka računa)
    String bor = "1";
    // medjurezultat = medjurezultat + bor
    medjurezultat = medjurezultat + bor;
    // pročitaj (opp – oznaka poslovnog prostora)
    String opp = "1";
    // medjurezultat = medjurezultat + opp
    medjurezultat = medjurezultat + opp;
    // pročitaj (onu – oznaka naplatnog uređaja)
    String onu = "1";
    // medjurezultat = medjurezultat + onu
    medjurezultat = medjurezultat + onu;
    // pročitaj ( uir - ukupni iznos računa )
    String uir = "11.0";
    // medjurezultat = medjurezultat + uir
    medjurezultat = medjurezultat + uir;
    // elektronički potpiši medjurezultat koristeći RSA-SHA1 potpis
    Signature biljeznik = Signature.getInstance("SHA1withRSA");
    biljeznik.initSign(privateKey);
    biljeznik.update(medjurezultat.getBytes());
    byte[] potpisano = biljeznik.sign();
    // rezultatIspis = izračunajMD5(elektronički potpisani medjurezultat)
    String rezultatIspis = DigestUtils.md5Hex(potpisano);
    // kraj
    System.out.println("Dobiveni 32-znamenkasti zaštitni kod je: " + rezultatIspis);

    return rezultatIspis;
  }



  private static String xmlToString(org.w3c.dom.Document xml) throws Exception {
    // Convert XML document to string
    javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
    javax.xml.transform.Transformer transformer = tf.newTransformer();
    javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(xml);
    java.io.StringWriter writer = new java.io.StringWriter();
    javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(writer);
    transformer.transform(source, result);
    return writer.toString();
  }

}
