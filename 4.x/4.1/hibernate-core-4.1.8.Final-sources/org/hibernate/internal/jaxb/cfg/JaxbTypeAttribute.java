//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 02:13:04 AM EDT 
//


package org.hibernate.internal.jaxb.cfg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="type-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="auto-flush"/>
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="create-onflush"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="dirty-check"/>
 *     &lt;enumeration value="evict"/>
 *     &lt;enumeration value="flush"/>
 *     &lt;enumeration value="flush-entity"/>
 *     &lt;enumeration value="load"/>
 *     &lt;enumeration value="load-collection"/>
 *     &lt;enumeration value="lock"/>
 *     &lt;enumeration value="merge"/>
 *     &lt;enumeration value="post-collection-recreate"/>
 *     &lt;enumeration value="post-collection-remove"/>
 *     &lt;enumeration value="post-collection-update"/>
 *     &lt;enumeration value="post-commit-delete"/>
 *     &lt;enumeration value="post-commit-insert"/>
 *     &lt;enumeration value="post-commit-update"/>
 *     &lt;enumeration value="post-delete"/>
 *     &lt;enumeration value="post-insert"/>
 *     &lt;enumeration value="post-load"/>
 *     &lt;enumeration value="post-update"/>
 *     &lt;enumeration value="pre-collection-recreate"/>
 *     &lt;enumeration value="pre-collection-remove"/>
 *     &lt;enumeration value="pre-collection-update"/>
 *     &lt;enumeration value="pre-delete"/>
 *     &lt;enumeration value="pre-insert"/>
 *     &lt;enumeration value="pre-load"/>
 *     &lt;enumeration value="pre-update"/>
 *     &lt;enumeration value="refresh"/>
 *     &lt;enumeration value="replicate"/>
 *     &lt;enumeration value="save"/>
 *     &lt;enumeration value="save-update"/>
 *     &lt;enumeration value="update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "type-attribute")
@XmlEnum
public enum JaxbTypeAttribute {

    @XmlEnumValue("auto-flush")
    AUTO_FLUSH("auto-flush"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("create-onflush")
    CREATE_ONFLUSH("create-onflush"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("dirty-check")
    DIRTY_CHECK("dirty-check"),
    @XmlEnumValue("evict")
    EVICT("evict"),
    @XmlEnumValue("flush")
    FLUSH("flush"),
    @XmlEnumValue("flush-entity")
    FLUSH_ENTITY("flush-entity"),
    @XmlEnumValue("load")
    LOAD("load"),
    @XmlEnumValue("load-collection")
    LOAD_COLLECTION("load-collection"),
    @XmlEnumValue("lock")
    LOCK("lock"),
    @XmlEnumValue("merge")
    MERGE("merge"),
    @XmlEnumValue("post-collection-recreate")
    POST_COLLECTION_RECREATE("post-collection-recreate"),
    @XmlEnumValue("post-collection-remove")
    POST_COLLECTION_REMOVE("post-collection-remove"),
    @XmlEnumValue("post-collection-update")
    POST_COLLECTION_UPDATE("post-collection-update"),
    @XmlEnumValue("post-commit-delete")
    POST_COMMIT_DELETE("post-commit-delete"),
    @XmlEnumValue("post-commit-insert")
    POST_COMMIT_INSERT("post-commit-insert"),
    @XmlEnumValue("post-commit-update")
    POST_COMMIT_UPDATE("post-commit-update"),
    @XmlEnumValue("post-delete")
    POST_DELETE("post-delete"),
    @XmlEnumValue("post-insert")
    POST_INSERT("post-insert"),
    @XmlEnumValue("post-load")
    POST_LOAD("post-load"),
    @XmlEnumValue("post-update")
    POST_UPDATE("post-update"),
    @XmlEnumValue("pre-collection-recreate")
    PRE_COLLECTION_RECREATE("pre-collection-recreate"),
    @XmlEnumValue("pre-collection-remove")
    PRE_COLLECTION_REMOVE("pre-collection-remove"),
    @XmlEnumValue("pre-collection-update")
    PRE_COLLECTION_UPDATE("pre-collection-update"),
    @XmlEnumValue("pre-delete")
    PRE_DELETE("pre-delete"),
    @XmlEnumValue("pre-insert")
    PRE_INSERT("pre-insert"),
    @XmlEnumValue("pre-load")
    PRE_LOAD("pre-load"),
    @XmlEnumValue("pre-update")
    PRE_UPDATE("pre-update"),
    @XmlEnumValue("refresh")
    REFRESH("refresh"),
    @XmlEnumValue("replicate")
    REPLICATE("replicate"),
    @XmlEnumValue("save")
    SAVE("save"),
    @XmlEnumValue("save-update")
    SAVE_UPDATE("save-update"),
    @XmlEnumValue("update")
    UPDATE("update");
    private final String value;

    JaxbTypeAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbTypeAttribute fromValue(String v) {
        for (JaxbTypeAttribute c: JaxbTypeAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
