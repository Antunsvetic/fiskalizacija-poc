
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PorezType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PorezType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Stopa" type="{http://www.apis-it.hr/fin/2012/types/f73}StopaType"/>
 *         <element name="Osnovica" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/>
 *         <element name="Iznos" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorezType", propOrder = {
    "stopa",
    "osnovica",
    "iznos"
})
public class PorezType {

    @XmlElement(name = "Stopa", required = true)
    protected String stopa;
    @XmlElement(name = "Osnovica", required = true)
    protected String osnovica;
    @XmlElement(name = "Iznos", required = true)
    protected String iznos;

    /**
     * Gets the value of the stopa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopa() {
        return stopa;
    }

    /**
     * Sets the value of the stopa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopa(String value) {
        this.stopa = value;
    }

    /**
     * Gets the value of the osnovica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsnovica() {
        return osnovica;
    }

    /**
     * Sets the value of the osnovica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsnovica(String value) {
        this.osnovica = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznos(String value) {
        this.iznos = value;
    }

}
