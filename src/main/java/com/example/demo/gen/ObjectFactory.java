
package com.example.demo.gen;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private static final QName _EchoRequest_QNAME = new QName("http://www.apis-it.hr/fin/2012/types/f73", "EchoRequest");
    private static final QName _EchoResponse_QNAME = new QName("http://www.apis-it.hr/fin/2012/types/f73", "EchoResponse");
    private static final QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private static final QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private static final QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private static final QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private static final QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    private static final QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private static final QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private static final QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private static final QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private static final QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private static final QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private static final QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private static final QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private static final QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private static final QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private static final QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private static final QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private static final QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private static final QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private static final QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private static final QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private static final QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private static final QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private static final QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private static final QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
    private static final QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket");
    private static final QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private static final QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private static final QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private static final QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private static final QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private static final QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private static final QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private static final QName _RacunPDTypePrateciDokumentJirPD_QNAME = new QName("http://www.apis-it.hr/fin/2012/types/f73", "JirPD");
    private static final QName _RacunPDTypePrateciDokumentZastKodPD_QNAME = new QName("http://www.apis-it.hr/fin/2012/types/f73", "ZastKodPD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RacunNapojnicaType }
     * 
     * @return
     *     the new instance of {@link RacunNapojnicaType }
     */
    public RacunNapojnicaType createRacunNapojnicaType() {
        return new RacunNapojnicaType();
    }

    /**
     * Create an instance of {@link RacunPNPType }
     * 
     * @return
     *     the new instance of {@link RacunPNPType }
     */
    public RacunPNPType createRacunPNPType() {
        return new RacunPNPType();
    }

    /**
     * Create an instance of {@link RacunPDType }
     * 
     * @return
     *     the new instance of {@link RacunPDType }
     */
    public RacunPDType createRacunPDType() {
        return new RacunPDType();
    }

    /**
     * Create an instance of {@link RacunZahtjev }
     * 
     * @return
     *     the new instance of {@link RacunZahtjev }
     */
    public RacunZahtjev createRacunZahtjev() {
        return new RacunZahtjev();
    }

    /**
     * Create an instance of {@link ZaglavljeType }
     * 
     * @return
     *     the new instance of {@link ZaglavljeType }
     */
    public ZaglavljeType createZaglavljeType() {
        return new ZaglavljeType();
    }

    /**
     * Create an instance of {@link RacunType }
     * 
     * @return
     *     the new instance of {@link RacunType }
     */
    public RacunType createRacunType() {
        return new RacunType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     * @return
     *     the new instance of {@link SignatureType }
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link RacunOdgovor }
     * 
     * @return
     *     the new instance of {@link RacunOdgovor }
     */
    public RacunOdgovor createRacunOdgovor() {
        return new RacunOdgovor();
    }

    /**
     * Create an instance of {@link ZaglavljeOdgovorType }
     * 
     * @return
     *     the new instance of {@link ZaglavljeOdgovorType }
     */
    public ZaglavljeOdgovorType createZaglavljeOdgovorType() {
        return new ZaglavljeOdgovorType();
    }

    /**
     * Create an instance of {@link GreskeType }
     * 
     * @return
     *     the new instance of {@link GreskeType }
     */
    public GreskeType createGreskeType() {
        return new GreskeType();
    }

    /**
     * Create an instance of {@link PrateciDokumentiZahtjev }
     * 
     * @return
     *     the new instance of {@link PrateciDokumentiZahtjev }
     */
    public PrateciDokumentiZahtjev createPrateciDokumentiZahtjev() {
        return new PrateciDokumentiZahtjev();
    }

    /**
     * Create an instance of {@link PrateciDokumentType }
     * 
     * @return
     *     the new instance of {@link PrateciDokumentType }
     */
    public PrateciDokumentType createPrateciDokumentType() {
        return new PrateciDokumentType();
    }

    /**
     * Create an instance of {@link PrateciDokumentiOdgovor }
     * 
     * @return
     *     the new instance of {@link PrateciDokumentiOdgovor }
     */
    public PrateciDokumentiOdgovor createPrateciDokumentiOdgovor() {
        return new PrateciDokumentiOdgovor();
    }

    /**
     * Create an instance of {@link RacunPDZahtjev }
     * 
     * @return
     *     the new instance of {@link RacunPDZahtjev }
     */
    public RacunPDZahtjev createRacunPDZahtjev() {
        return new RacunPDZahtjev();
    }

    /**
     * Create an instance of {@link RacunPDOdgovor }
     * 
     * @return
     *     the new instance of {@link RacunPDOdgovor }
     */
    public RacunPDOdgovor createRacunPDOdgovor() {
        return new RacunPDOdgovor();
    }

    /**
     * Create an instance of {@link ProvjeraZahtjev }
     * 
     * @return
     *     the new instance of {@link ProvjeraZahtjev }
     */
    public ProvjeraZahtjev createProvjeraZahtjev() {
        return new ProvjeraZahtjev();
    }

    /**
     * Create an instance of {@link ProvjeraOdgovor }
     * 
     * @return
     *     the new instance of {@link ProvjeraOdgovor }
     */
    public ProvjeraOdgovor createProvjeraOdgovor() {
        return new ProvjeraOdgovor();
    }

    /**
     * Create an instance of {@link PromijeniNacPlacZahtjev }
     * 
     * @return
     *     the new instance of {@link PromijeniNacPlacZahtjev }
     */
    public PromijeniNacPlacZahtjev createPromijeniNacPlacZahtjev() {
        return new PromijeniNacPlacZahtjev();
    }

    /**
     * Create an instance of {@link PromijeniNacPlacOdgovor }
     * 
     * @return
     *     the new instance of {@link PromijeniNacPlacOdgovor }
     */
    public PromijeniNacPlacOdgovor createPromijeniNacPlacOdgovor() {
        return new PromijeniNacPlacOdgovor();
    }

    /**
     * Create an instance of {@link PorukaOdgovoraType }
     * 
     * @return
     *     the new instance of {@link PorukaOdgovoraType }
     */
    public PorukaOdgovoraType createPorukaOdgovoraType() {
        return new PorukaOdgovoraType();
    }

    /**
     * Create an instance of {@link NapojnicaZahtjev }
     * 
     * @return
     *     the new instance of {@link NapojnicaZahtjev }
     */
    public NapojnicaZahtjev createNapojnicaZahtjev() {
        return new NapojnicaZahtjev();
    }

    /**
     * Create an instance of {@link NapojnicaOdgovor }
     * 
     * @return
     *     the new instance of {@link NapojnicaOdgovor }
     */
    public NapojnicaOdgovor createNapojnicaOdgovor() {
        return new NapojnicaOdgovor();
    }

    /**
     * Create an instance of {@link NapojnicaType }
     * 
     * @return
     *     the new instance of {@link NapojnicaType }
     */
    public NapojnicaType createNapojnicaType() {
        return new NapojnicaType();
    }

    /**
     * Create an instance of {@link GreskaType }
     * 
     * @return
     *     the new instance of {@link GreskaType }
     */
    public GreskaType createGreskaType() {
        return new GreskaType();
    }

    /**
     * Create an instance of {@link NaknadeType }
     * 
     * @return
     *     the new instance of {@link NaknadeType }
     */
    public NaknadeType createNaknadeType() {
        return new NaknadeType();
    }

    /**
     * Create an instance of {@link NaknadaType }
     * 
     * @return
     *     the new instance of {@link NaknadaType }
     */
    public NaknadaType createNaknadaType() {
        return new NaknadaType();
    }

    /**
     * Create an instance of {@link OstaliPoreziType }
     * 
     * @return
     *     the new instance of {@link OstaliPoreziType }
     */
    public OstaliPoreziType createOstaliPoreziType() {
        return new OstaliPoreziType();
    }

    /**
     * Create an instance of {@link PorezNaPotrosnjuType }
     * 
     * @return
     *     the new instance of {@link PorezNaPotrosnjuType }
     */
    public PorezNaPotrosnjuType createPorezNaPotrosnjuType() {
        return new PorezNaPotrosnjuType();
    }

    /**
     * Create an instance of {@link PdvType }
     * 
     * @return
     *     the new instance of {@link PdvType }
     */
    public PdvType createPdvType() {
        return new PdvType();
    }

    /**
     * Create an instance of {@link PorezOstaloType }
     * 
     * @return
     *     the new instance of {@link PorezOstaloType }
     */
    public PorezOstaloType createPorezOstaloType() {
        return new PorezOstaloType();
    }

    /**
     * Create an instance of {@link PorezType }
     * 
     * @return
     *     the new instance of {@link PorezType }
     */
    public PorezType createPorezType() {
        return new PorezType();
    }

    /**
     * Create an instance of {@link BrojRacunaType }
     * 
     * @return
     *     the new instance of {@link BrojRacunaType }
     */
    public BrojRacunaType createBrojRacunaType() {
        return new BrojRacunaType();
    }

    /**
     * Create an instance of {@link BrojPDType }
     * 
     * @return
     *     the new instance of {@link BrojPDType }
     */
    public BrojPDType createBrojPDType() {
        return new BrojPDType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     * @return
     *     the new instance of {@link SignatureValueType }
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     * @return
     *     the new instance of {@link SignedInfoType }
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     * @return
     *     the new instance of {@link CanonicalizationMethodType }
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     * @return
     *     the new instance of {@link SignatureMethodType }
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     * @return
     *     the new instance of {@link ReferenceType }
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     * @return
     *     the new instance of {@link TransformsType }
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     * @return
     *     the new instance of {@link TransformType }
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     * @return
     *     the new instance of {@link DigestMethodType }
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     * @return
     *     the new instance of {@link KeyInfoType }
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     * @return
     *     the new instance of {@link KeyValueType }
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     * @return
     *     the new instance of {@link RetrievalMethodType }
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link X509Data }
     * 
     * @return
     *     the new instance of {@link X509Data }
     */
    public X509Data createX509DataType() {
        return new X509Data();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     * @return
     *     the new instance of {@link PGPDataType }
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     * @return
     *     the new instance of {@link SPKIDataType }
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     * @return
     *     the new instance of {@link ObjectType }
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     * @return
     *     the new instance of {@link ManifestType }
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     * @return
     *     the new instance of {@link SignaturePropertiesType }
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     * @return
     *     the new instance of {@link SignaturePropertyType }
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     * @return
     *     the new instance of {@link DSAKeyValueType }
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     * @return
     *     the new instance of {@link RSAKeyValueType }
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link X509IssuerSerial }
     * 
     * @return
     *     the new instance of {@link X509IssuerSerial }
     */
    public X509IssuerSerial createX509IssuerSerialType() {
        return new X509IssuerSerial();
    }

    /**
     * Create an instance of {@link RacunNapojnicaType.PrateciDokument }
     * 
     * @return
     *     the new instance of {@link RacunNapojnicaType.PrateciDokument }
     */
    public RacunNapojnicaType.PrateciDokument createRacunNapojnicaTypePrateciDokument() {
        return new RacunNapojnicaType.PrateciDokument();
    }

    /**
     * Create an instance of {@link RacunPNPType.PrateciDokument }
     * 
     * @return
     *     the new instance of {@link RacunPNPType.PrateciDokument }
     */
    public RacunPNPType.PrateciDokument createRacunPNPTypePrateciDokument() {
        return new RacunPNPType.PrateciDokument();
    }

    /**
     * Create an instance of {@link RacunPDType.PrateciDokument }
     * 
     * @return
     *     the new instance of {@link RacunPDType.PrateciDokument }
     */
    public RacunPDType.PrateciDokument createRacunPDTypePrateciDokument() {
        return new RacunPDType.PrateciDokument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.apis-it.hr/fin/2012/types/f73", name = "EchoRequest")
    public JAXBElement<String> createEchoRequest(String value) {
        return new JAXBElement<>(_EchoRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.apis-it.hr/fin/2012/types/f73", name = "EchoResponse")
    public JAXBElement<String> createEchoResponse(String value) {
        return new JAXBElement<>(_EchoResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509Data }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509Data }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509Data> createX509Data(X509Data value) {
        return new JAXBElement<>(_X509Data_QNAME, X509Data.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyID", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyID(byte[] value) {
        return new JAXBElement<>(_PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyPacket", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(byte[] value) {
        return new JAXBElement<>(_PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link X509IssuerSerial }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509Data.class)
    public JAXBElement<X509IssuerSerial> createX509DataTypeX509IssuerSerial(X509IssuerSerial value) {
        return new JAXBElement<>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerial.class, X509Data.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<>(_X509DataTypeX509SKI_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509Data.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<>(_X509DataTypeX509SubjectName_QNAME, String.class, X509Data.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<>(_X509DataTypeX509CRL_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.apis-it.hr/fin/2012/types/f73", name = "JirPD", scope = RacunPDType.PrateciDokument.class)
    public JAXBElement<String> createRacunPDTypePrateciDokumentJirPD(String value) {
        return new JAXBElement<>(_RacunPDTypePrateciDokumentJirPD_QNAME, String.class, RacunPDType.PrateciDokument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.apis-it.hr/fin/2012/types/f73", name = "ZastKodPD", scope = RacunPDType.PrateciDokument.class)
    public JAXBElement<String> createRacunPDTypePrateciDokumentZastKodPD(String value) {
        return new JAXBElement<>(_RacunPDTypePrateciDokumentZastKodPD_QNAME, String.class, RacunPDType.PrateciDokument.class, value);
    }

}
