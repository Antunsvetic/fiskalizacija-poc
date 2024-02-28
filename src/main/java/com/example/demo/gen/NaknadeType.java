
package com.example.demo.gen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaknadeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NaknadeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Naknada" type="{http://www.apis-it.hr/fin/2012/types/f73}NaknadaType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaknadeType", propOrder = {
    "naknada"
})
public class NaknadeType {

    @XmlElement(name = "Naknada", required = true)
    protected List<NaknadaType> naknada;

    /**
     * Gets the value of the naknada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the naknada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaknada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaknadaType }
     * 
     * 
     * @return
     *     The value of the naknada property.
     */
    public List<NaknadaType> getNaknada() {
        if (naknada == null) {
            naknada = new ArrayList<>();
        }
        return this.naknada;
    }

}
