
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZaglavljeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ZaglavljeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IdPoruke" type="{http://www.apis-it.hr/fin/2012/types/f73}UUIDType"/>
 *         <element name="DatumVrijeme" type="{http://www.apis-it.hr/fin/2012/types/f73}DatumVrijemeType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZaglavljeType", propOrder = {
    "idPoruke",
    "datumVrijeme"
})
public class ZaglavljeType {

    @XmlElement(name = "IdPoruke", required = true)
    protected String idPoruke;
    @XmlElement(name = "DatumVrijeme", required = true)
    protected String datumVrijeme;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the datumVrijeme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumVrijeme() {
        return datumVrijeme;
    }

    /**
     * Sets the value of the datumVrijeme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumVrijeme(String value) {
        this.datumVrijeme = value;
    }

}
