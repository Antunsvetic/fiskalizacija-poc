
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for X509DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="X509DataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="unbounded">
 *         <choice>
 *           <element name="X509IssuerSerial" type="{http://www.w3.org/2000/09/xmldsig#}X509IssuerSerialType"/>
 *           <element name="X509SKI" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           <element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           <element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           <element name="X509CRL" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           <any processContents='lax' namespace='##other'/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509Data", namespace = "http://www.w3.org/2000/09/xmldsig#", propOrder = {
    "x509IssuerSerialOrX509SKIOrX509SubjectName",
    "x509Certificate"
})
@XmlRootElement
public class X509Data {

    @XmlElementRefs({
        @XmlElementRef(name = "X509IssuerSerial", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509SKI", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509SubjectName", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509Certificate", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "X509CRL", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> x509IssuerSerialOrX509SKIOrX509SubjectName;
    @XmlElement(name = "X509Certificate", required = true)
    protected String x509Certificate;

    public String getX509Certificate() {
        return x509Certificate;
    }

    public void setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    public void setX509IssuerSerialOrX509SKIOrX509SubjectName(
        List<Object> x509IssuerSerialOrX509SKIOrX509SubjectName) {
        this.x509IssuerSerialOrX509SKIOrX509SubjectName = x509IssuerSerialOrX509SKIOrX509SubjectName;
    }

    /**
     * Gets the value of the x509IssuerSerialOrX509SKIOrX509SubjectName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the x509IssuerSerialOrX509SKIOrX509SubjectName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX509IssuerSerialOrX509SKIOrX509SubjectName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link X509IssuerSerial }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Object }
     * {@link Element }
     * 
     * 
     * @return
     *     The value of the x509IssuerSerialOrX509SKIOrX509SubjectName property.
     */
    public List<Object> getX509IssuerSerialOrX509SKIOrX509SubjectName() {
        if (x509IssuerSerialOrX509SKIOrX509SubjectName == null) {
            x509IssuerSerialOrX509SKIOrX509SubjectName = new ArrayList<>();
        }
        return this.x509IssuerSerialOrX509SKIOrX509SubjectName;
    }

}
