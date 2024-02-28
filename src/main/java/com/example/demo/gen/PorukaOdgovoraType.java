
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PorukaOdgovoraType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PorukaOdgovoraType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SifraPoruke" type="{http://www.apis-it.hr/fin/2012/types/f73}SifraPorukeType"/>
 *         <element name="Poruka" type="{http://www.apis-it.hr/fin/2012/types/f73}PorukaType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorukaOdgovoraType", propOrder = {
    "sifraPoruke",
    "poruka"
})
public class PorukaOdgovoraType {

    @XmlElement(name = "SifraPoruke", required = true)
    protected String sifraPoruke;
    @XmlElement(name = "Poruka", required = true)
    protected String poruka;

    /**
     * Gets the value of the sifraPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifraPoruke() {
        return sifraPoruke;
    }

    /**
     * Sets the value of the sifraPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifraPoruke(String value) {
        this.sifraPoruke = value;
    }

    /**
     * Gets the value of the poruka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoruka() {
        return poruka;
    }

    /**
     * Sets the value of the poruka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoruka(String value) {
        this.poruka = value;
    }

}
