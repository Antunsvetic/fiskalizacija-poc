
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NapojnicaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NapojnicaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="iznosNapojnice" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/>
 *         <element name="nacinPlacanjaNapojnice" type="{http://www.apis-it.hr/fin/2012/types/f73}NacinPlacanjaType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NapojnicaType", propOrder = {
    "iznosNapojnice",
    "nacinPlacanjaNapojnice"
})
public class NapojnicaType {

    @XmlElement(required = true)
    protected String iznosNapojnice;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NacinPlacanjaType nacinPlacanjaNapojnice;

    /**
     * Gets the value of the iznosNapojnice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznosNapojnice() {
        return iznosNapojnice;
    }

    /**
     * Sets the value of the iznosNapojnice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznosNapojnice(String value) {
        this.iznosNapojnice = value;
    }

    /**
     * Gets the value of the nacinPlacanjaNapojnice property.
     * 
     * @return
     *     possible object is
     *     {@link NacinPlacanjaType }
     *     
     */
    public NacinPlacanjaType getNacinPlacanjaNapojnice() {
        return nacinPlacanjaNapojnice;
    }

    /**
     * Sets the value of the nacinPlacanjaNapojnice property.
     * 
     * @param value
     *     allowed object is
     *     {@link NacinPlacanjaType }
     *     
     */
    public void setNacinPlacanjaNapojnice(NacinPlacanjaType value) {
        this.nacinPlacanjaNapojnice = value;
    }

}
