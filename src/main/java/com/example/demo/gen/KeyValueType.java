
package com.example.demo.gen;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for KeyValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyValueType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}DSAKeyValue"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}RSAKeyValue"/>
 *         <any processContents='lax' namespace='##other'/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueType", namespace = "http://www.w3.org/2000/09/xmldsig#", propOrder = {
    "content"
})
public class KeyValueType {

    @XmlElementRefs({
        @XmlElementRef(name = "DSAKeyValue", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RSAKeyValue", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}
     * {@link Object }
     * {@link String }
     * {@link Element }
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

}
