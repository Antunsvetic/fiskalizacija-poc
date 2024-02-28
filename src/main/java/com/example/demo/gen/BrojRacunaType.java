
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrojRacunaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrojRacunaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BrOznRac">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="20"/>
 *               <pattern value="\d*"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="OznPosPr" type="{http://www.apis-it.hr/fin/2012/types/f73}OznPoslProstoraType"/>
 *         <element name="OznNapUr" type="{http://www.apis-it.hr/fin/2012/types/f73}OznNaplUredjajaType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrojRacunaType", propOrder = {
    "brOznRac",
    "oznPosPr",
    "oznNapUr"
})
public class BrojRacunaType {

    @XmlElement(name = "BrOznRac", required = true)
    protected String brOznRac;
    @XmlElement(name = "OznPosPr", required = true)
    protected String oznPosPr;
    @XmlElement(name = "OznNapUr", required = true)
    protected String oznNapUr;

    /**
     * Gets the value of the brOznRac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrOznRac() {
        return brOznRac;
    }

    /**
     * Sets the value of the brOznRac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrOznRac(String value) {
        this.brOznRac = value;
    }

    /**
     * Gets the value of the oznPosPr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOznPosPr() {
        return oznPosPr;
    }

    /**
     * Sets the value of the oznPosPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOznPosPr(String value) {
        this.oznPosPr = value;
    }

    /**
     * Gets the value of the oznNapUr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOznNapUr() {
        return oznNapUr;
    }

    /**
     * Sets the value of the oznNapUr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOznNapUr(String value) {
        this.oznNapUr = value;
    }

}
