//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 02:13:06 AM EDT 
//


package org.hibernate.internal.jaxb.mapping.orm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temporal-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="temporal-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="TIMESTAMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "temporal-type")
@XmlEnum
public enum JaxbTemporalType {

    DATE,
    TIME,
    TIMESTAMP;

    public String value() {
        return name();
    }

    public static JaxbTemporalType fromValue(String v) {
        return valueOf(v);
    }

}
