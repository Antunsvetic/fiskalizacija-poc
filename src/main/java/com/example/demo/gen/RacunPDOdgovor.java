
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Zaglavlje" type="{http://www.apis-it.hr/fin/2012/types/f73}ZaglavljeOdgovorType"/>
 *         <element name="Jir" type="{http://www.apis-it.hr/fin/2012/types/f73}UUIDType" minOccurs="0"/>
 *         <element name="Greske" type="{http://www.apis-it.hr/fin/2012/types/f73}GreskeType" minOccurs="0"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zaglavlje",
    "jir",
    "greske",
    "signature"
})
@XmlRootElement(name = "RacunPDOdgovor")
public class RacunPDOdgovor {

    @XmlElement(name = "Zaglavlje", required = true)
    protected ZaglavljeOdgovorType zaglavlje;
    @XmlElement(name = "Jir")
    protected String jir;
    @XmlElement(name = "Greske")
    protected GreskeType greske;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link ZaglavljeOdgovorType }
     *     
     */
    public ZaglavljeOdgovorType getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZaglavljeOdgovorType }
     *     
     */
    public void setZaglavlje(ZaglavljeOdgovorType value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the jir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJir() {
        return jir;
    }

    /**
     * Sets the value of the jir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJir(String value) {
        this.jir = value;
    }

    /**
     * Gets the value of the greske property.
     * 
     * @return
     *     possible object is
     *     {@link GreskeType }
     *     
     */
    public GreskeType getGreske() {
        return greske;
    }

    /**
     * Sets the value of the greske property.
     * 
     * @param value
     *     allowed object is
     *     {@link GreskeType }
     *     
     */
    public void setGreske(GreskeType value) {
        this.greske = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
