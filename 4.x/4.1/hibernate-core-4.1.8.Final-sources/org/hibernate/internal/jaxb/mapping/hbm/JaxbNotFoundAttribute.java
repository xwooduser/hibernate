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
 * <p>Java class for not-found-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="not-found-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="exception"/>
 *     &lt;enumeration value="ignore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "not-found-attribute")
@XmlEnum
public enum JaxbNotFoundAttribute {

    @XmlEnumValue("exception")
    EXCEPTION("exception"),
    @XmlEnumValue("ignore")
    IGNORE("ignore");
    private final String value;

    JaxbNotFoundAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbNotFoundAttribute fromValue(String v) {
        for (JaxbNotFoundAttribute c: JaxbNotFoundAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
