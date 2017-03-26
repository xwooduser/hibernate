//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 02:13:06 AM EDT 
//


package org.hibernate.internal.jaxb.mapping.orm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 @Target({}) @Retention(RUNTIME) public @interface EntityResult {
 *                 }
 *                 Class entityClass(); FieldResult[] fields() default {}; String discriminatorColumn() default "";
 *             
 * 
 * <p>Java class for entity-result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity-result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field-result" type="{http://java.sun.com/xml/ns/persistence/orm}field-result" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entity-class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discriminator-column" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity-result", propOrder = {
    "fieldResult"
})
public class JaxbEntityResult {

    @XmlElement(name = "field-result")
    protected List<JaxbFieldResult> fieldResult;
    @XmlAttribute(name = "entity-class", required = true)
    protected String entityClass;
    @XmlAttribute(name = "discriminator-column")
    protected String discriminatorColumn;

    /**
     * Gets the value of the fieldResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbFieldResult }
     * 
     * 
     */
    public List<JaxbFieldResult> getFieldResult() {
        if (fieldResult == null) {
            fieldResult = new ArrayList<JaxbFieldResult>();
        }
        return this.fieldResult;
    }

    /**
     * Gets the value of the entityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityClass() {
        return entityClass;
    }

    /**
     * Sets the value of the entityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityClass(String value) {
        this.entityClass = value;
    }

    /**
     * Gets the value of the discriminatorColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminatorColumn() {
        return discriminatorColumn;
    }

    /**
     * Sets the value of the discriminatorColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminatorColumn(String value) {
        this.discriminatorColumn = value;
    }

}
