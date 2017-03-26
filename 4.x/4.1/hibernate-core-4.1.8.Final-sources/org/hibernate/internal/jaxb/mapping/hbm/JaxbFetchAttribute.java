//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 02:13:05 AM EDT 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetch-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fetch-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="join"/>
 *     &lt;enumeration value="select"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fetch-attribute")
@XmlEnum
public enum JaxbFetchAttribute {

    @XmlEnumValue("join")
    JOIN("join"),
    @XmlEnumValue("select")
    SELECT("select");
    private final String value;

    JaxbFetchAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbFetchAttribute fromValue(String v) {
        for (JaxbFetchAttribute c: JaxbFetchAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}