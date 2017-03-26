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
 *                 @Target({TYPE}) @Retention(RUNTIME) public @interface SqlResultSetMapping {
 *                 }
 *                 String name(); EntityResult[] entities() default {}; ColumnResult[] columns() default {};
 *             
 * 
 * <p>Java class for sql-result-set-mapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sql-result-set-mapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entity-result" type="{http://java.sun.com/xml/ns/persistence/orm}entity-result" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="column-result" type="{http://java.sun.com/xml/ns/persistence/orm}column-result" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sql-result-set-mapping", propOrder = {
    "description",
    "entityResult",
    "columnResult"
})
public class JaxbSqlResultSetMapping {

    protected String description;
    @XmlElement(name = "entity-result")
    protected List<JaxbEntityResult> entityResult;
    @XmlElement(name = "column-result")
    protected List<JaxbColumnResult> columnResult;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the entityResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbEntityResult }
     * 
     * 
     */
    public List<JaxbEntityResult> getEntityResult() {
        if (entityResult == null) {
            entityResult = new ArrayList<JaxbEntityResult>();
        }
        return this.entityResult;
    }

    /**
     * Gets the value of the columnResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbColumnResult }
     * 
     * 
     */
    public List<JaxbColumnResult> getColumnResult() {
        if (columnResult == null) {
            columnResult = new ArrayList<JaxbColumnResult>();
        }
        return this.columnResult;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
