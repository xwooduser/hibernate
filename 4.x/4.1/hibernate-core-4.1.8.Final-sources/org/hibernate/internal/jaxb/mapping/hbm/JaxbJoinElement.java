//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 02:13:05 AM EDT 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for join-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="join-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.hibernate.org/xsd/hibernate-mapping}key-element"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="property" type="{http://www.hibernate.org/xsd/hibernate-mapping}property-element"/>
 *           &lt;element name="many-to-one" type="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-one-element"/>
 *           &lt;element name="component" type="{http://www.hibernate.org/xsd/hibernate-mapping}component-element"/>
 *           &lt;element name="dynamic-component" type="{http://www.hibernate.org/xsd/hibernate-mapping}dynamic-component-element"/>
 *           &lt;element name="any" type="{http://www.hibernate.org/xsd/hibernate-mapping}any-element"/>
 *         &lt;/choice>
 *         &lt;element name="sql-insert" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-insert-element" minOccurs="0"/>
 *         &lt;element name="sql-update" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-update-element" minOccurs="0"/>
 *         &lt;element name="sql-delete" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete-element" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fetch" type="{http://www.hibernate.org/xsd/hibernate-mapping}fetch-attribute" default="join" />
 *       &lt;attribute name="inverse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="table" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "join-element", propOrder = {
    "subselect",
    "comment",
    "key",
    "propertyOrManyToOneOrComponent",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete"
})
public class JaxbJoinElement {

    protected String subselect;
    protected String comment;
    @XmlElement(required = true)
    protected JaxbKeyElement key;
    @XmlElements({
        @XmlElement(name = "many-to-one", type = JaxbManyToOneElement.class),
        @XmlElement(name = "component", type = JaxbComponentElement.class),
        @XmlElement(name = "property", type = JaxbPropertyElement.class),
        @XmlElement(name = "dynamic-component", type = JaxbDynamicComponentElement.class),
        @XmlElement(name = "any", type = JaxbAnyElement.class)
    })
    protected List<Object> propertyOrManyToOneOrComponent;
    @XmlElement(name = "sql-insert")
    protected JaxbSqlInsertElement sqlInsert;
    @XmlElement(name = "sql-update")
    protected JaxbSqlUpdateElement sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected JaxbSqlDeleteElement sqlDelete;
    @XmlAttribute
    protected String catalog;
    @XmlAttribute
    protected JaxbFetchAttribute fetch;
    @XmlAttribute
    protected Boolean inverse;
    @XmlAttribute
    protected Boolean optional;
    @XmlAttribute
    protected String schema;
    @XmlAttribute(name = "subselect")
    protected String subselectAttribute;
    @XmlAttribute(required = true)
    protected String table;

    /**
     * Gets the value of the subselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Sets the value of the subselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbKeyElement }
     *     
     */
    public JaxbKeyElement getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbKeyElement }
     *     
     */
    public void setKey(JaxbKeyElement value) {
        this.key = value;
    }

    /**
     * Gets the value of the propertyOrManyToOneOrComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbManyToOneElement }
     * {@link JaxbComponentElement }
     * {@link JaxbPropertyElement }
     * {@link JaxbDynamicComponentElement }
     * {@link JaxbAnyElement }
     * 
     * 
     */
    public List<Object> getPropertyOrManyToOneOrComponent() {
        if (propertyOrManyToOneOrComponent == null) {
            propertyOrManyToOneOrComponent = new ArrayList<Object>();
        }
        return this.propertyOrManyToOneOrComponent;
    }

    /**
     * Gets the value of the sqlInsert property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlInsertElement }
     *     
     */
    public JaxbSqlInsertElement getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Sets the value of the sqlInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlInsertElement }
     *     
     */
    public void setSqlInsert(JaxbSqlInsertElement value) {
        this.sqlInsert = value;
    }

    /**
     * Gets the value of the sqlUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlUpdateElement }
     *     
     */
    public JaxbSqlUpdateElement getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Sets the value of the sqlUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlUpdateElement }
     *     
     */
    public void setSqlUpdate(JaxbSqlUpdateElement value) {
        this.sqlUpdate = value;
    }

    /**
     * Gets the value of the sqlDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlDeleteElement }
     *     
     */
    public JaxbSqlDeleteElement getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Sets the value of the sqlDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlDeleteElement }
     *     
     */
    public void setSqlDelete(JaxbSqlDeleteElement value) {
        this.sqlDelete = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbFetchAttribute }
     *     
     */
    public JaxbFetchAttribute getFetch() {
        if (fetch == null) {
            return JaxbFetchAttribute.JOIN;
        } else {
            return fetch;
        }
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbFetchAttribute }
     *     
     */
    public void setFetch(JaxbFetchAttribute value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the inverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInverse() {
        if (inverse == null) {
            return false;
        } else {
            return inverse;
        }
    }

    /**
     * Sets the value of the inverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverse(Boolean value) {
        this.inverse = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptional() {
        if (optional == null) {
            return false;
        } else {
            return optional;
        }
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
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the subselectAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselectAttribute() {
        return subselectAttribute;
    }

    /**
     * Sets the value of the subselectAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselectAttribute(String value) {
        this.subselectAttribute = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

}
