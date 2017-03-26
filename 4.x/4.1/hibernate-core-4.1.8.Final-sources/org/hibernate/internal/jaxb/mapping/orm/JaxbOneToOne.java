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
 *                 @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface OneToOne {
 *                 }
 *                 Class targetEntity() default void.class; CascadeType[] cascade() default {}; FetchType fetch() default
 *                 EAGER;
 *                 boolean optional() default true;
 *                 String mappedBy() default ""; boolean orphanRemoval() default false;
 *             
 * 
 * <p>Java class for one-to-one complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="one-to-one">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="primary-key-join-column" type="{http://java.sun.com/xml/ns/persistence/orm}primary-key-join-column" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="join-column" type="{http://java.sun.com/xml/ns/persistence/orm}join-column" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="join-table" type="{http://java.sun.com/xml/ns/persistence/orm}join-table" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="cascade" type="{http://java.sun.com/xml/ns/persistence/orm}cascade-type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="target-entity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fetch" type="{http://java.sun.com/xml/ns/persistence/orm}fetch-type" />
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" />
 *       &lt;attribute name="mapped-by" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orphan-removal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maps-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "one-to-one", propOrder = {
    "primaryKeyJoinColumn",
    "joinColumn",
    "joinTable",
    "cascade"
})
public class JaxbOneToOne {

    @XmlElement(name = "primary-key-join-column")
    protected List<JaxbPrimaryKeyJoinColumn> primaryKeyJoinColumn;
    @XmlElement(name = "join-column")
    protected List<JaxbJoinColumn> joinColumn;
    @XmlElement(name = "join-table")
    protected JaxbJoinTable joinTable;
    protected JaxbCascadeType cascade;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(name = "target-entity")
    protected String targetEntity;
    @XmlAttribute
    protected JaxbFetchType fetch;
    @XmlAttribute
    protected Boolean optional;
    @XmlAttribute
    protected JaxbAccessType access;
    @XmlAttribute(name = "mapped-by")
    protected String mappedBy;
    @XmlAttribute(name = "orphan-removal")
    protected Boolean orphanRemoval;
    @XmlAttribute(name = "maps-id")
    protected String mapsId;
    @XmlAttribute
    protected Boolean id;

    /**
     * Gets the value of the primaryKeyJoinColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryKeyJoinColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryKeyJoinColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbPrimaryKeyJoinColumn }
     * 
     * 
     */
    public List<JaxbPrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
        if (primaryKeyJoinColumn == null) {
            primaryKeyJoinColumn = new ArrayList<JaxbPrimaryKeyJoinColumn>();
        }
        return this.primaryKeyJoinColumn;
    }

    /**
     * Gets the value of the joinColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the joinColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbJoinColumn }
     * 
     * 
     */
    public List<JaxbJoinColumn> getJoinColumn() {
        if (joinColumn == null) {
            joinColumn = new ArrayList<JaxbJoinColumn>();
        }
        return this.joinColumn;
    }

    /**
     * Gets the value of the joinTable property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbJoinTable }
     *     
     */
    public JaxbJoinTable getJoinTable() {
        return joinTable;
    }

    /**
     * Sets the value of the joinTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbJoinTable }
     *     
     */
    public void setJoinTable(JaxbJoinTable value) {
        this.joinTable = value;
    }

    /**
     * Gets the value of the cascade property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbCascadeType }
     *     
     */
    public JaxbCascadeType getCascade() {
        return cascade;
    }

    /**
     * Sets the value of the cascade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbCascadeType }
     *     
     */
    public void setCascade(JaxbCascadeType value) {
        this.cascade = value;
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

    /**
     * Gets the value of the targetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntity() {
        return targetEntity;
    }

    /**
     * Sets the value of the targetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntity(String value) {
        this.targetEntity = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbFetchType }
     *     
     */
    public JaxbFetchType getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbFetchType }
     *     
     */
    public void setFetch(JaxbFetchType value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptional(Boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbAccessType }
     *     
     */
    public JaxbAccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbAccessType }
     *     
     */
    public void setAccess(JaxbAccessType value) {
        this.access = value;
    }

    /**
     * Gets the value of the mappedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedBy() {
        return mappedBy;
    }

    /**
     * Sets the value of the mappedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedBy(String value) {
        this.mappedBy = value;
    }

    /**
     * Gets the value of the orphanRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrphanRemoval() {
        return orphanRemoval;
    }

    /**
     * Sets the value of the orphanRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrphanRemoval(Boolean value) {
        this.orphanRemoval = value;
    }

    /**
     * Gets the value of the mapsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapsId() {
        return mapsId;
    }

    /**
     * Sets the value of the mapsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapsId(String value) {
        this.mapsId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setId(Boolean value) {
        this.id = value;
    }

}
