
package com.example.demo.gen;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OznakaSlijednostiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OznakaSlijednostiType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="N"/>
 *     <enumeration value="P"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OznakaSlijednostiType")
@XmlEnum
public enum OznakaSlijednostiType {

    N,
    P;

    public String value() {
        return name();
    }

    public static OznakaSlijednostiType fromValue(String v) {
        return valueOf(v);
    }

}
