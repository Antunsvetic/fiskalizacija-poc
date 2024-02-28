
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RacunType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RacunType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Oib" type="{http://www.apis-it.hr/fin/2012/types/f73}OibType"/>
 *         <element name="USustPdv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DatVrijeme" type="{http://www.apis-it.hr/fin/2012/types/f73}DatumVrijemeType"/>
 *         <element name="OznSlijed" type="{http://www.apis-it.hr/fin/2012/types/f73}OznakaSlijednostiType"/>
 *         <element name="BrRac" type="{http://www.apis-it.hr/fin/2012/types/f73}BrojRacunaType"/>
 *         <element name="Pdv" type="{http://www.apis-it.hr/fin/2012/types/f73}PdvType" minOccurs="0"/>
 *         <element name="Pnp" type="{http://www.apis-it.hr/fin/2012/types/f73}PorezNaPotrosnjuType" minOccurs="0"/>
 *         <element name="OstaliPor" type="{http://www.apis-it.hr/fin/2012/types/f73}OstaliPoreziType" minOccurs="0"/>
 *         <element name="IznosOslobPdv" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType" minOccurs="0"/>
 *         <element name="IznosMarza" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType" minOccurs="0"/>
 *         <element name="IznosNePodlOpor" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType" minOccurs="0"/>
 *         <element name="Naknade" type="{http://www.apis-it.hr/fin/2012/types/f73}NaknadeType" minOccurs="0"/>
 *         <element name="IznosUkupno" type="{http://www.apis-it.hr/fin/2012/types/f73}IznosType"/>
 *         <element name="NacinPlac" type="{http://www.apis-it.hr/fin/2012/types/f73}NacinPlacanjaType"/>
 *         <element name="OibOper" type="{http://www.apis-it.hr/fin/2012/types/f73}OibType"/>
 *         <element name="ZastKod">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="[a-f0-9]{32}"/>
 *               <length value="32"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="NakDost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ParagonBrRac" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="SpecNamj" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RacunType", propOrder = {
    "oib",
    "uSustPdv",
    "datVrijeme",
    "oznSlijed",
    "brRac",
    "pdv",
    "pnp",
    "ostaliPor",
    "iznosOslobPdv",
    "iznosMarza",
    "iznosNePodlOpor",
    "naknade",
    "iznosUkupno",
    "nacinPlac",
    "oibOper",
    "zastKod",
    "nakDost",
    "paragonBrRac",
    "specNamj"
})
public class RacunType {

    @XmlElement(name = "Oib", required = true)
    protected String oib;
    @XmlElement(name = "USustPdv")
    protected boolean uSustPdv;
    @XmlElement(name = "DatVrijeme", required = true)
    protected String datVrijeme;
    @XmlElement(name = "OznSlijed", required = true)
    @XmlSchemaType(name = "string")
    protected OznakaSlijednostiType oznSlijed;
    @XmlElement(name = "BrRac", required = true)
    protected BrojRacunaType brRac;
    @XmlElement(name = "Pdv")
    protected PdvType pdv;
    @XmlElement(name = "Pnp")
    protected PorezNaPotrosnjuType pnp;
    @XmlElement(name = "OstaliPor")
    protected OstaliPoreziType ostaliPor;
    @XmlElement(name = "IznosOslobPdv")
    protected String iznosOslobPdv;
    @XmlElement(name = "IznosMarza")
    protected String iznosMarza;
    @XmlElement(name = "IznosNePodlOpor")
    protected String iznosNePodlOpor;
    @XmlElement(name = "Naknade")
    protected NaknadeType naknade;
    @XmlElement(name = "IznosUkupno", required = true)
    protected String iznosUkupno;
    @XmlElement(name = "NacinPlac", required = true)
    @XmlSchemaType(name = "string")
    protected NacinPlacanjaType nacinPlac;
    @XmlElement(name = "OibOper", required = true)
    protected String oibOper;
    @XmlElement(name = "ZastKod", required = true)
    protected String zastKod;
    @XmlElement(name = "NakDost")
    protected boolean nakDost;
    @XmlElement(name = "ParagonBrRac")
    protected String paragonBrRac;
    @XmlElement(name = "SpecNamj")
    protected String specNamj;

    /**
     * Gets the value of the oib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOib() {
        return oib;
    }

    /**
     * Sets the value of the oib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOib(String value) {
        this.oib = value;
    }

    /**
     * Gets the value of the uSustPdv property.
     * 
     */
    public boolean isUSustPdv() {
        return uSustPdv;
    }

    /**
     * Sets the value of the uSustPdv property.
     * 
     */
    public void setUSustPdv(boolean value) {
        this.uSustPdv = value;
    }

    /**
     * Gets the value of the datVrijeme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatVrijeme() {
        return datVrijeme;
    }

    /**
     * Sets the value of the datVrijeme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatVrijeme(String value) {
        this.datVrijeme = value;
    }

    /**
     * Gets the value of the oznSlijed property.
     * 
     * @return
     *     possible object is
     *     {@link OznakaSlijednostiType }
     *     
     */
    public OznakaSlijednostiType getOznSlijed() {
        return oznSlijed;
    }

    /**
     * Sets the value of the oznSlijed property.
     * 
     * @param value
     *     allowed object is
     *     {@link OznakaSlijednostiType }
     *     
     */
    public void setOznSlijed(OznakaSlijednostiType value) {
        this.oznSlijed = value;
    }

    /**
     * Gets the value of the brRac property.
     * 
     * @return
     *     possible object is
     *     {@link BrojRacunaType }
     *     
     */
    public BrojRacunaType getBrRac() {
        return brRac;
    }

    /**
     * Sets the value of the brRac property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrojRacunaType }
     *     
     */
    public void setBrRac(BrojRacunaType value) {
        this.brRac = value;
    }

    /**
     * Gets the value of the pdv property.
     * 
     * @return
     *     possible object is
     *     {@link PdvType }
     *     
     */
    public PdvType getPdv() {
        return pdv;
    }

    /**
     * Sets the value of the pdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdvType }
     *     
     */
    public void setPdv(PdvType value) {
        this.pdv = value;
    }

    /**
     * Gets the value of the pnp property.
     * 
     * @return
     *     possible object is
     *     {@link PorezNaPotrosnjuType }
     *     
     */
    public PorezNaPotrosnjuType getPnp() {
        return pnp;
    }

    /**
     * Sets the value of the pnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PorezNaPotrosnjuType }
     *     
     */
    public void setPnp(PorezNaPotrosnjuType value) {
        this.pnp = value;
    }

    /**
     * Gets the value of the ostaliPor property.
     * 
     * @return
     *     possible object is
     *     {@link OstaliPoreziType }
     *     
     */
    public OstaliPoreziType getOstaliPor() {
        return ostaliPor;
    }

    /**
     * Sets the value of the ostaliPor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OstaliPoreziType }
     *     
     */
    public void setOstaliPor(OstaliPoreziType value) {
        this.ostaliPor = value;
    }

    /**
     * Gets the value of the iznosOslobPdv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznosOslobPdv() {
        return iznosOslobPdv;
    }

    /**
     * Sets the value of the iznosOslobPdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznosOslobPdv(String value) {
        this.iznosOslobPdv = value;
    }

    /**
     * Gets the value of the iznosMarza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznosMarza() {
        return iznosMarza;
    }

    /**
     * Sets the value of the iznosMarza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznosMarza(String value) {
        this.iznosMarza = value;
    }

    /**
     * Gets the value of the iznosNePodlOpor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznosNePodlOpor() {
        return iznosNePodlOpor;
    }

    /**
     * Sets the value of the iznosNePodlOpor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznosNePodlOpor(String value) {
        this.iznosNePodlOpor = value;
    }

    /**
     * Gets the value of the naknade property.
     * 
     * @return
     *     possible object is
     *     {@link NaknadeType }
     *     
     */
    public NaknadeType getNaknade() {
        return naknade;
    }

    /**
     * Sets the value of the naknade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaknadeType }
     *     
     */
    public void setNaknade(NaknadeType value) {
        this.naknade = value;
    }

    /**
     * Gets the value of the iznosUkupno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIznosUkupno() {
        return iznosUkupno;
    }

    /**
     * Sets the value of the iznosUkupno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIznosUkupno(String value) {
        this.iznosUkupno = value;
    }

    /**
     * Gets the value of the nacinPlac property.
     * 
     * @return
     *     possible object is
     *     {@link NacinPlacanjaType }
     *     
     */
    public NacinPlacanjaType getNacinPlac() {
        return nacinPlac;
    }

    /**
     * Sets the value of the nacinPlac property.
     * 
     * @param value
     *     allowed object is
     *     {@link NacinPlacanjaType }
     *     
     */
    public void setNacinPlac(NacinPlacanjaType value) {
        this.nacinPlac = value;
    }

    /**
     * Gets the value of the oibOper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOibOper() {
        return oibOper;
    }

    /**
     * Sets the value of the oibOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOibOper(String value) {
        this.oibOper = value;
    }

    /**
     * Gets the value of the zastKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZastKod() {
        return zastKod;
    }

    /**
     * Sets the value of the zastKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZastKod(String value) {
        this.zastKod = value;
    }

    /**
     * Gets the value of the nakDost property.
     * 
     */
    public boolean isNakDost() {
        return nakDost;
    }

    /**
     * Sets the value of the nakDost property.
     * 
     */
    public void setNakDost(boolean value) {
        this.nakDost = value;
    }

    /**
     * Gets the value of the paragonBrRac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagonBrRac() {
        return paragonBrRac;
    }

    /**
     * Sets the value of the paragonBrRac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagonBrRac(String value) {
        this.paragonBrRac = value;
    }

    /**
     * Gets the value of the specNamj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecNamj() {
        return specNamj;
    }

    /**
     * Sets the value of the specNamj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecNamj(String value) {
        this.specNamj = value;
    }

}
