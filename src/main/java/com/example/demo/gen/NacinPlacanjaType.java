
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NacinPlacanjaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NacinPlacanjaType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="G"/>
 *     <enumeration value="K"/>
 *     <enumeration value="C"/>
 *     <enumeration value="T"/>
 *     <enumeration value="O"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NacinPlacanjaType")
@XmlEnum
public enum NacinPlacanjaType {

    G,
    K,
    C,
    T,
    O;

    public String value() {
        return name();
    }

    public static NacinPlacanjaType fromValue(String v) {
        return valueOf(v);
    }

}
