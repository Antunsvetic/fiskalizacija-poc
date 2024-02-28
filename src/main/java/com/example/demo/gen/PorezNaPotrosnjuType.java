
package com.example.demo.gen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PorezNaPotrosnjuType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PorezNaPotrosnjuType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Porez" type="{http://www.apis-it.hr/fin/2012/types/f73}PorezType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorezNaPotrosnjuType", propOrder = {
    "porez"
})
public class PorezNaPotrosnjuType {

    @XmlElement(name = "Porez", required = true)
    protected List<PorezType> porez;

    /**
     * Gets the value of the porez property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the porez property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPorez().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PorezType }
     * 
     * 
     * @return
     *     The value of the porez property.
     */
    public List<PorezType> getPorez() {
        if (porez == null) {
            porez = new ArrayList<>();
        }
        return this.porez;
    }

}
