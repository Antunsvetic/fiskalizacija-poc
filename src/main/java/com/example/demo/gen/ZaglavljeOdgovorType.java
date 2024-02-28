
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZaglavljeOdgovorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ZaglavljeOdgovorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IdPoruke">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *               <maxLength value="36"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
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
@XmlType(name = "ZaglavljeOdgovorType", propOrder = {
    "idPoruke",
    "datumVrijeme"
})
public class ZaglavljeOdgovorType {

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
