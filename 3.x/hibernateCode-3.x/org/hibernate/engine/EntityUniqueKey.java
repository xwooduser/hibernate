//$Id: EntityUniqueKey.java,v 1.7 2005/05/11 22:12:16 oneovthafew Exp $
package org.hibernate.engine;

import org.hibernate.EntityMode;
import org.hibernate.pretty.MessageHelper;
import org.hibernate.type.Type;

/**
 * @author Gavin King
 */
public class EntityUniqueKey {
	private final String uniqueKeyName;
	private final String entityName;
	private final Object key;
	private final Type keyType;
	private final EntityMode entityMode;
	private final int hashCode;
	
	public EntityUniqueKey(
			final String entityName, 
			final String uniqueKeyName, 
			final Object semiResolvedKey,
			final Type keyType,
			final EntityMode entityMode, 
			final SessionFactoryImplementor factory
	) {
		this.uniqueKeyName = uniqueKeyName;
		this.entityName = entityName;
		this.key = semiResolvedKey;
		this.keyType = keyType.getSemiResolvedType(factory);
		this.entityMode = entityMode;
		this.hashCode = getHashCode(factory);
	}

	public String getEntityName() {
		return entityName;
	}

	public Object getKey() {
		return key;
	}

	public String getUniqueKeyName() {
		return uniqueKeyName;
	}
	
	public int getHashCode(SessionFactoryImplementor factory) {
		int result = 17;
		result = 37 * result + entityName.hashCode();
		result = 37 * result + uniqueKeyName.hashCode();
		result = 37 * result + keyType.getHashCode(key, entityMode, factory);
		return result;
	}
	
	public int hashCode() {
		return hashCode;
	}
	
	public boolean equals(Object other) {
		EntityUniqueKey that = (EntityUniqueKey) other;
		return that.entityName.equals(entityName) &&
			that.uniqueKeyName.equals(uniqueKeyName) &&
			keyType.isEqual(that.key, key, entityMode);
	}
	
	public String toString() {
		return "EntityUniqueKey" + MessageHelper.infoString(entityName, uniqueKeyName, key);
	}
}
