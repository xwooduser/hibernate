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
 * <p>Java class for union-subclass-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="union-subclass-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meta" type="{http://www.hibernate.org/xsd/hibernate-mapping}meta-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronize" type="{http://www.hibernate.org/xsd/hibernate-mapping}synchronize-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuplizer" type="{http://www.hibernate.org/xsd/hibernate-mapping}tuplizer-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="property" type="{http://www.hibernate.org/xsd/hibernate-mapping}property-element"/>
 *           &lt;element name="many-to-one" type="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-one-element"/>
 *           &lt;element name="one-to-one" type="{http://www.hibernate.org/xsd/hibernate-mapping}one-to-one-element"/>
 *           &lt;element name="component" type="{http://www.hibernate.org/xsd/hibernate-mapping}component-element"/>
 *           &lt;element name="dynamic-component" type="{http://www.hibernate.org/xsd/hibernate-mapping}dynamic-component-element"/>
 *           &lt;element name="properties" type="{http://www.hibernate.org/xsd/hibernate-mapping}properties-element"/>
 *           &lt;element name="any" type="{http://www.hibernate.org/xsd/hibernate-mapping}any-element"/>
 *           &lt;element name="map" type="{http://www.hibernate.org/xsd/hibernate-mapping}map-element"/>
 *           &lt;element name="set" type="{http://www.hibernate.org/xsd/hibernate-mapping}set-element"/>
 *           &lt;element name="list" type="{http://www.hibernate.org/xsd/hibernate-mapping}list-element"/>
 *           &lt;element name="bag" type="{http://www.hibernate.org/xsd/hibernate-mapping}bag-element"/>
 *           &lt;element name="idbag" type="{http://www.hibernate.org/xsd/hibernate-mapping}idbag-element"/>
 *           &lt;element name="array" type="{http://www.hibernate.org/xsd/hibernate-mapping}array-element"/>
 *           &lt;element name="primitive-array" type="{http://www.hibernate.org/xsd/hibernate-mapping}primitive-array-element"/>
 *         &lt;/choice>
 *         &lt;element name="union-subclass" type="{http://www.hibernate.org/xsd/hibernate-mapping}union-subclass-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loader" type="{http://www.hibernate.org/xsd/hibernate-mapping}loader-element" minOccurs="0"/>
 *         &lt;element name="sql-insert" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-insert-element" minOccurs="0"/>
 *         &lt;element name="sql-update" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-update-element" minOccurs="0"/>
 *         &lt;element name="sql-delete" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete-element" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://www.hibernate.org/xsd/hibernate-mapping}filter-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fetch-profile" type="{http://www.hibernate.org/xsd/hibernate-mapping}fetch-profile-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultset" type="{http://www.hibernate.org/xsd/hibernate-mapping}resultset-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="query" type="{http://www.hibernate.org/xsd/hibernate-mapping}query-element"/>
 *           &lt;element name="sql-query" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-query-element"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="batch-size" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dynamic-insert" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="dynamic-update" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extends" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lazy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="persister" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="select-before-update" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "union-subclass-element", propOrder = {
    "meta",
    "subselect",
    "synchronize",
    "comment",
    "tuplizer",
    "propertyOrManyToOneOrOneToOne",
    "unionSubclass",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "filter",
    "fetchProfile",
    "resultset",
    "queryOrSqlQuery"
})
public class JaxbUnionSubclassElement implements SubEntityElement
{

    protected List<JaxbMetaElement> meta;
    protected String subselect;
    protected List<JaxbSynchronizeElement> synchronize;
    protected String comment;
    protected List<JaxbTuplizerElement> tuplizer;
    @XmlElements({
        @XmlElement(name = "many-to-one", type = JaxbManyToOneElement.class),
        @XmlElement(name = "list", type = JaxbListElement.class),
        @XmlElement(name = "idbag", type = JaxbIdbagElement.class),
        @XmlElement(name = "one-to-one", type = JaxbOneToOneElement.class),
        @XmlElement(name = "map", type = JaxbMapElement.class),
        @XmlElement(name = "component", type = JaxbComponentElement.class),
        @XmlElement(name = "properties", type = JaxbPropertiesElement.class),
        @XmlElement(name = "array", type = JaxbArrayElement.class),
        @XmlElement(name = "set", type = JaxbSetElement.class),
        @XmlElement(name = "any", type = JaxbAnyElement.class),
        @XmlElement(name = "bag", type = JaxbBagElement.class),
        @XmlElement(name = "property", type = JaxbPropertyElement.class),
        @XmlElement(name = "dynamic-component", type = JaxbDynamicComponentElement.class),
        @XmlElement(name = "primitive-array", type = JaxbPrimitiveArrayElement.class)
    })
    protected List<Object> propertyOrManyToOneOrOneToOne;
    @XmlElement(name = "union-subclass")
    protected List<JaxbUnionSubclassElement> unionSubclass;
    protected JaxbLoaderElement loader;
    @XmlElement(name = "sql-insert")
    protected JaxbSqlInsertElement sqlInsert;
    @XmlElement(name = "sql-update")
    protected JaxbSqlUpdateElement sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected JaxbSqlDeleteElement sqlDelete;
    protected List<JaxbFilterElement> filter;
    @XmlElement(name = "fetch-profile")
    protected List<JaxbFetchProfileElement> fetchProfile;
    protected List<JaxbResultsetElement> resultset;
    @XmlElements({
        @XmlElement(name = "sql-query", type = JaxbSqlQueryElement.class),
        @XmlElement(name = "query", type = JaxbQueryElement.class)
    })
    protected List<Object> queryOrSqlQuery;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "batch-size")
    protected String batchSize;
    @XmlAttribute
    protected String catalog;
    @XmlAttribute
    protected String check;
    @XmlAttribute(name = "dynamic-insert")
    protected Boolean dynamicInsert;
    @XmlAttribute(name = "dynamic-update")
    protected Boolean dynamicUpdate;
    @XmlAttribute(name = "entity-name")
    protected String entityName;
    @XmlAttribute(name = "extends")
    protected String _extends;
    @XmlAttribute
    protected Boolean lazy;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String node;
    @XmlAttribute
    protected String persister;
    @XmlAttribute
    protected String proxy;
    @XmlAttribute
    protected String schema;
    @XmlAttribute(name = "select-before-update")
    protected Boolean selectBeforeUpdate;
    @XmlAttribute(name = "subselect")
    protected String subselectAttribute;
    @XmlAttribute
    protected String table;

    /**
     * Gets the value of the meta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbMetaElement }
     * 
     * 
     */
    public List<JaxbMetaElement> getMeta() {
        if (meta == null) {
            meta = new ArrayList<JaxbMetaElement>();
        }
        return this.meta;
    }

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
     * Gets the value of the synchronize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbSynchronizeElement }
     * 
     * 
     */
    public List<JaxbSynchronizeElement> getSynchronize() {
        if (synchronize == null) {
            synchronize = new ArrayList<JaxbSynchronizeElement>();
        }
        return this.synchronize;
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
     * Gets the value of the tuplizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbTuplizerElement }
     * 
     * 
     */
    public List<JaxbTuplizerElement> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<JaxbTuplizerElement>();
        }
        return this.tuplizer;
    }

    /**
     * Gets the value of the propertyOrManyToOneOrOneToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrOneToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrOneToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbManyToOneElement }
     * {@link JaxbListElement }
     * {@link JaxbIdbagElement }
     * {@link JaxbOneToOneElement }
     * {@link JaxbMapElement }
     * {@link JaxbComponentElement }
     * {@link JaxbPropertiesElement }
     * {@link JaxbArrayElement }
     * {@link JaxbSetElement }
     * {@link JaxbAnyElement }
     * {@link JaxbBagElement }
     * {@link JaxbPropertyElement }
     * {@link JaxbDynamicComponentElement }
     * {@link JaxbPrimitiveArrayElement }
     * 
     * 
     */
    public List<Object> getPropertyOrManyToOneOrOneToOne() {
        if (propertyOrManyToOneOrOneToOne == null) {
            propertyOrManyToOneOrOneToOne = new ArrayList<Object>();
        }
        return this.propertyOrManyToOneOrOneToOne;
    }

    /**
     * Gets the value of the unionSubclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unionSubclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnionSubclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbUnionSubclassElement }
     * 
     * 
     */
    public List<JaxbUnionSubclassElement> getUnionSubclass() {
        if (unionSubclass == null) {
            unionSubclass = new ArrayList<JaxbUnionSubclassElement>();
        }
        return this.unionSubclass;
    }

    /**
     * Gets the value of the loader property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbLoaderElement }
     *     
     */
    public JaxbLoaderElement getLoader() {
        return loader;
    }

    /**
     * Sets the value of the loader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbLoaderElement }
     *     
     */
    public void setLoader(JaxbLoaderElement value) {
        this.loader = value;
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
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbFilterElement }
     * 
     * 
     */
    public List<JaxbFilterElement> getFilter() {
        if (filter == null) {
            filter = new ArrayList<JaxbFilterElement>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the fetchProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fetchProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFetchProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbFetchProfileElement }
     * 
     * 
     */
    public List<JaxbFetchProfileElement> getFetchProfile() {
        if (fetchProfile == null) {
            fetchProfile = new ArrayList<JaxbFetchProfileElement>();
        }
        return this.fetchProfile;
    }

    /**
     * Gets the value of the resultset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbResultsetElement }
     * 
     * 
     */
    public List<JaxbResultsetElement> getResultset() {
        if (resultset == null) {
            resultset = new ArrayList<JaxbResultsetElement>();
        }
        return this.resultset;
    }

    /**
     * Gets the value of the queryOrSqlQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryOrSqlQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryOrSqlQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbSqlQueryElement }
     * {@link JaxbQueryElement }
     * 
     * 
     */
    public List<Object> getQueryOrSqlQuery() {
        if (queryOrSqlQuery == null) {
            queryOrSqlQuery = new ArrayList<Object>();
        }
        return this.queryOrSqlQuery;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchSize(String value) {
        this.batchSize = value;
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
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(String value) {
        this.check = value;
    }

    /**
     * Gets the value of the dynamicInsert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDynamicInsert() {
        if (dynamicInsert == null) {
            return false;
        } else {
            return dynamicInsert;
        }
    }

    /**
     * Sets the value of the dynamicInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicInsert(Boolean value) {
        this.dynamicInsert = value;
    }

    /**
     * Gets the value of the dynamicUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDynamicUpdate() {
        if (dynamicUpdate == null) {
            return false;
        } else {
            return dynamicUpdate;
        }
    }

    /**
     * Sets the value of the dynamicUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicUpdate(Boolean value) {
        this.dynamicUpdate = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the extends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtends() {
        return _extends;
    }

    /**
     * Sets the value of the extends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtends(String value) {
        this._extends = value;
    }

    /**
     * Gets the value of the lazy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLazy() {
        return lazy;
    }

    /**
     * Sets the value of the lazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLazy(Boolean value) {
        this.lazy = value;
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
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the persister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersister() {
        return persister;
    }

    /**
     * Sets the value of the persister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersister(String value) {
        this.persister = value;
    }

    /**
     * Gets the value of the proxy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * Sets the value of the proxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxy(String value) {
        this.proxy = value;
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
     * Gets the value of the selectBeforeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectBeforeUpdate() {
        if (selectBeforeUpdate == null) {
            return false;
        } else {
            return selectBeforeUpdate;
        }
    }

    /**
     * Sets the value of the selectBeforeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectBeforeUpdate(Boolean value) {
        this.selectBeforeUpdate = value;
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
