
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaknadaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NaknadaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NazivN">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="IznosN" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaknadaType", propOrder = {
    "nazivN",
    "iznosN"
})
public class NaknadaType {

    @XmlElement(name = "NazivN", required = true)
    protected String nazivN;
    @XmlElement(name = "IznosN", required = true)
    protected String iznosN;

    /**
     * Gets the value of the nazivN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivN() {
        return nazivN;
    }

    /**
     * Sets the value of the nazivN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivN(String value) {
        this.nazivN = value;
    }

    /**
     * Gets the value of the iznosN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznosN() {
        return iznosN;
    }

    /**
     * Sets the value of the iznosN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznosN(String value) {
        this.iznosN = value;
    }

}
