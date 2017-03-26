
package org.hibernate.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URL;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;
import javax.annotation.Generated;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.transaction.SystemException;
import org.hibernate.cache.CacheException;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.loading.internal.CollectionLoadContext;
import org.hibernate.engine.loading.internal.EntityLoadContext;
import org.hibernate.engine.spi.CollectionKey;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.service.jdbc.dialect.internal.AbstractDialectResolver;
import org.hibernate.service.jndi.JndiNameException;
import org.hibernate.type.BasicType;
import org.hibernate.type.SerializationException;
import org.hibernate.type.Type;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.model.MessageLoggerImplementor", date = "2012-11-01T02:13:10-0400")
public class CoreMessageLogger_$logger
    implements Serializable, CoreMessageLogger, BasicLogger
{

    private final static long serialVersionUID = 1L;
    private final static String projectCode = "HHH";
    private final static String FQCN = CoreMessageLogger_$logger.class.getName();
    protected final Logger log;
    private final static String unableToCloseJar = "Could not close jar: %s";
    private final static String legacyTransactionManagerStrategy = "Encountered legacy TransactionManagerLookup specified; convert to newer %s contract specified via %s setting";
    private final static String usingUuidHexGenerator = "Using %s which does not generate IETF RFC 4122 compliant UUID values; consider using %s instead";
    private final static String logicalConnectionReleasingPhysicalConnection = "Logical connection releasing its physical connection";
    private final static String logicalConnectionClosed = "*** Logical connection closed ***";
    private final static String unableToWrapResultSet = "Error wrapping result set";
    private final static String autoCommitMode = "Autocommit mode: %s";
    private final static String sqlExceptionEscapedProxy = "SQLException escaped proxy";
    private final static String queryCachePuts = "Query cache puts: %s";
    private final static String usingDialect = "Using dialect: %s";
    private final static String unregisteredStatement = "ResultSet's statement was not registered";
    private final static String parsingXmlErrorForFile = "Error parsing XML: %s(%s) %s";
    private final static String jndiInitialContextProperties = "JNDI InitialContext properties:%s";
    private final static String unableToLogSqlWarnings = "Unable to log SQLWarnings : %s";
    private final static String overridingTransactionStrategyDangerous = "Overriding %s is dangerous, this might break the EJB3 specification implementation";
    private final static String jdbcAutoCommitFalseBreaksEjb3Spec = "%s = false breaks the EJB3 specification";
    private final static String narrowingProxy = "Narrowing proxy to %s - this operation breaks ==";
    private final static String honoringOptimizerSetting = "Config specified explicit optimizer of [%s], but [%s=%s; honoring optimizer setting";
    private final static String connectionsObtained = "Connections obtained: %s";
    private final static String javassistEnhancementFailed = "Javassist Enhancement failed: %s";
    private final static String unsupportedInitialValue = "Hibernate does not support SequenceGenerator.initialValue() unless '%s' set";
    private final static String unableToLocateConfigFile = "Unable to locate config file: %s";
    private final static String unableToCloseOutputStream = "IOException occurred closing output stream";
    private final static String deprecatedOracle9Dialect = "The Oracle9Dialect dialect has been deprecated; use either Oracle9iDialect or Oracle10gDialect instead";
    private final static String hydratingEntitiesCount = "On EntityLoadContext#clear, hydratingEntities contained [%s] entries";
    private final static String sessionsOpened = "Sessions opened: %s";
    private final static String disablingContextualLOBCreationSinceConnectionNull = "Disabling contextual LOB creation as connection was null";
    private final static String unableToConstructCurrentSessionContext = "Unable to construct current session context [%s]";
    private final static String schemaUpdateComplete = "Schema update complete";
    private final static String usingStreams = "Using java.io streams to persist binary types";
    private final static String alreadySessionBound = "Already session bound on call to bind(); make sure you clean up your sessions!";
    private final static String disallowingInsertStatementComment = "Disallowing insert statement comment for select-identity due to Oracle driver bug";
    private final static String unableToCreateSchema = "Error creating schema ";
    private final static String loggingStatistics = "Logging statistics....";
    private final static String unableToCreateProxyFactory = "Could not create proxy factory for:%s";
    private final static String timestampCacheHits = "update timestamps cache hits: %s";
    private final static String tableFound = "Table found: %s";
    private final static String invalidOnDeleteAnnotation = "Inapropriate use of @OnDelete on entity, annotation ignored: %s";
    private final static String unableToObjectConnectionToQueryMetadata = "Could not obtain connection to query metadata: %s";
    private final static String duplicateMetadata = "Found more than one <persistence-unit-metadata>, subsequent ignored";
    private final static String orderByAnnotationIndexedCollection = "@OrderBy not allowed for an indexed collection, annotation ignored.";
    private final static String schemaExportComplete = "Schema export complete";
    private final static String unknownOracleVersion = "Unknown Oracle major version [%s]";
    private final static String entitiesFetched = "Entities fetched (minimize this): %s";
    private final static String invalidDiscriminatorAnnotation = "Discriminator column has to be defined in the root entity, it will be ignored in subclass: %s";
    private final static String definingFlushBeforeCompletionIgnoredInHem = "Defining %s=true ignored in HEM";
    private final static String unableToStopService = "Error stopping service [%s] : %s";
    private final static String entityAnnotationOnNonRoot = "@org.hibernate.annotations.Entity used on a non root entity: ignored for %s";
    private final static String secondLevelCachePuts = "Second level cache puts: %s";
    private final static String unknownBytecodeProvider = "unrecognized bytecode provider [%s], using javassist by default";
    private final static String statementsClosed = "Statements closed: %s";
    private final static String connectionProperties = "Connection properties: %s";
    private final static String writingGeneratedSchemaToFile = "Writing generated schema to file: %s";
    private final static String cacheProvider = "Cache provider: %s";
    private final static String unableToRetrieveCache = "Unable to retreive cache from JNDI [%s]: %s";
    private final static String unableToInstantiateUuidGenerationStrategy = "Unable to instantiate UUID generation strategy class : %s";
    private final static String usingDefaultIdGeneratorSegmentValue = "Explicit segment value for id generator [%s.%s] suggested; using default [%s]";
    private final static String unableToObjectConnectionMetadata = "Could not obtain connection metadata: %s";
    private final static String configuringFromFile = "Configuring from file: %s";
    private final static String secondLevelCacheHits = "Second level cache hits: %s";
    private final static String noDefaultConstructor = "No default (no-argument) constructor for class: %s (class must be instantiated by Interceptor)";
    private final static String unableToReleaseCreatedMBeanServer = "Unable to release created MBeanServer : %s";
    private final static String unableToPerformJdbcCommit = "JDBC commit failed";
    private final static String collectionsFetched = "Collections fetched (minimize this): %s";
    private final static String unableToJoinTransaction = "Cannot join transaction: do not override %s";
    private final static String jdbcUrlNotSpecified = "JDBC URL was not specified by property %s";
    private final static String unableToCloseStreamError = "Could not close stream on hibernate.properties: %s";
    private final static String unableToObtainInitialContext = "Could not obtain initial context";
    private final static String unableToRetrieveTypeInfoResultSet = "Unable to retrieve type info result set : %s";
    private final static String unableToTransformClass = "Unable to transform class: %s";
    private final static String parsingXmlError = "Error parsing XML (%s) : %s";
    private final static String duplicateListener = "entity-listener duplication, first event definition will be used: %s";
    private final static String unableToConstructSqlExceptionConverter = "Unable to construct instance of specified SQLExceptionConverter : %s";
    private final static String secondLevelCacheMisses = "Second level cache misses: %s";
    private final static String unregisteredResultSetWithoutStatement = "ResultSet had no statement associated with it, but was not yet registered";
    private final static String loadingCollectionKeyNotFound = "In CollectionLoadContext#endLoadingCollections, localLoadingCollectionKeys contained [%s], but no LoadingCollectionEntry was found in loadContexts";
    private final static String forcingTableUse = "Forcing table use for sequence-style generator due to pooled optimizer selection where db does not support pooled sequences";
    private final static String disablingContextualLOBCreation = "Disabling contextual LOB creation as %s is true";
    private final static String unableToReleaseBatchStatement = "Unable to release batch statement...";
    private final static String collectionsLoaded = "Collections loaded: %s";
    private final static String jdbcDriverNotSpecified = "No JDBC Driver class was specified by property %s";
    private final static String unexpectedRowCounts = "JDBC driver did not return the expected number of row counts";
    private final static String stoppingService = "Stopping service";
    private final static String unableToCleanUpPreparedStatement = "Unable to clean up prepared statement";
    private final static String foreignKeys = "Foreign keys: %s";
    private final static String timestampCacheMisses = "update timestamps cache misses: %s";
    private final static String writeLocksNotSupported = "Write locks via update not supported for non-versioned entities [%s]";
    private final static String expectedType = "Expected type: %s, actual value: %s";
    private final static String schemaExportUnsuccessful = "Schema export unsuccessful";
    private final static String deprecatedForceDescriminatorAnnotation = "@ForceDiscriminator is deprecated use @DiscriminatorOptions instead.";
    private final static String containsJoinFetchedCollection = "Ignoring bag join fetch [%s] due to prior collection join fetch";
    private final static String jdbcIsolationLevel = "JDBC isolation level: %s";
    private final static String setManagerLookupClass = "You should set hibernate.transaction.manager_lookup_class if cache is enabled";
    private final static String usingDriver = "using driver [%s] at URL [%s]";
    private final static String unableToQueryDatabaseMetadata = "Unable to query java.sql.DatabaseMetaData";
    private final static String unableToCompleteSchemaValidation = "Could not complete schema validation";
    private final static String unableToStopHibernateService = "Exception while stopping service";
    private final static String noAppropriateConnectionProvider = "No appropriate connection provider encountered, assuming application will be supplying connections";
    private final static String unableToSetTransactionToRollbackOnly = "Could not set transaction to rollback only";
    private final static String unableToExecuteResolver = "Error executing resolver [%s] : %s";
    private final static String hsqldbSupportsOnlyReadCommittedIsolation = "HSQLDB supports only READ_UNCOMMITTED isolation";
    private final static String unsupportedProperty = "Usage of obsolete property: %s no longer supported, use: %s";
    private final static String unableToInstantiateOptimizer = "Unable to instantiate specified optimizer [%s], falling back to noop";
    private final static String unableToCloseInitialContext = "Error closing InitialContext [%s]";
    private final static String renamedProperty = "Property [%s] has been renamed to [%s]; update your properties appropriately";
    private final static String entityManagerFactoryAlreadyRegistered = "Entity manager factory name (%s) is already registered.  If entity manager will be clustered or passivated, specify a unique value for property '%s'";
    private final static String configuringFromResource = "Configuring from resource: %s";
    private final static String splitQueries = "Manipulation query [%s] resulted in [%s] split queries";
    private final static String timestampCachePuts = "update timestamps cache puts: %s";
    private final static String startTime = "Start time: %s";
    private final static String unableToInstantiateConfiguredSchemaNameResolver = "Unable to instantiate configured schema name resolver [%s] %s";
    private final static String naturalIdQueriesExecuted = "NaturalId queries executed to database: %s";
    private final static String deprecatedUuidGenerator = "DEPRECATED : use [%s] instead with custom [%s] implementation";
    private final static String preparedStatementAlreadyInBatch = "PreparedStatement was already in the batch, [%s].";
    private final static String invalidSubStrategy = "Mixing inheritance strategy in a entity hierarchy is not allowed, ignoring sub strategy in: %s";
    private final static String noSessionFactoryWithJndiName = "No session factory with JNDI name %s";
    private final static String ignoringUnrecognizedQueryHint = "Ignoring unrecognized query hint [%s]";
    private final static String entitiesInserted = "Entities inserted: %s";
    private final static String runningSchemaValidator = "Running schema validator";
    private final static String creatingSubcontextInfo = "Creating subcontext: %s";
    private final static String jdbcRollbackFailed = "JDBC rollback failed";
    private final static String runningHbm2ddlSchemaExport = "Running hbm2ddl schema export";
    private final static String unableToDestroyCache = "Unable to destroy cache: %s";
    private final static String illegalPropertySetterArgument = "IllegalArgumentException in class: %s, setter method of property: %s";
    private final static String readingMappingsFromFile = "Reading mappings from file: %s";
    private final static String unableToLocateMBeanServer = "Unable to locate MBeanServer on JMX service shutdown";
    private final static String disablingContextualLOBCreationSinceCreateClobFailed = "Disabling contextual LOB creation as createClob() method threw error : %s";
    private final static String entityIdentifierValueBindingExists = "Setting entity-identifier value binding where one already existed : %s.";
    private final static String batchContainedStatementsOnRelease = "On release of batch it still contained JDBC statements";
    private final static String unableToPerformManagedFlush = "Error during managed flush [%s]";
    private final static String immutableAnnotationOnNonRoot = "@Immutable used on a non root entity: ignored for %s";
    private final static String usingReflectionOptimizer = "Using bytecode reflection optimizer";
    private final static String unableToParseMetadata = "Could not parse the package-level metadata [%s]";
    private final static String startingServiceAtJndiName = "Starting service at JNDI name: %s";
    private final static String callingJoinTransactionOnNonJtaEntityManager = "Calling joinTransaction() on a non JTA EntityManager";
    private final static String missingArguments = "Function template anticipated %s arguments, but %s arguments encountered";
    private final static String recognizedObsoleteHibernateNamespace = "Recognized obsolete hibernate namespace %s. Use namespace %s instead. Refer to Hibernate 3.6 Migration Guide!";
    private final static String scopingTypesToSessionFactoryAfterAlreadyScoped = "Scoping types to session factory %s after already scoped %s";
    private final static String missingEntityAnnotation = "Class annotated @org.hibernate.annotations.Entity but not javax.persistence.Entity (most likely a user error): %s";
    private final static String firstOrMaxResultsSpecifiedWithCollectionFetch = "firstResult/maxResults specified with collection fetch; applying in memory!";
    private final static String lazyPropertyFetchingAvailable = "Lazy property fetching available for: %s";
    private final static String readingMappingsFromResource = "Reading mappings from resource: %s";
    private final static String unableToDeserializeCache = "Could not deserialize cache file: %s : %s";
    private final static String cachedFileNotFound = "I/O reported cached file could not be found : %s : %s";
    private final static String queryCacheMisses = "Query cache misses: %s";
    private final static String unableToLocateUuidGenerationStrategy = "Unable to locate requested UUID generation strategy class : %s";
    private final static String entityManagerClosedBySomeoneElse = "Entity Manager closed by someone else (%s must not be used)";
    private final static String disablingContextualLOBCreationSinceOldJdbcVersion = "Disabling contextual LOB creation as JDBC driver reported JDBC version [%s] less than 4";
    private final static String unableToCloseConnection = "Error closing connection";
    private final static String unableToRollbackConnection = "Unable to rollback connection on exception [%s]";
    private final static String foundMappingDocument = "Found mapping document in jar: %s";
    private final static String requiredDifferentProvider = "Required a different provider: %s";
    private final static String unsupportedAfterStatement = "Overriding release mode as connection provider does not support 'after_statement'";
    private final static String duplicateGeneratorTable = "Duplicate generator table: %s";
    private final static String proxoolProviderClassNotFound = "proxool properties were encountered, but the %s provider class was not found on the classpath; these properties are going to be ignored.";
    private final static String naturalIdMaxQueryTime = "Max NaturalId query time: %sms";
    private final static String parsingXmlWarning = "Warning parsing XML (%s) : %s";
    private final static String namingExceptionAccessingFactory = "Naming exception occurred accessing factory: %s";
    private final static String compositeIdClassDoesNotOverrideEquals = "Composite-id class does not override equals(): %s";
    private final static String successfulTransactions = "Successful transactions: %s";
    private final static String naturalIdCacheMisses = "NaturalId cache misses: %s";
    private final static String exceptionHeaderNotFound = "%s No %s found";
    private final static String typeRegistrationOverridesPrevious = "Type registration [%s] overrides previous : %s";
    private final static String warningsCreatingTempTable = "Warnings creating temp table : %s";
    private final static String containerProvidingNullPersistenceUnitRootUrl = "Container is providing a null PersistenceUnitRootUrl: discovery impossible";
    private final static String factoryUnboundFromName = "A factory was unbound from name: %s";
    private final static String collectionsRecreated = "Collections recreated: %s";
    private final static String addingOverrideFor = "Adding override for %s: %s";
    private final static String entitiesUpdated = "Entities updated: %s";
    private final static String runningHbm2ddlSchemaUpdate = "Running hbm2ddl schema update";
    private final static String entitiesDeleted = "Entities deleted: %s";
    private final static String queryCacheHits = "Query cache hits: %s";
    private final static String unableToBuildSessionFactoryUsingMBeanClasspath = "Could not build SessionFactory using the MBean classpath - will try again using client classpath: %s";
    private final static String sessionsClosed = "Sessions closed: %s";
    private final static String unableToAccessEjb3Configuration = "Naming exception occurred accessing Ejb3Configuration";
    private final static String unableToMarkForRollbackOnTransientObjectException = "Unable to mark for rollback on TransientObjectException: ";
    private final static String deprecatedTransactionManagerStrategy = "Using deprecated %s strategy [%s], use newer %s strategy instead [%s]";
    private final static String autoFlushWillNotWork = "JTASessionContext being used with JDBCTransactionFactory; auto-flush will not operate correctly with getCurrentSession()";
    private final static String tableNotFound = "Table not found: %s";
    private final static String usingTimestampWorkaround = "Using workaround for JVM bug in java.sql.Timestamp";
    private final static String namedQueryError = "Error in named query: %s";
    private final static String processEqualityExpression = "processEqualityExpression() : No expression to process!";
    private final static String tooManyInExpressions = "Dialect [%s] limits the number of elements in an IN predicate to %s entries.  However, the given parameter list [%s] contained %s entries, which will likely cause failures to execute the query in the database";
    private final static String unableToAccessTypeInfoResultSet = "Error accessing type info result set : %s";
    private final static String providerClassDeprecated = "%s has been deprecated in favor of %s; that provider will be used instead.";
    private final static String unableToReleaseTypeInfoResultSet = "Unable to release type info result set";
    private final static String rdmsOs2200Dialect = "RDMSOS2200Dialect version: 1.0";
    private final static String unableToDetermineTransactionStatus = "Could not determine transaction status";
    private final static String sortAnnotationIndexedCollection = "@Sort not allowed for an indexed collection, annotation ignored.";
    private final static String unexpectedLiteralTokenType = "Unexpected literal token type [%s] passed for numeric processing";
    private final static String hql = "HQL: %s, time: %sms, rows: %s";
    private final static String exceptionInAfterTransactionCompletionInterceptor = "Exception in interceptor afterTransactionCompletion()";
    private final static String failSafeCollectionsCleanup = "Fail-safe cleanup (collections) : %s";
    private final static String unableToCloseSessionDuringRollback = "Could not close session during rollback";
    private final static String exceptionInBeforeTransactionCompletionInterceptor = "Exception in interceptor beforeTransactionCompletion()";
    private final static String propertiesLoaded = "Loaded properties from resource hibernate.properties: %s";
    private final static String JavaSqlTypesMappedSameCodeMultipleTimes = "java.sql.Types mapped the same code [%s] multiple times; was [%s]; now [%s]";
    private final static String unableToBindValueToParameter = "Could not bind value '%s' to parameter: %s; %s";
    private final static String unableToUpdateQueryHiValue = "Could not updateQuery hi value in: %s";
    private final static String unableToCloseInputStream = "Could not close input stream";
    private final static String unableToReadClass = "Unable to read class: %s";
    private final static String columns = "Columns: %s";
    private final static String persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly = "Persistence provider caller does not implement the EJB3 spec correctly.PersistenceUnitInfo.getNewTempClassLoader() is null.";
    private final static String transactionStrategy = "Transaction strategy: %s";
    private final static String unsupportedMultiTableBulkHqlJpaql = "The %s.%s.%s version of H2 implements temporary table creation such that it commits current transaction; multi-table, bulk hql/jpaql will not work properly";
    private final static String incompleteMappingMetadataCacheProcessing = "Mapping metadata cache was not completely processed";
    private final static String propertyNotFound = "Property %s not found in class but described in <mapping-file/> (possible typo error)";
    private final static String typeDefinedNoRegistrationKeys = "Type [%s] defined no registration keys; ignoring";
    private final static String unableToReleaseCacheLock = "Could not release a cache lock : %s";
    private final static String bytecodeProvider = "Bytecode provider name : %s";
    private final static String subResolverException = "sub-resolver threw unexpected exception, continuing to next : %s";
    private final static String undeterminedH2Version = "Unable to determine H2 database version, certain features may not work";
    private final static String deprecatedOracleDialect = "The OracleDialect dialect has been deprecated; use Oracle8iDialect instead";
    private final static String duplicateImport = "Duplicate import: %s -> %s";
    private final static String serviceProperties = "Service properties: %s";
    private final static String unableToGetDatabaseMetadata = "Could not get database metadata";
    private final static String closing = "Closing";
    private final static String entitiesLoaded = "Entities loaded: %s";
    private final static String unableToLoadDerbyDriver = "Unable to load/access derby driver class sysinfo to check versions : %s";
    private final static String unableToDetermineTransactionStatusAfterCommit = "Could not determine transaction status after commit";
    private final static String unableToRollbackJta = "JTA rollback failed";
    private final static String unableToExecuteBatch = "Exception executing batch [%s]";
    private final static String ignoringTableGeneratorConstraints = "Ignoring unique constraints specified on table generator [%s]";
    private final static String startingQueryCache = "Starting query cache at region: %s";
    private final static String unableToConfigureSqlExceptionConverter = "Unable to configure SQLExceptionConverter : %s";
    private final static String unableToResolveAggregateFunction = "Could not resolve aggregate function [%s]; using standard definition";
    private final static String invalidJndiName = "Invalid JNDI name: %s";
    private final static String unableToBindFactoryToJndi = "Could not bind factory to JNDI";
    private final static String packageNotFound = "Package not found or wo package-info.java: %s";
    private final static String unableToCloseInputStreamForResource = "Could not close input stream for %s";
    private final static String transactionStartedOnNonRootSession = "Transaction started on non-root session";
    private final static String configurationResource = "Configuration resource: %s";
    private final static String maxQueryTime = "Max query time: %sms";
    private final static String indexes = "Indexes: %s";
    private final static String failSafeEntitiesCleanup = "Fail-safe cleanup (entities) : %s";
    private final static String transactions = "Transactions: %s";
    private final static String unableToBindEjb3ConfigurationToJndi = "Could not bind Ejb3Configuration to JNDI";
    private final static String unsupportedOracleVersion = "Oracle 11g is not yet fully supported; using Oracle 10g dialect";
    private final static String gettersOfLazyClassesCannotBeFinal = "Getters of lazy classes cannot be final: %s.%s";
    private final static String unableToCleanUpCallableStatement = "Unable to clean up callable statement";
    private final static String cannotResolveNonNullableTransientDependencies = "Attempting to save one or more entities that have a non-nullable association with an unsaved transient entity. The unsaved transient entity must be saved in an operation prior to saving these dependent entities.\n\tUnsaved transient entity: (%s)\n\tDependent entities: (%s)\n\tNon-nullable association(s): (%s)";
    private final static String unableToReadHiValue = "Could not read a hi value - you need to populate the table: %s";
    private final static String cleaningUpConnectionPool = "Cleaning up connection pool [%s]";
    private final static String duplicateGeneratorName = "Duplicate generator name %s";
    private final static String unableToCloseOutputFile = "Error closing output file: %s";
    private final static String noColumnsSpecifiedForIndex = "There were not column names specified for index %s on table %s";
    private final static String usingAstQueryTranslatorFactory = "Using ASTQueryTranslatorFactory";
    private final static String expired = "An item was expired by the cache while it was locked (increase your cache timeout): %s";
    private final static String unableToObtainConnectionMetadata = "Could not obtain connection metadata : %s";
    private final static String flushes = "Flushes: %s";
    private final static String needsLimit = "FirstResult/maxResults specified on polymorphic query; applying in memory!";
    private final static String startingUpdateTimestampsCache = "Starting update timestamps cache at region: %s";
    private final static String fetchingDatabaseMetadata = "Fetching database metadata";
    private final static String failed = "an assertion failure occured (this may indicate a bug in Hibernate, but is more likely due to unsafe use of the session): %s";
    private final static String unknownSqlServerVersion = "Unknown Microsoft SQL Server major version [%s] using SQL Server 2000 dialect";
    private final static String forcingContainerResourceCleanup = "Forcing container resource cleanup on transaction completion";
    private final static String willNotRegisterListeners = "Property hibernate.search.autoregister_listeners is set to false. No attempt will be made to register Hibernate Search event listeners.";
    private final static String unableToLoadProperties = "Problem loading properties from hibernate.properties";
    private final static String configuredSessionFactory = "Configured SessionFactory: %s";
    private final static String naturalIdCachePuts = "NaturalId cache puts: %s";
    private final static String unableToCleanupTemporaryIdTable = "Unable to cleanup temporary id table after use [%s]";
    private final static String unableToToggleAutoCommit = "Could not toggle autocommit";
    private final static String unableToCommitJta = "JTA commit failed";
    private final static String jaccContextId = "JACC contextID: %s";
    private final static String parameterPositionOccurredAsBothJpaAndHibernatePositionalParameter = "Parameter position [%s] occurred as both JPA and Hibernate positional parameter";
    private final static String version = "Hibernate Core {%s}";
    private final static String unableToReleaseIsolatedConnection = "Unable to release isolated connection [%s]";
    private final static String unableToClosePooledConnection = "Problem closing pooled connection";
    private final static String deprecatedDerbyDialect = "The DerbyDialect dialect has been deprecated; use one of the version-specific dialects instead";
    private final static String unableToCloseInputFiles = "Error closing input files: %s";
    private final static String unableToCopySystemProperties = "Could not copy system properties, system properties will be ignored";
    private final static String unableToDetermineLockModeValue = "Unable to determine lock mode value : %s -> %s";
    private final static String validatorNotFound = "Hibernate Validator not found: ignoring";
    private final static String unableToReadColumnValueFromResultSet = "Could not read column value from result set: %s; %s";
    private final static String unsuccessfulCreate = "Unsuccessful: %s";
    private final static String synchronizationAlreadyRegistered = "Synchronization [%s] was already registered";
    private final static String unableToRollbackIsolatedTransaction = "Unable to rollback isolated transaction on error [%s] : [%s]";
    private final static String unableToLocateCustomOptimizerClass = "Unable to interpret specified optimizer [%s], falling back to noop";
    private final static String unableToSynchronizeDatabaseStateWithSession = "Could not synchronize database state with session: %s";
    private final static String exceptionInSubResolver = "Sub-resolver threw unexpected exception, continuing to next : %s";
    private final static String unableToRemoveBagJoinFetch = "Unable to erase previously added bag join fetch";
    private final static String jndiNameDoesNotHandleSessionFactoryReference = "JNDI name %s does not handle a session factory reference";
    private final static String unsuccessful = "Unsuccessful: %s";
    private final static String instantiatingExplicitConnectionProvider = "Instantiating explicit connection provider: %s";
    private final static String unableToDestroyQueryCache = "Unable to destroy query cache: %s: %s";
    private final static String invalidPrimaryKeyJoinColumnAnnotation = "Root entity should not hold an PrimaryKeyJoinColum(s), will be ignored";
    private final static String invalidTableAnnotation = "Illegal use of @Table in a subclass of a SINGLE_TABLE hierarchy: %s";
    private final static String handlingTransientEntity = "Handling transient entity in delete processing";
    private final static String noPersistentClassesFound = "no persistent classes found for query class: %s";
    private final static String unableToUpdateHiValue = "Could not update hi value in: %s";
    private final static String unableToReadOrInitHiValue = "Could not read or init a hi value";
    private final static String c3p0ProviderClassNotFound = "c3p0 properties were encountered, but the %s provider class was not found on the classpath; these properties are going to be ignored.";
    private final static String invalidEditOfReadOnlyItem = "Application attempted to edit read only item: %s";
    private final static String unableToAccessSessionFactory = "Error while accessing session factory with JNDI name %s";
    private final static String localLoadingCollectionKeysCount = "On CollectionLoadContext#cleanup, localLoadingCollectionKeys contained [%s] entries";
    private final static String unableToSwitchToMethodUsingColumnIndex = "Exception switching from method: [%s] to a method using the column index. Reverting to using: [%<s]";
    private final static String unableToCloseStream = "IOException occurred closing stream";
    private final static String unableToReleaseContext = "Unable to release initial context: %s";
    private final static String entityMappedAsNonAbstract = "Entity [%s] is abstract-class/interface explicitly mapped as non-abstract; be sure to supply entity-names";
    private final static String unknownIngresVersion = "Unknown Ingres major version [%s]; using Ingres 9.2 dialect";
    private final static String unableToMarkForRollbackOnPersistenceException = "Unable to mark for rollback on PersistenceException: ";
    private final static String factoryUnboundFromJndiName = "Unbound factory from JNDI name: %s";
    private final static String unableToFindPersistenceXmlInClasspath = "Could not find any META-INF/persistence.xml file in the classpath";
    private final static String readOnlyCacheConfiguredForMutableCollection = "read-only cache configured for mutable collection [%s]";
    private final static String unableToWriteCachedFile = "I/O reported error writing cached file : %s: %s";
    private final static String invalidArrayElementType = "Array element type error\n%s";
    private final static String propertiesNotFound = "hibernate.properties not found";
    private final static String configuringFromUrl = "Configuring from URL: %s";
    private final static String collectionsUpdated = "Collections updated: %s";
    private final static String configuringFromXmlDocument = "Configuring from XML document";
    private final static String unableToUnbindFactoryFromJndi = "Could not unbind factory from JNDI";
    private final static String unableToDestroyUpdateTimestampsCache = "Unable to destroy update timestamps cache: %s: %s";
    private final static String settersOfLazyClassesCannotBeFinal = "Setters of lazy classes cannot be final: %s.%s";
    private final static String unableToApplyConstraints = "Unable to apply constraints on DDL for %s";
    private final static String resolvedSqlTypeDescriptorForDifferentSqlCode = "Resolved SqlTypeDescriptor is for a different SQL code. %s has sqlCode=%s; type override %s has sqlCode=%s";
    private final static String usingOldDtd = "Don't use old DTDs, read the Hibernate 3.x Migration Guide!";
    private final static String unableToCloseSessionButSwallowingError = "Could not close session; swallowing exception[%s] as transaction completed";
    private final static String sqlWarning = "SQL Error: %s, SQLState: %s";
    private final static String factoryBoundToJndiName = "Bound factory to JNDI name: %s";
    private final static String synchronizationFailed = "Exception calling user Synchronization [%s] : %s";
    private final static String unableToResolveMappingFile = "Unable to resolve mapping file [%s]";
    private final static String unableToCompleteSchemaUpdate = "Could not complete schema update";
    private final static String unableToCloseSession = "Could not close session";
    private final static String updatingSchema = "Updating schema";
    private final static String unsupportedIngresVersion = "Ingres 10 is not yet fully supported; using Ingres 9.3 dialect";
    private final static String unableToDropTemporaryIdTable = "Unable to drop temporary id table after use [%s]";
    private final static String unableToLogWarnings = "Could not log warnings";
    private final static String pooledOptimizerReportedInitialValue = "Pooled optimizer source reported [%s] as the initial value; use of 1 or greater highly recommended";
    private final static String statementsPrepared = "Statements prepared: %s";
    private final static String readingCachedMappings = "Reading mappings from cache file: %s";
    private final static String collectionsRemoved = "Collections removed: %s";
    private final static String usingDefaultTransactionStrategy = "Using default transaction strategy (direct JDBC transactions)";
    private final static String parsingXmlWarningForFile = "Warning parsing XML: %s(%s) %s";
    private final static String processingPersistenceUnitInfoName = "Processing PersistenceUnitInfo [\n\tname: %s\n\t...]";
    private final static String searchingForMappingDocuments = "Searching for mapping documents in jar: %s";
    private final static String unableToLoadCommand = "Error performing load command : %s";
    private final static String usingHibernateBuiltInConnectionPool = "Using Hibernate built-in connection pool (not for production use!)";
    private final static String compositeIdClassDoesNotOverrideHashCode = "Composite-id class does not override hashCode(): %s";
    private final static String illegalPropertyGetterArgument = "IllegalArgumentException in class: %s, getter method of property: %s";
    private final static String duplicateJoins = "Duplicate joins for class: %s";
    private final static String unableToLocateConfiguredSchemaNameResolver = "Unable to locate configured schema name resolver class [%s] %s";
    private final static String unableToRunSchemaUpdate = "Error running schema update";
    private final static String exceptionHeaderFound = "%s %s found";
    private final static String closingUnreleasedBatch = "Closing un-released batch";
    private final static String naturalIdCacheHits = "NaturalId cache hits: %s";
    private final static String unableToObtainConnectionToQueryMetadata = "Could not obtain connection to query metadata : %s";
    private final static String unableToBuildEnhancementMetamodel = "Unable to build enhancement metamodel for %s";
    private final static String couldNotBindJndiListener = "Could not bind JNDI listener";
    private final static String guidGenerated = "GUID identifier generated: %s";
    private final static String optimisticLockFailures = "Optimistic lock failures: %s";
    private final static String queriesExecuted = "Queries executed to database: %s";
    private final static String hibernateConnectionPoolSize = "Hibernate connection pool size: %s";
    private final static String factoryJndiRename = "A factory was renamed from [%s] to [%s] in JNDI";
    private final static String unableToCloseIterator = "Unable to close iterator";

    public CoreMessageLogger_$logger(final Logger log) {
        this.log = log;
    }

    @Override
    public final boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    @Override
    public final void trace(Object message) {
        log.trace(FQCN, message, null);
    }

    @Override
    public final void trace(Object message, Throwable t) {
        log.trace(FQCN, message, t);
    }

    @Override
    public final void trace(String loggerFqcn, Object message, Throwable t) {
        log.trace(loggerFqcn, message, t);
    }

    @Override
    public final void trace(String loggerFqcn, Object message, Object[] params, Throwable t) {
        log.trace(loggerFqcn, message, params, t);
    }

    @Override
    public final void tracev(String format, Object... params) {
        log.logv(FQCN, Logger.Level.TRACE, null, format, params);
    }

    @Override
    public final void tracev(String format, Object param1) {
        log.logv(FQCN, Logger.Level.TRACE, null, format, param1);
    }

    @Override
    public final void tracev(String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.TRACE, null, format, param1, param2);
    }

    @Override
    public final void tracev(String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.TRACE, null, format, param1, param2, param3);
    }

    @Override
    public final void tracev(Throwable t, String format, Object... params) {
        log.logv(FQCN, Logger.Level.TRACE, t, format, params);
    }

    @Override
    public final void tracev(Throwable t, String format, Object param1) {
        log.logv(FQCN, Logger.Level.TRACE, t, format, param1);
    }

    @Override
    public final void tracev(Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.TRACE, t, format, param1, param2);
    }

    @Override
    public final void tracev(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.TRACE, t, format, param1, param2, param3);
    }

    @Override
    public final void tracef(String format, Object... params) {
        log.logf(FQCN, Logger.Level.TRACE, null, format, params);
    }

    @Override
    public final void tracef(String format, Object param1) {
        log.logf(FQCN, Logger.Level.TRACE, null, format, param1);
    }

    @Override
    public final void tracef(String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.TRACE, null, format, param1, param2);
    }

    @Override
    public final void tracef(String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.TRACE, null, format, param1, param2, param3);
    }

    @Override
    public final void tracef(Throwable t, String format, Object... params) {
        log.logf(FQCN, Logger.Level.TRACE, t, format, params);
    }

    @Override
    public final void tracef(Throwable t, String format, Object param1) {
        log.logf(FQCN, Logger.Level.TRACE, t, format, param1);
    }

    @Override
    public final void tracef(Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.TRACE, t, format, param1, param2);
    }

    @Override
    public final void tracef(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.TRACE, t, format, param1, param2, param3);
    }

    @Override
    public final boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public final void debug(Object message) {
        log.debug(FQCN, message, null);
    }

    @Override
    public final void debug(Object message, Throwable t) {
        log.debug(FQCN, message, t);
    }

    @Override
    public final void debug(String loggerFqcn, Object message, Throwable t) {
        log.debug(loggerFqcn, message, t);
    }

    @Override
    public final void debug(String loggerFqcn, Object message, Object[] params, Throwable t) {
        log.debug(loggerFqcn, message, params, t);
    }

    @Override
    public final void debugv(String format, Object... params) {
        log.logv(FQCN, Logger.Level.DEBUG, null, format, params);
    }

    @Override
    public final void debugv(String format, Object param1) {
        log.logv(FQCN, Logger.Level.DEBUG, null, format, param1);
    }

    @Override
    public final void debugv(String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.DEBUG, null, format, param1, param2);
    }

    @Override
    public final void debugv(String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.DEBUG, null, format, param1, param2, param3);
    }

    @Override
    public final void debugv(Throwable t, String format, Object... params) {
        log.logv(FQCN, Logger.Level.DEBUG, t, format, params);
    }

    @Override
    public final void debugv(Throwable t, String format, Object param1) {
        log.logv(FQCN, Logger.Level.DEBUG, t, format, param1);
    }

    @Override
    public final void debugv(Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.DEBUG, t, format, param1, param2);
    }

    @Override
    public final void debugv(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.DEBUG, t, format, param1, param2, param3);
    }

    @Override
    public final void debugf(String format, Object... params) {
        log.logf(FQCN, Logger.Level.DEBUG, null, format, params);
    }

    @Override
    public final void debugf(String format, Object param1) {
        log.logf(FQCN, Logger.Level.DEBUG, null, format, param1);
    }

    @Override
    public final void debugf(String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.DEBUG, null, format, param1, param2);
    }

    @Override
    public final void debugf(String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.DEBUG, null, format, param1, param2, param3);
    }

    @Override
    public final void debugf(Throwable t, String format, Object... params) {
        log.logf(FQCN, Logger.Level.DEBUG, t, format, params);
    }

    @Override
    public final void debugf(Throwable t, String format, Object param1) {
        log.logf(FQCN, Logger.Level.DEBUG, t, format, param1);
    }

    @Override
    public final void debugf(Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.DEBUG, t, format, param1, param2);
    }

    @Override
    public final void debugf(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.DEBUG, t, format, param1, param2, param3);
    }

    @Override
    public final boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    @Override
    public final void info(Object message) {
        log.info(FQCN, message, null);
    }

    @Override
    public final void info(Object message, Throwable t) {
        log.info(FQCN, message, t);
    }

    @Override
    public final void info(String loggerFqcn, Object message, Throwable t) {
        log.info(loggerFqcn, message, t);
    }

    @Override
    public final void info(String loggerFqcn, Object message, Object[] params, Throwable t) {
        log.info(loggerFqcn, message, params, t);
    }

    @Override
    public final void infov(String format, Object... params) {
        log.logv(FQCN, Logger.Level.INFO, null, format, params);
    }

    @Override
    public final void infov(String format, Object param1) {
        log.logv(FQCN, Logger.Level.INFO, null, format, param1);
    }

    @Override
    public final void infov(String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.INFO, null, format, param1, param2);
    }

    @Override
    public final void infov(String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.INFO, null, format, param1, param2, param3);
    }

    @Override
    public final void infov(Throwable t, String format, Object... params) {
        log.logv(FQCN, Logger.Level.INFO, t, format, params);
    }

    @Override
    public final void infov(Throwable t, String format, Object param1) {
        log.logv(FQCN, Logger.Level.INFO, t, format, param1);
    }

    @Override
    public final void infov(Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.INFO, t, format, param1, param2);
    }

    @Override
    public final void infov(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.INFO, t, format, param1, param2, param3);
    }

    @Override
    public final void infof(String format, Object... params) {
        log.logf(FQCN, Logger.Level.INFO, null, format, params);
    }

    @Override
    public final void infof(String format, Object param1) {
        log.logf(FQCN, Logger.Level.INFO, null, format, param1);
    }

    @Override
    public final void infof(String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.INFO, null, format, param1, param2);
    }

    @Override
    public final void infof(String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.INFO, null, format, param1, param2, param3);
    }

    @Override
    public final void infof(Throwable t, String format, Object... params) {
        log.logf(FQCN, Logger.Level.INFO, t, format, params);
    }

    @Override
    public final void infof(Throwable t, String format, Object param1) {
        log.logf(FQCN, Logger.Level.INFO, t, format, param1);
    }

    @Override
    public final void infof(Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.INFO, t, format, param1, param2);
    }

    @Override
    public final void infof(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.INFO, t, format, param1, param2, param3);
    }

    @Override
    public final void warn(Object message) {
        log.warn(FQCN, message, null);
    }

    @Override
    public final void warn(Object message, Throwable t) {
        log.warn(FQCN, message, t);
    }

    @Override
    public final void warn(String loggerFqcn, Object message, Throwable t) {
        log.warn(loggerFqcn, message, t);
    }

    @Override
    public final void warn(String loggerFqcn, Object message, Object[] params, Throwable t) {
        log.warn(loggerFqcn, message, params, t);
    }

    @Override
    public final void warnv(String format, Object... params) {
        log.logv(FQCN, Logger.Level.WARN, null, format, params);
    }

    @Override
    public final void warnv(String format, Object param1) {
        log.logv(FQCN, Logger.Level.WARN, null, format, param1);
    }

    @Override
    public final void warnv(String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.WARN, null, format, param1, param2);
    }

    @Override
    public final void warnv(String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.WARN, null, format, param1, param2, param3);
    }

    @Override
    public final void warnv(Throwable t, String format, Object... params) {
        log.logv(FQCN, Logger.Level.WARN, t, format, params);
    }

    @Override
    public final void warnv(Throwable t, String format, Object param1) {
        log.logv(FQCN, Logger.Level.WARN, t, format, param1);
    }

    @Override
    public final void warnv(Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.WARN, t, format, param1, param2);
    }

    @Override
    public final void warnv(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.WARN, t, format, param1, param2, param3);
    }

    @Override
    public final void warnf(String format, Object... params) {
        log.logf(FQCN, Logger.Level.WARN, null, format, params);
    }

    @Override
    public final void warnf(String format, Object param1) {
        log.logf(FQCN, Logger.Level.WARN, null, format, param1);
    }

    @Override
    public final void warnf(String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.WARN, null, format, param1, param2);
    }

    @Override
    public final void warnf(String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.WARN, null, format, param1, param2, param3);
    }

    @Override
    public final void warnf(Throwable t, String format, Object... params) {
        log.logf(FQCN, Logger.Level.WARN, t, format, params);
    }

    @Override
    public final void warnf(Throwable t, String format, Object param1) {
        log.logf(FQCN, Logger.Level.WARN, t, format, param1);
    }

    @Override
    public final void warnf(Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.WARN, t, format, param1, param2);
    }

    @Override
    public final void warnf(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.WARN, t, format, param1, param2, param3);
    }

    @Override
    public final void error(Object message) {
        log.error(FQCN, message, null);
    }

    @Override
    public final void error(Object message, Throwable t) {
        log.error(FQCN, message, t);
    }

    @Override
    public final void error(String loggerFqcn, Object message, Throwable t) {
        log.error(loggerFqcn, message, t);
    }

    @Override
    public final void error(String loggerFqcn, Object message, Object[] params, Throwable t) {
        log.error(loggerFqcn, message, params, t);
    }

    @Override
    public final void errorv(String format, Object... params) {
        log.logv(FQCN, Logger.Level.ERROR, null, format, params);
    }

    @Override
    public final void errorv(String format, Object param1) {
        log.logv(FQCN, Logger.Level.ERROR, null, format, param1);
    }

    @Override
    public final void errorv(String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.ERROR, null, format, param1, param2);
    }

    @Override
    public final void errorv(String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.ERROR, null, format, param1, param2, param3);
    }

    @Override
    public final void errorv(Throwable t, String format, Object... params) {
        log.logv(FQCN, Logger.Level.ERROR, t, format, params);
    }

    @Override
    public final void errorv(Throwable t, String format, Object param1) {
        log.logv(FQCN, Logger.Level.ERROR, t, format, param1);
    }

    @Override
    public final void errorv(Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.ERROR, t, format, param1, param2);
    }

    @Override
    public final void errorv(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.ERROR, t, format, param1, param2, param3);
    }

    @Override
    public final void errorf(String format, Object... params) {
        log.logf(FQCN, Logger.Level.ERROR, null, format, params);
    }

    @Override
    public final void errorf(String format, Object param1) {
        log.logf(FQCN, Logger.Level.ERROR, null, format, param1);
    }

    @Override
    public final void errorf(String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.ERROR, null, format, param1, param2);
    }

    @Override
    public final void errorf(String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.ERROR, null, format, param1, param2, param3);
    }

    @Override
    public final void errorf(Throwable t, String format, Object... params) {
        log.logf(FQCN, Logger.Level.ERROR, t, format, params);
    }

    @Override
    public final void errorf(Throwable t, String format, Object param1) {
        log.logf(FQCN, Logger.Level.ERROR, t, format, param1);
    }

    @Override
    public final void errorf(Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.ERROR, t, format, param1, param2);
    }

    @Override
    public final void errorf(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.ERROR, t, format, param1, param2, param3);
    }

    @Override
    public final void fatal(Object message) {
        log.fatal(FQCN, message, null);
    }

    @Override
    public final void fatal(Object message, Throwable t) {
        log.fatal(FQCN, message, t);
    }

    @Override
    public final void fatal(String loggerFqcn, Object message, Throwable t) {
        log.fatal(loggerFqcn, message, t);
    }

    @Override
    public final void fatal(String loggerFqcn, Object message, Object[] params, Throwable t) {
        log.fatal(loggerFqcn, message, params, t);
    }

    @Override
    public final void fatalv(String format, Object... params) {
        log.logv(FQCN, Logger.Level.FATAL, null, format, params);
    }

    @Override
    public final void fatalv(String format, Object param1) {
        log.logv(FQCN, Logger.Level.FATAL, null, format, param1);
    }

    @Override
    public final void fatalv(String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.FATAL, null, format, param1, param2);
    }

    @Override
    public final void fatalv(String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.FATAL, null, format, param1, param2, param3);
    }

    @Override
    public final void fatalv(Throwable t, String format, Object... params) {
        log.logv(FQCN, Logger.Level.FATAL, t, format, params);
    }

    @Override
    public final void fatalv(Throwable t, String format, Object param1) {
        log.logv(FQCN, Logger.Level.FATAL, t, format, param1);
    }

    @Override
    public final void fatalv(Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, Logger.Level.FATAL, t, format, param1, param2);
    }

    @Override
    public final void fatalv(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, Logger.Level.FATAL, t, format, param1, param2, param3);
    }

    @Override
    public final void fatalf(String format, Object... params) {
        log.logf(FQCN, Logger.Level.FATAL, null, format, params);
    }

    @Override
    public final void fatalf(String format, Object param1) {
        log.logf(FQCN, Logger.Level.FATAL, null, format, param1);
    }

    @Override
    public final void fatalf(String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.FATAL, null, format, param1, param2);
    }

    @Override
    public final void fatalf(String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.FATAL, null, format, param1, param2, param3);
    }

    @Override
    public final void fatalf(Throwable t, String format, Object... params) {
        log.logf(FQCN, Logger.Level.FATAL, t, format, params);
    }

    @Override
    public final void fatalf(Throwable t, String format, Object param1) {
        log.logf(FQCN, Logger.Level.FATAL, t, format, param1);
    }

    @Override
    public final void fatalf(Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, Logger.Level.FATAL, t, format, param1, param2);
    }

    @Override
    public final void fatalf(Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, Logger.Level.FATAL, t, format, param1, param2, param3);
    }

    public final boolean isEnabled(Logger.Level level) {
        return log.isEnabled(level);
    }

    @Override
    public final void log(Logger.Level level, Object message) {
        log.log(FQCN, level, message, null, null);
    }

    @Override
    public final void log(Logger.Level level, Object message, Throwable t) {
        log.log(FQCN, level, message, null, t);
    }

    @Override
    public final void log(Logger.Level level, String loggerFqcn, Object message, Throwable t) {
        log.log(level, loggerFqcn, message, t);
    }

    @Override
    public final void log(String loggerFqcn, Logger.Level level, Object message, Object[] params, Throwable t) {
        log.log(loggerFqcn, level, message, params, t);
    }

    @Override
    public final void logv(Logger.Level level, String format, Object... params) {
        log.logv(FQCN, level, null, format, params);
    }

    @Override
    public final void logv(Logger.Level level, String format, Object param1) {
        log.logv(FQCN, level, null, format, param1);
    }

    @Override
    public final void logv(Logger.Level level, String format, Object param1, Object param2) {
        log.logv(FQCN, level, null, format, param1, param2);
    }

    @Override
    public final void logv(Logger.Level level, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, level, null, format, param1, param2, param3);
    }

    @Override
    public final void logv(Logger.Level level, Throwable t, String format, Object... params) {
        log.logv(FQCN, level, t, format, params);
    }

    @Override
    public final void logv(Logger.Level level, Throwable t, String format, Object param1) {
        log.logv(FQCN, level, t, format, param1);
    }

    @Override
    public final void logv(Logger.Level level, Throwable t, String format, Object param1, Object param2) {
        log.logv(FQCN, level, t, format, param1, param2);
    }

    @Override
    public final void logv(Logger.Level level, Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(FQCN, level, t, format, param1, param2, param3);
    }

    @Override
    public final void logv(String loggerFqcn, Logger.Level level, Throwable t, String format, Object... params) {
        log.logv(loggerFqcn, level, t, format, params);
    }

    @Override
    public final void logv(String loggerFqcn, Logger.Level level, Throwable t, String format, Object param1) {
        log.logv(loggerFqcn, level, t, format, param1);
    }

    @Override
    public final void logv(String loggerFqcn, Logger.Level level, Throwable t, String format, Object param1, Object param2) {
        log.logv(loggerFqcn, level, t, format, param1, param2);
    }

    @Override
    public final void logv(String loggerFqcn, Logger.Level level, Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logv(loggerFqcn, level, t, format, param1, param2, param3);
    }

    @Override
    public final void logf(Logger.Level level, String format, Object... params) {
        log.logf(FQCN, level, null, format, params);
    }

    @Override
    public final void logf(Logger.Level level, String format, Object param1) {
        log.logf(FQCN, level, null, format, param1);
    }

    @Override
    public final void logf(Logger.Level level, String format, Object param1, Object param2) {
        log.logf(FQCN, level, null, format, param1, param2);
    }

    @Override
    public final void logf(Logger.Level level, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, level, null, format, param1, param2, param3);
    }

    @Override
    public final void logf(Logger.Level level, Throwable t, String format, Object... params) {
        log.logf(FQCN, level, t, format, params);
    }

    @Override
    public final void logf(Logger.Level level, Throwable t, String format, Object param1) {
        log.logf(FQCN, level, t, format, param1);
    }

    @Override
    public final void logf(Logger.Level level, Throwable t, String format, Object param1, Object param2) {
        log.logf(FQCN, level, t, format, param1, param2);
    }

    @Override
    public final void logf(Logger.Level level, Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(FQCN, level, t, format, param1, param2, param3);
    }

    @Override
    public final void logf(String loggerFqcn, Logger.Level level, Throwable t, String format, Object... params) {
        log.logf(loggerFqcn, level, t, format, params);
    }

    @Override
    public final void logf(String loggerFqcn, Logger.Level level, Throwable t, String format, Object param1) {
        log.logf(loggerFqcn, level, t, format, param1);
    }

    @Override
    public final void logf(String loggerFqcn, Logger.Level level, Throwable t, String format, Object param1, Object param2) {
        log.logf(loggerFqcn, level, t, format, param1, param2);
    }

    @Override
    public final void logf(String loggerFqcn, Logger.Level level, Throwable t, String format, Object param1, Object param2, Object param3) {
        log.logf(loggerFqcn, level, t, format, param1, param2, param3);
    }

    @Override
    public final void unableToCloseJar(final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000290: ")+ unableToCloseJar$str()), message);
    }

    protected String unableToCloseJar$str() {
        return unableToCloseJar;
    }

    @Override
    public final void legacyTransactionManagerStrategy(final String name, final String jtaPlatform) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000428: ")+ legacyTransactionManagerStrategy$str()), name, jtaPlatform);
    }

    protected String legacyTransactionManagerStrategy$str() {
        return legacyTransactionManagerStrategy;
    }

    @Override
    public final void usingUuidHexGenerator(final String name, final String name2) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000409: ")+ usingUuidHexGenerator$str()), name, name2);
    }

    protected String usingUuidHexGenerator$str() {
        return usingUuidHexGenerator;
    }

    @Override
    public final void logicalConnectionReleasingPhysicalConnection() {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000163: ")+ logicalConnectionReleasingPhysicalConnection$str()));
    }

    protected String logicalConnectionReleasingPhysicalConnection$str() {
        return logicalConnectionReleasingPhysicalConnection;
    }

    @Override
    public final void logicalConnectionClosed() {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000162: ")+ logicalConnectionClosed$str()));
    }

    protected String logicalConnectionClosed$str() {
        return logicalConnectionClosed;
    }

    @Override
    public final void unableToWrapResultSet(final SQLException e) {
        log.logf(FQCN, (Logger.Level.INFO), (e), ((projectCode +"000377: ")+ unableToWrapResultSet$str()));
    }

    protected String unableToWrapResultSet$str() {
        return unableToWrapResultSet;
    }

    @Override
    public final void autoCommitMode(final boolean autocommit) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000006: ")+ autoCommitMode$str()), autocommit);
    }

    protected String autoCommitMode$str() {
        return autoCommitMode;
    }

    @Override
    public final void sqlExceptionEscapedProxy(final SQLException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000246: ")+ sqlExceptionEscapedProxy$str()));
    }

    protected String sqlExceptionEscapedProxy$str() {
        return sqlExceptionEscapedProxy;
    }

    @Override
    public final void queryCachePuts(final long queryCachePutCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000215: ")+ queryCachePuts$str()), queryCachePutCount);
    }

    protected String queryCachePuts$str() {
        return queryCachePuts;
    }

    @Override
    public final void usingDialect(final Dialect dialect) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000400: ")+ usingDialect$str()), dialect);
    }

    protected String usingDialect$str() {
        return usingDialect;
    }

    @Override
    public final void unregisteredStatement() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000387: ")+ unregisteredStatement$str()));
    }

    protected String unregisteredStatement$str() {
        return unregisteredStatement;
    }

    @Override
    public final void parsingXmlErrorForFile(final String file, final int lineNumber, final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000197: ")+ parsingXmlErrorForFile$str()), file, lineNumber, message);
    }

    protected String parsingXmlErrorForFile$str() {
        return parsingXmlErrorForFile;
    }

    @Override
    public final void jndiInitialContextProperties(final Hashtable hash) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000154: ")+ jndiInitialContextProperties$str()), hash);
    }

    protected String jndiInitialContextProperties$str() {
        return jndiInitialContextProperties;
    }

    @Override
    public final void unableToLogSqlWarnings(final SQLException sqle) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000335: ")+ unableToLogSqlWarnings$str()), sqle);
    }

    protected String unableToLogSqlWarnings$str() {
        return unableToLogSqlWarnings;
    }

    @Override
    public final void overridingTransactionStrategyDangerous(final String transactionStrategy) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000193: ")+ overridingTransactionStrategyDangerous$str()), transactionStrategy);
    }

    protected String overridingTransactionStrategyDangerous$str() {
        return overridingTransactionStrategyDangerous;
    }

    @Override
    public final void jdbcAutoCommitFalseBreaksEjb3Spec(final String autocommit) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000144: ")+ jdbcAutoCommitFalseBreaksEjb3Spec$str()), autocommit);
    }

    protected String jdbcAutoCommitFalseBreaksEjb3Spec$str() {
        return jdbcAutoCommitFalseBreaksEjb3Spec;
    }

    @Override
    public final void narrowingProxy(final Class concreteProxyClass) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000179: ")+ narrowingProxy$str()), concreteProxyClass);
    }

    protected String narrowingProxy$str() {
        return narrowingProxy;
    }

    @Override
    public final void honoringOptimizerSetting(final String none, final String incrementParam, final int incrementSize) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000116: ")+ honoringOptimizerSetting$str()), none, incrementParam, incrementSize);
    }

    protected String honoringOptimizerSetting$str() {
        return honoringOptimizerSetting;
    }

    @Override
    public final void connectionsObtained(final long connectCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000048: ")+ connectionsObtained$str()), connectCount);
    }

    protected String connectionsObtained$str() {
        return connectionsObtained;
    }

    @Override
    public final String javassistEnhancementFailed(final String entityName) {
        String result = String.format(((projectCode +"000142: ")+ javassistEnhancementFailed$str()), entityName);
        return result;
    }

    protected String javassistEnhancementFailed$str() {
        return javassistEnhancementFailed;
    }

    @Override
    public final void unsupportedInitialValue(final String propertyName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000392: ")+ unsupportedInitialValue$str()), propertyName);
    }

    protected String unsupportedInitialValue$str() {
        return unsupportedInitialValue;
    }

    @Override
    public final String unableToLocateConfigFile(final String path) {
        String result = String.format(((projectCode +"000330: ")+ unableToLocateConfigFile$str()), path);
        return result;
    }

    protected String unableToLocateConfigFile$str() {
        return unableToLocateConfigFile;
    }

    @Override
    public final void unableToCloseOutputStream(final IOException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000292: ")+ unableToCloseOutputStream$str()));
    }

    protected String unableToCloseOutputStream$str() {
        return unableToCloseOutputStream;
    }

    @Override
    public final void deprecatedOracle9Dialect() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000063: ")+ deprecatedOracle9Dialect$str()));
    }

    protected String deprecatedOracle9Dialect$str() {
        return deprecatedOracle9Dialect;
    }

    @Override
    public final void hydratingEntitiesCount(final int size) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000119: ")+ hydratingEntitiesCount$str()), size);
    }

    protected String hydratingEntitiesCount$str() {
        return hydratingEntitiesCount;
    }

    @Override
    public final void sessionsOpened(final long sessionOpenCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000242: ")+ sessionsOpened$str()), sessionOpenCount);
    }

    protected String sessionsOpened$str() {
        return sessionsOpened;
    }

    @Override
    public final void disablingContextualLOBCreationSinceConnectionNull() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000422: ")+ disablingContextualLOBCreationSinceConnectionNull$str()));
    }

    protected String disablingContextualLOBCreationSinceConnectionNull$str() {
        return disablingContextualLOBCreationSinceConnectionNull;
    }

    @Override
    public final void unableToConstructCurrentSessionContext(final String impl, final Throwable e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000302: ")+ unableToConstructCurrentSessionContext$str()), impl);
    }

    protected String unableToConstructCurrentSessionContext$str() {
        return unableToConstructCurrentSessionContext;
    }

    @Override
    public final void schemaUpdateComplete() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000232: ")+ schemaUpdateComplete$str()));
    }

    protected String schemaUpdateComplete$str() {
        return schemaUpdateComplete;
    }

    @Override
    public final void usingStreams() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000407: ")+ usingStreams$str()));
    }

    protected String usingStreams$str() {
        return usingStreams;
    }

    @Override
    public final void alreadySessionBound() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000002: ")+ alreadySessionBound$str()));
    }

    protected String alreadySessionBound$str() {
        return alreadySessionBound;
    }

    @Override
    public final void disallowingInsertStatementComment() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000067: ")+ disallowingInsertStatementComment$str()));
    }

    protected String disallowingInsertStatementComment$str() {
        return disallowingInsertStatementComment;
    }

    @Override
    public final void unableToCreateSchema(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000306: ")+ unableToCreateSchema$str()));
    }

    protected String unableToCreateSchema$str() {
        return unableToCreateSchema;
    }

    @Override
    public final void loggingStatistics() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000161: ")+ loggingStatistics$str()));
    }

    protected String loggingStatistics$str() {
        return loggingStatistics;
    }

    @Override
    public final void unableToCreateProxyFactory(final String entityName, final org.hibernate.HibernateException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000305: ")+ unableToCreateProxyFactory$str()), entityName);
    }

    protected String unableToCreateProxyFactory$str() {
        return unableToCreateProxyFactory;
    }

    @Override
    public final void timestampCacheHits(final long updateTimestampsCachePutCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000434: ")+ timestampCacheHits$str()), updateTimestampsCachePutCount);
    }

    protected String timestampCacheHits$str() {
        return timestampCacheHits;
    }

    @Override
    public final void tableFound(final String string) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000261: ")+ tableFound$str()), string);
    }

    protected String tableFound$str() {
        return tableFound;
    }

    @Override
    public final void invalidOnDeleteAnnotation(final String entityName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000136: ")+ invalidOnDeleteAnnotation$str()), entityName);
    }

    protected String invalidOnDeleteAnnotation$str() {
        return invalidOnDeleteAnnotation;
    }

    @Override
    public final void unableToObjectConnectionToQueryMetadata(final SQLException error) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000340: ")+ unableToObjectConnectionToQueryMetadata$str()), error);
    }

    protected String unableToObjectConnectionToQueryMetadata$str() {
        return unableToObjectConnectionToQueryMetadata;
    }

    @Override
    public final void duplicateMetadata() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000074: ")+ duplicateMetadata$str()));
    }

    protected String duplicateMetadata$str() {
        return duplicateMetadata;
    }

    @Override
    public final void orderByAnnotationIndexedCollection() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000189: ")+ orderByAnnotationIndexedCollection$str()));
    }

    protected String orderByAnnotationIndexedCollection$str() {
        return orderByAnnotationIndexedCollection;
    }

    @Override
    public final void schemaExportComplete() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000230: ")+ schemaExportComplete$str()));
    }

    protected String schemaExportComplete$str() {
        return schemaExportComplete;
    }

    @Override
    public final void unknownOracleVersion(final int databaseMajorVersion) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000384: ")+ unknownOracleVersion$str()), databaseMajorVersion);
    }

    protected String unknownOracleVersion$str() {
        return unknownOracleVersion;
    }

    @Override
    public final void entitiesFetched(final long entityFetchCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000077: ")+ entitiesFetched$str()), entityFetchCount);
    }

    protected String entitiesFetched$str() {
        return entitiesFetched;
    }

    @Override
    public final void invalidDiscriminatorAnnotation(final String className) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000133: ")+ invalidDiscriminatorAnnotation$str()), className);
    }

    protected String invalidDiscriminatorAnnotation$str() {
        return invalidDiscriminatorAnnotation;
    }

    @Override
    public final void definingFlushBeforeCompletionIgnoredInHem(final String flushBeforeCompletion) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000059: ")+ definingFlushBeforeCompletionIgnoredInHem$str()), flushBeforeCompletion);
    }

    protected String definingFlushBeforeCompletionIgnoredInHem$str() {
        return definingFlushBeforeCompletionIgnoredInHem;
    }

    @Override
    public final void unableToStopService(final Class class1, final String string) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000369: ")+ unableToStopService$str()), class1, string);
    }

    protected String unableToStopService$str() {
        return unableToStopService;
    }

    @Override
    public final void entityAnnotationOnNonRoot(final String className) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000081: ")+ entityAnnotationOnNonRoot$str()), className);
    }

    protected String entityAnnotationOnNonRoot$str() {
        return entityAnnotationOnNonRoot;
    }

    @Override
    public final void secondLevelCachePuts(final long secondLevelCachePutCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000239: ")+ secondLevelCachePuts$str()), secondLevelCachePutCount);
    }

    protected String secondLevelCachePuts$str() {
        return secondLevelCachePuts;
    }

    @Override
    public final void unknownBytecodeProvider(final String providerName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000382: ")+ unknownBytecodeProvider$str()), providerName);
    }

    protected String unknownBytecodeProvider$str() {
        return unknownBytecodeProvider;
    }

    @Override
    public final void statementsClosed(final long closeStatementCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000252: ")+ statementsClosed$str()), closeStatementCount);
    }

    protected String statementsClosed$str() {
        return statementsClosed;
    }

    @Override
    public final void connectionProperties(final Properties connectionProps) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000046: ")+ connectionProperties$str()), connectionProps);
    }

    protected String connectionProperties$str() {
        return connectionProperties;
    }

    @Override
    public final void writingGeneratedSchemaToFile(final String outputFile) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000417: ")+ writingGeneratedSchemaToFile$str()), outputFile);
    }

    protected String writingGeneratedSchemaToFile$str() {
        return writingGeneratedSchemaToFile;
    }

    @Override
    public final void cacheProvider(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000024: ")+ cacheProvider$str()), name);
    }

    protected String cacheProvider$str() {
        return cacheProvider;
    }

    @Override
    public final void unableToRetrieveCache(final String namespace, final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000361: ")+ unableToRetrieveCache$str()), namespace, message);
    }

    protected String unableToRetrieveCache$str() {
        return unableToRetrieveCache;
    }

    @Override
    public final void unableToInstantiateUuidGenerationStrategy(final Exception ignore) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000325: ")+ unableToInstantiateUuidGenerationStrategy$str()), ignore);
    }

    protected String unableToInstantiateUuidGenerationStrategy$str() {
        return unableToInstantiateUuidGenerationStrategy;
    }

    @Override
    public final void usingDefaultIdGeneratorSegmentValue(final String tableName, final String segmentColumnName, final String defaultToUse) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000398: ")+ usingDefaultIdGeneratorSegmentValue$str()), tableName, segmentColumnName, defaultToUse);
    }

    protected String usingDefaultIdGeneratorSegmentValue$str() {
        return usingDefaultIdGeneratorSegmentValue;
    }

    @Override
    public final void unableToObjectConnectionMetadata(final SQLException error) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000339: ")+ unableToObjectConnectionMetadata$str()), error);
    }

    protected String unableToObjectConnectionMetadata$str() {
        return unableToObjectConnectionMetadata;
    }

    @Override
    public final void configuringFromFile(final String file) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000042: ")+ configuringFromFile$str()), file);
    }

    protected String configuringFromFile$str() {
        return configuringFromFile;
    }

    @Override
    public final void secondLevelCacheHits(final long secondLevelCacheHitCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000237: ")+ secondLevelCacheHits$str()), secondLevelCacheHitCount);
    }

    protected String secondLevelCacheHits$str() {
        return secondLevelCacheHits;
    }

    @Override
    public final void noDefaultConstructor(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000182: ")+ noDefaultConstructor$str()), name);
    }

    protected String noDefaultConstructor$str() {
        return noDefaultConstructor;
    }

    @Override
    public final void unableToReleaseCreatedMBeanServer(final String string) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000355: ")+ unableToReleaseCreatedMBeanServer$str()), string);
    }

    protected String unableToReleaseCreatedMBeanServer$str() {
        return unableToReleaseCreatedMBeanServer;
    }

    @Override
    public final String unableToPerformJdbcCommit() {
        String result = String.format(((projectCode +"000345: ")+ unableToPerformJdbcCommit$str()));
        return result;
    }

    protected String unableToPerformJdbcCommit$str() {
        return unableToPerformJdbcCommit;
    }

    @Override
    public final void collectionsFetched(final long collectionFetchCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000032: ")+ collectionsFetched$str()), collectionFetchCount);
    }

    protected String collectionsFetched$str() {
        return collectionsFetched;
    }

    @Override
    public final void unableToJoinTransaction(final String transactionStrategy) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000326: ")+ unableToJoinTransaction$str()), transactionStrategy);
    }

    protected String unableToJoinTransaction$str() {
        return unableToJoinTransaction;
    }

    @Override
    public final String jdbcUrlNotSpecified(final String url) {
        String result = String.format(((projectCode +"000152: ")+ jdbcUrlNotSpecified$str()), url);
        return result;
    }

    protected String jdbcUrlNotSpecified$str() {
        return jdbcUrlNotSpecified;
    }

    @Override
    public final void unableToCloseStreamError(final IOException error) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000297: ")+ unableToCloseStreamError$str()), error);
    }

    protected String unableToCloseStreamError$str() {
        return unableToCloseStreamError;
    }

    @Override
    public final void unableToObtainInitialContext(final NamingException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000343: ")+ unableToObtainInitialContext$str()));
    }

    protected String unableToObtainInitialContext$str() {
        return unableToObtainInitialContext;
    }

    @Override
    public final void unableToRetrieveTypeInfoResultSet(final String string) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000362: ")+ unableToRetrieveTypeInfoResultSet$str()), string);
    }

    protected String unableToRetrieveTypeInfoResultSet$str() {
        return unableToRetrieveTypeInfoResultSet;
    }

    @Override
    public final void unableToTransformClass(final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000373: ")+ unableToTransformClass$str()), message);
    }

    protected String unableToTransformClass$str() {
        return unableToTransformClass;
    }

    @Override
    public final void parsingXmlError(final int lineNumber, final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000196: ")+ parsingXmlError$str()), lineNumber, message);
    }

    protected String parsingXmlError$str() {
        return parsingXmlError;
    }

    @Override
    public final void duplicateListener(final String className) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000073: ")+ duplicateListener$str()), className);
    }

    protected String duplicateListener$str() {
        return duplicateListener;
    }

    @Override
    public final void unableToConstructSqlExceptionConverter(final Throwable t) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000303: ")+ unableToConstructSqlExceptionConverter$str()), t);
    }

    protected String unableToConstructSqlExceptionConverter$str() {
        return unableToConstructSqlExceptionConverter;
    }

    @Override
    public final void secondLevelCacheMisses(final long secondLevelCacheMissCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000238: ")+ secondLevelCacheMisses$str()), secondLevelCacheMissCount);
    }

    protected String secondLevelCacheMisses$str() {
        return secondLevelCacheMisses;
    }

    @Override
    public final void unregisteredResultSetWithoutStatement() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000386: ")+ unregisteredResultSetWithoutStatement$str()));
    }

    protected String unregisteredResultSetWithoutStatement$str() {
        return unregisteredResultSetWithoutStatement;
    }

    @Override
    public final void loadingCollectionKeyNotFound(final CollectionKey collectionKey) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000159: ")+ loadingCollectionKeyNotFound$str()), collectionKey);
    }

    protected String loadingCollectionKeyNotFound$str() {
        return loadingCollectionKeyNotFound;
    }

    @Override
    public final void forcingTableUse() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000107: ")+ forcingTableUse$str()));
    }

    protected String forcingTableUse$str() {
        return forcingTableUse;
    }

    @Override
    public final void disablingContextualLOBCreation(final String nonContextualLobCreation) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000421: ")+ disablingContextualLOBCreation$str()), nonContextualLobCreation);
    }

    protected String disablingContextualLOBCreation$str() {
        return disablingContextualLOBCreation;
    }

    @Override
    public final void unableToReleaseBatchStatement() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000352: ")+ unableToReleaseBatchStatement$str()));
    }

    protected String unableToReleaseBatchStatement$str() {
        return unableToReleaseBatchStatement;
    }

    @Override
    public final void collectionsLoaded(final long collectionLoadCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000033: ")+ collectionsLoaded$str()), collectionLoadCount);
    }

    protected String collectionsLoaded$str() {
        return collectionsLoaded;
    }

    @Override
    public final void jdbcDriverNotSpecified(final String driver) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000148: ")+ jdbcDriverNotSpecified$str()), driver);
    }

    protected String jdbcDriverNotSpecified$str() {
        return jdbcDriverNotSpecified;
    }

    @Override
    public final void unexpectedRowCounts() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000381: ")+ unexpectedRowCounts$str()));
    }

    protected String unexpectedRowCounts$str() {
        return unexpectedRowCounts;
    }

    @Override
    public final void stoppingService() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000255: ")+ stoppingService$str()));
    }

    protected String stoppingService$str() {
        return stoppingService;
    }

    @Override
    public final void unableToCleanUpPreparedStatement(final SQLException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000282: ")+ unableToCleanUpPreparedStatement$str()));
    }

    protected String unableToCleanUpPreparedStatement$str() {
        return unableToCleanUpPreparedStatement;
    }

    @Override
    public final void foreignKeys(final Set keySet) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000108: ")+ foreignKeys$str()), keySet);
    }

    protected String foreignKeys$str() {
        return foreignKeys;
    }

    @Override
    public final void timestampCacheMisses(final long updateTimestampsCachePutCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000435: ")+ timestampCacheMisses$str()), updateTimestampsCachePutCount);
    }

    protected String timestampCacheMisses$str() {
        return timestampCacheMisses;
    }

    @Override
    public final void writeLocksNotSupported(final String entityName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000416: ")+ writeLocksNotSupported$str()), entityName);
    }

    protected String writeLocksNotSupported$str() {
        return writeLocksNotSupported;
    }

    @Override
    public final void expectedType(final String name, final String string) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000091: ")+ expectedType$str()), name, string);
    }

    protected String expectedType$str() {
        return expectedType;
    }

    @Override
    public final void schemaExportUnsuccessful(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000231: ")+ schemaExportUnsuccessful$str()));
    }

    protected String schemaExportUnsuccessful$str() {
        return schemaExportUnsuccessful;
    }

    @Override
    public final void deprecatedForceDescriminatorAnnotation() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000062: ")+ deprecatedForceDescriminatorAnnotation$str()));
    }

    protected String deprecatedForceDescriminatorAnnotation$str() {
        return deprecatedForceDescriminatorAnnotation;
    }

    @Override
    public final void containsJoinFetchedCollection(final String role) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000051: ")+ containsJoinFetchedCollection$str()), role);
    }

    protected String containsJoinFetchedCollection$str() {
        return containsJoinFetchedCollection;
    }

    @Override
    public final void jdbcIsolationLevel(final String isolationLevelToString) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000149: ")+ jdbcIsolationLevel$str()), isolationLevelToString);
    }

    protected String jdbcIsolationLevel$str() {
        return jdbcIsolationLevel;
    }

    @Override
    public final void setManagerLookupClass() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000426: ")+ setManagerLookupClass$str()));
    }

    protected String setManagerLookupClass$str() {
        return setManagerLookupClass;
    }

    @Override
    public final void usingDriver(final String driverClassName, final String url) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000401: ")+ usingDriver$str()), driverClassName, url);
    }

    protected String usingDriver$str() {
        return usingDriver;
    }

    @Override
    public final String unableToQueryDatabaseMetadata() {
        String result = String.format(((projectCode +"000347: ")+ unableToQueryDatabaseMetadata$str()));
        return result;
    }

    protected String unableToQueryDatabaseMetadata$str() {
        return unableToQueryDatabaseMetadata;
    }

    @Override
    public final void unableToCompleteSchemaValidation(final SQLException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000300: ")+ unableToCompleteSchemaValidation$str()));
    }

    protected String unableToCompleteSchemaValidation$str() {
        return unableToCompleteSchemaValidation;
    }

    @Override
    public final void unableToStopHibernateService(final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000368: ")+ unableToStopHibernateService$str()));
    }

    protected String unableToStopHibernateService$str() {
        return unableToStopHibernateService;
    }

    @Override
    public final void noAppropriateConnectionProvider() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000181: ")+ noAppropriateConnectionProvider$str()));
    }

    protected String noAppropriateConnectionProvider$str() {
        return noAppropriateConnectionProvider;
    }

    @Override
    public final void unableToSetTransactionToRollbackOnly(final SystemException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000367: ")+ unableToSetTransactionToRollbackOnly$str()));
    }

    protected String unableToSetTransactionToRollbackOnly$str() {
        return unableToSetTransactionToRollbackOnly;
    }

    @Override
    public final void unableToExecuteResolver(final AbstractDialectResolver abstractDialectResolver, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000316: ")+ unableToExecuteResolver$str()), abstractDialectResolver, message);
    }

    protected String unableToExecuteResolver$str() {
        return unableToExecuteResolver;
    }

    @Override
    public final void hsqldbSupportsOnlyReadCommittedIsolation() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000118: ")+ hsqldbSupportsOnlyReadCommittedIsolation$str()));
    }

    protected String hsqldbSupportsOnlyReadCommittedIsolation$str() {
        return hsqldbSupportsOnlyReadCommittedIsolation;
    }

    @Override
    public final void unsupportedProperty(final Object propertyName, final Object newPropertyName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000395: ")+ unsupportedProperty$str()), propertyName, newPropertyName);
    }

    protected String unsupportedProperty$str() {
        return unsupportedProperty;
    }

    @Override
    public final void unableToInstantiateOptimizer(final String type) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000322: ")+ unableToInstantiateOptimizer$str()), type);
    }

    protected String unableToInstantiateOptimizer$str() {
        return unableToInstantiateOptimizer;
    }

    @Override
    public final void unableToCloseInitialContext(final String string) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000285: ")+ unableToCloseInitialContext$str()), string);
    }

    protected String unableToCloseInitialContext$str() {
        return unableToCloseInitialContext;
    }

    @Override
    public final void renamedProperty(final Object propertyName, final Object newPropertyName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000225: ")+ renamedProperty$str()), propertyName, newPropertyName);
    }

    protected String renamedProperty$str() {
        return renamedProperty;
    }

    @Override
    public final void entityManagerFactoryAlreadyRegistered(final String emfName, final String propertyName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000436: ")+ entityManagerFactoryAlreadyRegistered$str()), emfName, propertyName);
    }

    protected String entityManagerFactoryAlreadyRegistered$str() {
        return entityManagerFactoryAlreadyRegistered;
    }

    @Override
    public final void configuringFromResource(final String resource) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000043: ")+ configuringFromResource$str()), resource);
    }

    protected String configuringFromResource$str() {
        return configuringFromResource;
    }

    @Override
    public final void splitQueries(final String sourceQuery, final int length) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000245: ")+ splitQueries$str()), sourceQuery, length);
    }

    protected String splitQueries$str() {
        return splitQueries;
    }

    @Override
    public final void timestampCachePuts(final long updateTimestampsCachePutCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000433: ")+ timestampCachePuts$str()), updateTimestampsCachePutCount);
    }

    protected String timestampCachePuts$str() {
        return timestampCachePuts;
    }

    @Override
    public final void startTime(final long startTime) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000251: ")+ startTime$str()), startTime);
    }

    protected String startTime$str() {
        return startTime;
    }

    @Override
    public final void unableToInstantiateConfiguredSchemaNameResolver(final String resolverClassName, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000320: ")+ unableToInstantiateConfiguredSchemaNameResolver$str()), resolverClassName, message);
    }

    protected String unableToInstantiateConfiguredSchemaNameResolver$str() {
        return unableToInstantiateConfiguredSchemaNameResolver;
    }

    @Override
    public final void naturalIdQueriesExecuted(final long naturalIdQueriesExecutionCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000442: ")+ naturalIdQueriesExecuted$str()), naturalIdQueriesExecutionCount);
    }

    protected String naturalIdQueriesExecuted$str() {
        return naturalIdQueriesExecuted;
    }

    @Override
    public final void deprecatedUuidGenerator(final String name, final String name2) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000065: ")+ deprecatedUuidGenerator$str()), name, name2);
    }

    protected String deprecatedUuidGenerator$str() {
        return deprecatedUuidGenerator;
    }

    @Override
    public final void preparedStatementAlreadyInBatch(final String sql) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000202: ")+ preparedStatementAlreadyInBatch$str()), sql);
    }

    protected String preparedStatementAlreadyInBatch$str() {
        return preparedStatementAlreadyInBatch;
    }

    @Override
    public final void invalidSubStrategy(final String className) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000138: ")+ invalidSubStrategy$str()), className);
    }

    protected String invalidSubStrategy$str() {
        return invalidSubStrategy;
    }

    @Override
    public final void noSessionFactoryWithJndiName(final String sfJNDIName, final NameNotFoundException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000184: ")+ noSessionFactoryWithJndiName$str()), sfJNDIName);
    }

    protected String noSessionFactoryWithJndiName$str() {
        return noSessionFactoryWithJndiName;
    }

    @Override
    public final void ignoringUnrecognizedQueryHint(final String hintName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000121: ")+ ignoringUnrecognizedQueryHint$str()), hintName);
    }

    protected String ignoringUnrecognizedQueryHint$str() {
        return ignoringUnrecognizedQueryHint;
    }

    @Override
    public final void entitiesInserted(final long entityInsertCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000078: ")+ entitiesInserted$str()), entityInsertCount);
    }

    protected String entitiesInserted$str() {
        return entitiesInserted;
    }

    @Override
    public final void runningSchemaValidator() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000229: ")+ runningSchemaValidator$str()));
    }

    protected String runningSchemaValidator$str() {
        return runningSchemaValidator;
    }

    @Override
    public final void creatingSubcontextInfo(final String intermediateContextName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000053: ")+ creatingSubcontextInfo$str()), intermediateContextName);
    }

    protected String creatingSubcontextInfo$str() {
        return creatingSubcontextInfo;
    }

    @Override
    public final String jdbcRollbackFailed() {
        String result = String.format(((projectCode +"000151: ")+ jdbcRollbackFailed$str()));
        return result;
    }

    protected String jdbcRollbackFailed$str() {
        return jdbcRollbackFailed;
    }

    @Override
    public final void runningHbm2ddlSchemaExport() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000227: ")+ runningHbm2ddlSchemaExport$str()));
    }

    protected String runningHbm2ddlSchemaExport$str() {
        return runningHbm2ddlSchemaExport;
    }

    @Override
    public final void unableToDestroyCache(final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000308: ")+ unableToDestroyCache$str()), message);
    }

    protected String unableToDestroyCache$str() {
        return unableToDestroyCache;
    }

    @Override
    public final void illegalPropertySetterArgument(final String name, final String propertyName) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000123: ")+ illegalPropertySetterArgument$str()), name, propertyName);
    }

    protected String illegalPropertySetterArgument$str() {
        return illegalPropertySetterArgument;
    }

    @Override
    public final void readingMappingsFromFile(final String path) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000220: ")+ readingMappingsFromFile$str()), path);
    }

    protected String readingMappingsFromFile$str() {
        return readingMappingsFromFile;
    }

    @Override
    public final void unableToLocateMBeanServer() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000332: ")+ unableToLocateMBeanServer$str()));
    }

    protected String unableToLocateMBeanServer$str() {
        return unableToLocateMBeanServer;
    }

    @Override
    public final void disablingContextualLOBCreationSinceCreateClobFailed(final Throwable t) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000424: ")+ disablingContextualLOBCreationSinceCreateClobFailed$str()), t);
    }

    protected String disablingContextualLOBCreationSinceCreateClobFailed$str() {
        return disablingContextualLOBCreationSinceCreateClobFailed;
    }

    @Override
    public final void entityIdentifierValueBindingExists(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000429: ")+ entityIdentifierValueBindingExists$str()), name);
    }

    protected String entityIdentifierValueBindingExists$str() {
        return entityIdentifierValueBindingExists;
    }

    @Override
    public final void batchContainedStatementsOnRelease() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000010: ")+ batchContainedStatementsOnRelease$str()));
    }

    protected String batchContainedStatementsOnRelease$str() {
        return batchContainedStatementsOnRelease;
    }

    @Override
    public final void unableToPerformManagedFlush(final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000346: ")+ unableToPerformManagedFlush$str()), message);
    }

    protected String unableToPerformManagedFlush$str() {
        return unableToPerformManagedFlush;
    }

    @Override
    public final void immutableAnnotationOnNonRoot(final String className) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000124: ")+ immutableAnnotationOnNonRoot$str()), className);
    }

    protected String immutableAnnotationOnNonRoot$str() {
        return immutableAnnotationOnNonRoot;
    }

    @Override
    public final void usingReflectionOptimizer() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000406: ")+ usingReflectionOptimizer$str()));
    }

    protected String usingReflectionOptimizer$str() {
        return usingReflectionOptimizer;
    }

    @Override
    public final void unableToParseMetadata(final String packageName) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000344: ")+ unableToParseMetadata$str()), packageName);
    }

    protected String unableToParseMetadata$str() {
        return unableToParseMetadata;
    }

    @Override
    public final void startingServiceAtJndiName(final String boundName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000249: ")+ startingServiceAtJndiName$str()), boundName);
    }

    protected String startingServiceAtJndiName$str() {
        return startingServiceAtJndiName;
    }

    @Override
    public final void callingJoinTransactionOnNonJtaEntityManager() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000027: ")+ callingJoinTransactionOnNonJtaEntityManager$str()));
    }

    protected String callingJoinTransactionOnNonJtaEntityManager$str() {
        return callingJoinTransactionOnNonJtaEntityManager;
    }

    @Override
    public final void missingArguments(final int anticipatedNumberOfArguments, final int numberOfArguments) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000174: ")+ missingArguments$str()), anticipatedNumberOfArguments, numberOfArguments);
    }

    protected String missingArguments$str() {
        return missingArguments;
    }

    @Override
    public final void recognizedObsoleteHibernateNamespace(final String oldHibernateNamespace, final String hibernateNamespace) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000223: ")+ recognizedObsoleteHibernateNamespace$str()), oldHibernateNamespace, hibernateNamespace);
    }

    protected String recognizedObsoleteHibernateNamespace$str() {
        return recognizedObsoleteHibernateNamespace;
    }

    @Override
    public final void scopingTypesToSessionFactoryAfterAlreadyScoped(final org.hibernate.engine.spi.SessionFactoryImplementor factory, final org.hibernate.engine.spi.SessionFactoryImplementor factory2) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000233: ")+ scopingTypesToSessionFactoryAfterAlreadyScoped$str()), factory, factory2);
    }

    protected String scopingTypesToSessionFactoryAfterAlreadyScoped$str() {
        return scopingTypesToSessionFactoryAfterAlreadyScoped;
    }

    @Override
    public final void missingEntityAnnotation(final String className) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000175: ")+ missingEntityAnnotation$str()), className);
    }

    protected String missingEntityAnnotation$str() {
        return missingEntityAnnotation;
    }

    @Override
    public final void firstOrMaxResultsSpecifiedWithCollectionFetch() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000104: ")+ firstOrMaxResultsSpecifiedWithCollectionFetch$str()));
    }

    protected String firstOrMaxResultsSpecifiedWithCollectionFetch$str() {
        return firstOrMaxResultsSpecifiedWithCollectionFetch;
    }

    @Override
    public final void lazyPropertyFetchingAvailable(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000157: ")+ lazyPropertyFetchingAvailable$str()), name);
    }

    protected String lazyPropertyFetchingAvailable$str() {
        return lazyPropertyFetchingAvailable;
    }

    @Override
    public final void readingMappingsFromResource(final String resourceName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000221: ")+ readingMappingsFromResource$str()), resourceName);
    }

    protected String readingMappingsFromResource$str() {
        return readingMappingsFromResource;
    }

    @Override
    public final void unableToDeserializeCache(final String path, final SerializationException error) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000307: ")+ unableToDeserializeCache$str()), path, error);
    }

    protected String unableToDeserializeCache$str() {
        return unableToDeserializeCache;
    }

    @Override
    public final void cachedFileNotFound(final String path, final FileNotFoundException error) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000023: ")+ cachedFileNotFound$str()), path, error);
    }

    protected String cachedFileNotFound$str() {
        return cachedFileNotFound;
    }

    @Override
    public final void queryCacheMisses(final long queryCacheMissCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000214: ")+ queryCacheMisses$str()), queryCacheMissCount);
    }

    protected String queryCacheMisses$str() {
        return queryCacheMisses;
    }

    @Override
    public final void unableToLocateUuidGenerationStrategy(final String strategyClassName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000334: ")+ unableToLocateUuidGenerationStrategy$str()), strategyClassName);
    }

    protected String unableToLocateUuidGenerationStrategy$str() {
        return unableToLocateUuidGenerationStrategy;
    }

    @Override
    public final void entityManagerClosedBySomeoneElse(final String autoCloseSession) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000082: ")+ entityManagerClosedBySomeoneElse$str()), autoCloseSession);
    }

    protected String entityManagerClosedBySomeoneElse$str() {
        return entityManagerClosedBySomeoneElse;
    }

    @Override
    public final void disablingContextualLOBCreationSinceOldJdbcVersion(final int jdbcMajorVersion) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000423: ")+ disablingContextualLOBCreationSinceOldJdbcVersion$str()), jdbcMajorVersion);
    }

    protected String disablingContextualLOBCreationSinceOldJdbcVersion$str() {
        return disablingContextualLOBCreationSinceOldJdbcVersion;
    }

    @Override
    public final void unableToCloseConnection(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000284: ")+ unableToCloseConnection$str()));
    }

    protected String unableToCloseConnection$str() {
        return unableToCloseConnection;
    }

    @Override
    public final void unableToRollbackConnection(final Exception ignore) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000363: ")+ unableToRollbackConnection$str()), ignore);
    }

    protected String unableToRollbackConnection$str() {
        return unableToRollbackConnection;
    }

    @Override
    public final void foundMappingDocument(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000109: ")+ foundMappingDocument$str()), name);
    }

    protected String foundMappingDocument$str() {
        return foundMappingDocument;
    }

    @Override
    public final void requiredDifferentProvider(final String provider) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000226: ")+ requiredDifferentProvider$str()), provider);
    }

    protected String requiredDifferentProvider$str() {
        return requiredDifferentProvider;
    }

    @Override
    public final void unsupportedAfterStatement() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000390: ")+ unsupportedAfterStatement$str()));
    }

    protected String unsupportedAfterStatement$str() {
        return unsupportedAfterStatement;
    }

    @Override
    public final void duplicateGeneratorTable(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000070: ")+ duplicateGeneratorTable$str()), name);
    }

    protected String duplicateGeneratorTable$str() {
        return duplicateGeneratorTable;
    }

    @Override
    public final void proxoolProviderClassNotFound(final String proxoolProviderClassName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000209: ")+ proxoolProviderClassNotFound$str()), proxoolProviderClassName);
    }

    protected String proxoolProviderClassNotFound$str() {
        return proxoolProviderClassNotFound;
    }

    @Override
    public final void naturalIdMaxQueryTime(final long naturalIdQueryExecutionMaxTime) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000441: ")+ naturalIdMaxQueryTime$str()), naturalIdQueryExecutionMaxTime);
    }

    protected String naturalIdMaxQueryTime$str() {
        return naturalIdMaxQueryTime;
    }

    @Override
    public final void parsingXmlWarning(final int lineNumber, final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000198: ")+ parsingXmlWarning$str()), lineNumber, message);
    }

    protected String parsingXmlWarning$str() {
        return parsingXmlWarning;
    }

    @Override
    public final void namingExceptionAccessingFactory(final NamingException exception) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000178: ")+ namingExceptionAccessingFactory$str()), exception);
    }

    protected String namingExceptionAccessingFactory$str() {
        return namingExceptionAccessingFactory;
    }

    @Override
    public final void compositeIdClassDoesNotOverrideEquals(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000038: ")+ compositeIdClassDoesNotOverrideEquals$str()), name);
    }

    protected String compositeIdClassDoesNotOverrideEquals$str() {
        return compositeIdClassDoesNotOverrideEquals;
    }

    @Override
    public final void successfulTransactions(final long committedTransactionCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000258: ")+ successfulTransactions$str()), committedTransactionCount);
    }

    protected String successfulTransactions$str() {
        return successfulTransactions;
    }

    @Override
    public final void naturalIdCacheMisses(final long naturalIdCacheMissCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000440: ")+ naturalIdCacheMisses$str()), naturalIdCacheMissCount);
    }

    protected String naturalIdCacheMisses$str() {
        return naturalIdCacheMisses;
    }

    @Override
    public final void exceptionHeaderNotFound(final String exceptionHeader, final String metaInfOrmXml) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000086: ")+ exceptionHeaderNotFound$str()), exceptionHeader, metaInfOrmXml);
    }

    protected String exceptionHeaderNotFound$str() {
        return exceptionHeaderNotFound;
    }

    @Override
    public final void typeRegistrationOverridesPrevious(final String key, final Type old) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000270: ")+ typeRegistrationOverridesPrevious$str()), key, old);
    }

    protected String typeRegistrationOverridesPrevious$str() {
        return typeRegistrationOverridesPrevious;
    }

    @Override
    public final void warningsCreatingTempTable(final SQLWarning warning) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000413: ")+ warningsCreatingTempTable$str()), warning);
    }

    protected String warningsCreatingTempTable$str() {
        return warningsCreatingTempTable;
    }

    @Override
    public final void containerProvidingNullPersistenceUnitRootUrl() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000050: ")+ containerProvidingNullPersistenceUnitRootUrl$str()));
    }

    protected String containerProvidingNullPersistenceUnitRootUrl$str() {
        return containerProvidingNullPersistenceUnitRootUrl;
    }

    @Override
    public final void factoryUnboundFromName(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000098: ")+ factoryUnboundFromName$str()), name);
    }

    protected String factoryUnboundFromName$str() {
        return factoryUnboundFromName;
    }

    @Override
    public final void collectionsRecreated(final long collectionRecreateCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000034: ")+ collectionsRecreated$str()), collectionRecreateCount);
    }

    protected String collectionsRecreated$str() {
        return collectionsRecreated;
    }

    @Override
    public final void addingOverrideFor(final String name, final String name2) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000418: ")+ addingOverrideFor$str()), name, name2);
    }

    protected String addingOverrideFor$str() {
        return addingOverrideFor;
    }

    @Override
    public final void entitiesUpdated(final long entityUpdateCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000080: ")+ entitiesUpdated$str()), entityUpdateCount);
    }

    protected String entitiesUpdated$str() {
        return entitiesUpdated;
    }

    @Override
    public final void runningHbm2ddlSchemaUpdate() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000228: ")+ runningHbm2ddlSchemaUpdate$str()));
    }

    protected String runningHbm2ddlSchemaUpdate$str() {
        return runningHbm2ddlSchemaUpdate;
    }

    @Override
    public final void entitiesDeleted(final long entityDeleteCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000076: ")+ entitiesDeleted$str()), entityDeleteCount);
    }

    protected String entitiesDeleted$str() {
        return entitiesDeleted;
    }

    @Override
    public final void queryCacheHits(final long queryCacheHitCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000213: ")+ queryCacheHits$str()), queryCacheHitCount);
    }

    protected String queryCacheHits$str() {
        return queryCacheHits;
    }

    @Override
    public final void unableToBuildSessionFactoryUsingMBeanClasspath(final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000280: ")+ unableToBuildSessionFactoryUsingMBeanClasspath$str()), message);
    }

    protected String unableToBuildSessionFactoryUsingMBeanClasspath$str() {
        return unableToBuildSessionFactoryUsingMBeanClasspath;
    }

    @Override
    public final void sessionsClosed(final long sessionCloseCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000241: ")+ sessionsClosed$str()), sessionCloseCount);
    }

    protected String sessionsClosed$str() {
        return sessionsClosed;
    }

    @Override
    public final void unableToAccessEjb3Configuration(final NamingException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000271: ")+ unableToAccessEjb3Configuration$str()));
    }

    protected String unableToAccessEjb3Configuration$str() {
        return unableToAccessEjb3Configuration;
    }

    @Override
    public final void unableToMarkForRollbackOnTransientObjectException(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000338: ")+ unableToMarkForRollbackOnTransientObjectException$str()));
    }

    protected String unableToMarkForRollbackOnTransientObjectException$str() {
        return unableToMarkForRollbackOnTransientObjectException;
    }

    @Override
    public final void deprecatedTransactionManagerStrategy(final String name, final String transactionManagerStrategy, final String name2, final String jtaPlatform) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000427: ")+ deprecatedTransactionManagerStrategy$str()), name, transactionManagerStrategy, name2, jtaPlatform);
    }

    protected String deprecatedTransactionManagerStrategy$str() {
        return deprecatedTransactionManagerStrategy;
    }

    @Override
    public final void autoFlushWillNotWork() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000008: ")+ autoFlushWillNotWork$str()));
    }

    protected String autoFlushWillNotWork$str() {
        return autoFlushWillNotWork;
    }

    @Override
    public final void tableNotFound(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000262: ")+ tableNotFound$str()), name);
    }

    protected String tableNotFound$str() {
        return tableNotFound;
    }

    @Override
    public final void usingTimestampWorkaround() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000408: ")+ usingTimestampWorkaround$str()));
    }

    protected String usingTimestampWorkaround$str() {
        return usingTimestampWorkaround;
    }

    @Override
    public final void namedQueryError(final String queryName, final org.hibernate.HibernateException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000177: ")+ namedQueryError$str()), queryName);
    }

    protected String namedQueryError$str() {
        return namedQueryError;
    }

    @Override
    public final void processEqualityExpression() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000203: ")+ processEqualityExpression$str()));
    }

    protected String processEqualityExpression$str() {
        return processEqualityExpression;
    }

    @Override
    public final void tooManyInExpressions(final String dialectName, final int limit, final String paramName, final int size) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000443: ")+ tooManyInExpressions$str()), dialectName, limit, paramName, size);
    }

    protected String tooManyInExpressions$str() {
        return tooManyInExpressions;
    }

    @Override
    public final void unableToAccessTypeInfoResultSet(final String string) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000273: ")+ unableToAccessTypeInfoResultSet$str()), string);
    }

    protected String unableToAccessTypeInfoResultSet$str() {
        return unableToAccessTypeInfoResultSet;
    }

    @Override
    public final void providerClassDeprecated(final String providerClassName, final String actualProviderClassName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000208: ")+ providerClassDeprecated$str()), providerClassName, actualProviderClassName);
    }

    protected String providerClassDeprecated$str() {
        return providerClassDeprecated;
    }

    @Override
    public final void unableToReleaseTypeInfoResultSet() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000357: ")+ unableToReleaseTypeInfoResultSet$str()));
    }

    protected String unableToReleaseTypeInfoResultSet$str() {
        return unableToReleaseTypeInfoResultSet;
    }

    @Override
    public final void rdmsOs2200Dialect() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000218: ")+ rdmsOs2200Dialect$str()));
    }

    protected String rdmsOs2200Dialect$str() {
        return rdmsOs2200Dialect;
    }

    @Override
    public final String unableToDetermineTransactionStatus() {
        String result = String.format(((projectCode +"000312: ")+ unableToDetermineTransactionStatus$str()));
        return result;
    }

    protected String unableToDetermineTransactionStatus$str() {
        return unableToDetermineTransactionStatus;
    }

    @Override
    public final void sortAnnotationIndexedCollection() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000244: ")+ sortAnnotationIndexedCollection$str()));
    }

    protected String sortAnnotationIndexedCollection$str() {
        return sortAnnotationIndexedCollection;
    }

    @Override
    public final void unexpectedLiteralTokenType(final int type) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000380: ")+ unexpectedLiteralTokenType$str()), type);
    }

    protected String unexpectedLiteralTokenType$str() {
        return unexpectedLiteralTokenType;
    }

    @Override
    public final void hql(final String hql, final Long valueOf, final Long valueOf2) {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000117: ")+ hql$str()), hql, valueOf, valueOf2);
    }

    protected String hql$str() {
        return hql;
    }

    @Override
    public final void exceptionInAfterTransactionCompletionInterceptor(final Throwable e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000087: ")+ exceptionInAfterTransactionCompletionInterceptor$str()));
    }

    protected String exceptionInAfterTransactionCompletionInterceptor$str() {
        return exceptionInAfterTransactionCompletionInterceptor;
    }

    @Override
    public final void failSafeCollectionsCleanup(final CollectionLoadContext collectionLoadContext) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000100: ")+ failSafeCollectionsCleanup$str()), collectionLoadContext);
    }

    protected String failSafeCollectionsCleanup$str() {
        return failSafeCollectionsCleanup;
    }

    @Override
    public final void unableToCloseSessionDuringRollback(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000295: ")+ unableToCloseSessionDuringRollback$str()));
    }

    protected String unableToCloseSessionDuringRollback$str() {
        return unableToCloseSessionDuringRollback;
    }

    @Override
    public final void exceptionInBeforeTransactionCompletionInterceptor(final Throwable e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000088: ")+ exceptionInBeforeTransactionCompletionInterceptor$str()));
    }

    protected String exceptionInBeforeTransactionCompletionInterceptor$str() {
        return exceptionInBeforeTransactionCompletionInterceptor;
    }

    @Override
    public final void propertiesLoaded(final Properties maskOut) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000205: ")+ propertiesLoaded$str()), maskOut);
    }

    protected String propertiesLoaded$str() {
        return propertiesLoaded;
    }

    @Override
    public final void JavaSqlTypesMappedSameCodeMultipleTimes(final int code, final String old, final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000141: ")+ JavaSqlTypesMappedSameCodeMultipleTimes$str()), code, old, name);
    }

    protected String JavaSqlTypesMappedSameCodeMultipleTimes$str() {
        return JavaSqlTypesMappedSameCodeMultipleTimes;
    }

    @Override
    public final void unableToBindValueToParameter(final String nullSafeToString, final int index, final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000278: ")+ unableToBindValueToParameter$str()), nullSafeToString, index, message);
    }

    protected String unableToBindValueToParameter$str() {
        return unableToBindValueToParameter;
    }

    @Override
    public final void unableToUpdateQueryHiValue(final String tableName, final SQLException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000376: ")+ unableToUpdateQueryHiValue$str()), tableName);
    }

    protected String unableToUpdateQueryHiValue$str() {
        return unableToUpdateQueryHiValue;
    }

    @Override
    public final void unableToCloseInputStream(final IOException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000287: ")+ unableToCloseInputStream$str()));
    }

    protected String unableToCloseInputStream$str() {
        return unableToCloseInputStream;
    }

    @Override
    public final void unableToReadClass(final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000348: ")+ unableToReadClass$str()), message);
    }

    protected String unableToReadClass$str() {
        return unableToReadClass;
    }

    @Override
    public final void columns(final Set keySet) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000037: ")+ columns$str()), keySet);
    }

    protected String columns$str() {
        return columns;
    }

    @Override
    public final void persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000200: ")+ persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly$str()));
    }

    protected String persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly$str() {
        return persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly;
    }

    @Override
    public final void transactionStrategy(final String strategyClassName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000268: ")+ transactionStrategy$str()), strategyClassName);
    }

    protected String transactionStrategy$str() {
        return transactionStrategy;
    }

    @Override
    public final void unsupportedMultiTableBulkHqlJpaql(final int majorVersion, final int minorVersion, final int buildId) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000393: ")+ unsupportedMultiTableBulkHqlJpaql$str()), majorVersion, minorVersion, buildId);
    }

    protected String unsupportedMultiTableBulkHqlJpaql$str() {
        return unsupportedMultiTableBulkHqlJpaql;
    }

    @Override
    public final void incompleteMappingMetadataCacheProcessing() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000125: ")+ incompleteMappingMetadataCacheProcessing$str()));
    }

    protected String incompleteMappingMetadataCacheProcessing$str() {
        return incompleteMappingMetadataCacheProcessing;
    }

    @Override
    public final void propertyNotFound(final String property) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000207: ")+ propertyNotFound$str()), property);
    }

    protected String propertyNotFound$str() {
        return propertyNotFound;
    }

    @Override
    public final void typeDefinedNoRegistrationKeys(final BasicType type) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000269: ")+ typeDefinedNoRegistrationKeys$str()), type);
    }

    protected String typeDefinedNoRegistrationKeys$str() {
        return typeDefinedNoRegistrationKeys;
    }

    @Override
    public final void unableToReleaseCacheLock(final CacheException ce) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000353: ")+ unableToReleaseCacheLock$str()), ce);
    }

    protected String unableToReleaseCacheLock$str() {
        return unableToReleaseCacheLock;
    }

    @Override
    public final void bytecodeProvider(final String provider) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000021: ")+ bytecodeProvider$str()), provider);
    }

    protected String bytecodeProvider$str() {
        return bytecodeProvider;
    }

    @Override
    public final void subResolverException(final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000257: ")+ subResolverException$str()), message);
    }

    protected String subResolverException$str() {
        return subResolverException;
    }

    @Override
    public final void undeterminedH2Version() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000431: ")+ undeterminedH2Version$str()));
    }

    protected String undeterminedH2Version$str() {
        return undeterminedH2Version;
    }

    @Override
    public final void deprecatedOracleDialect() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000064: ")+ deprecatedOracleDialect$str()));
    }

    protected String deprecatedOracleDialect$str() {
        return deprecatedOracleDialect;
    }

    @Override
    public final void duplicateImport(final String entityName, final String rename) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000071: ")+ duplicateImport$str()), entityName, rename);
    }

    protected String duplicateImport$str() {
        return duplicateImport;
    }

    @Override
    public final void serviceProperties(final Properties properties) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000240: ")+ serviceProperties$str()), properties);
    }

    protected String serviceProperties$str() {
        return serviceProperties;
    }

    @Override
    public final void unableToGetDatabaseMetadata(final SQLException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000319: ")+ unableToGetDatabaseMetadata$str()));
    }

    protected String unableToGetDatabaseMetadata$str() {
        return unableToGetDatabaseMetadata;
    }

    @Override
    public final void closing() {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000031: ")+ closing$str()));
    }

    protected String closing$str() {
        return closing;
    }

    @Override
    public final void entitiesLoaded(final long entityLoadCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000079: ")+ entitiesLoaded$str()), entityLoadCount);
    }

    protected String entitiesLoaded$str() {
        return entitiesLoaded;
    }

    @Override
    public final void unableToLoadDerbyDriver(final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000328: ")+ unableToLoadDerbyDriver$str()), message);
    }

    protected String unableToLoadDerbyDriver$str() {
        return unableToLoadDerbyDriver;
    }

    @Override
    public final String unableToDetermineTransactionStatusAfterCommit() {
        String result = String.format(((projectCode +"000313: ")+ unableToDetermineTransactionStatusAfterCommit$str()));
        return result;
    }

    protected String unableToDetermineTransactionStatusAfterCommit$str() {
        return unableToDetermineTransactionStatusAfterCommit;
    }

    @Override
    public final String unableToRollbackJta() {
        String result = String.format(((projectCode +"000365: ")+ unableToRollbackJta$str()));
        return result;
    }

    protected String unableToRollbackJta$str() {
        return unableToRollbackJta;
    }

    @Override
    public final void unableToExecuteBatch(final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000315: ")+ unableToExecuteBatch$str()), message);
    }

    protected String unableToExecuteBatch$str() {
        return unableToExecuteBatch;
    }

    @Override
    public final void ignoringTableGeneratorConstraints(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000120: ")+ ignoringTableGeneratorConstraints$str()), name);
    }

    protected String ignoringTableGeneratorConstraints$str() {
        return ignoringTableGeneratorConstraints;
    }

    @Override
    public final void startingQueryCache(final String region) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000248: ")+ startingQueryCache$str()), region);
    }

    protected String startingQueryCache$str() {
        return startingQueryCache;
    }

    @Override
    public final void unableToConfigureSqlExceptionConverter(final org.hibernate.HibernateException e) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000301: ")+ unableToConfigureSqlExceptionConverter$str()), e);
    }

    protected String unableToConfigureSqlExceptionConverter$str() {
        return unableToConfigureSqlExceptionConverter;
    }

    @Override
    public final void unableToResolveAggregateFunction(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000359: ")+ unableToResolveAggregateFunction$str()), name);
    }

    protected String unableToResolveAggregateFunction$str() {
        return unableToResolveAggregateFunction;
    }

    @Override
    public final void invalidJndiName(final String name, final JndiNameException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000135: ")+ invalidJndiName$str()), name);
    }

    protected String invalidJndiName$str() {
        return invalidJndiName;
    }

    @Override
    public final void unableToBindFactoryToJndi(final org.hibernate.service.jndi.JndiException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000277: ")+ unableToBindFactoryToJndi$str()));
    }

    protected String unableToBindFactoryToJndi$str() {
        return unableToBindFactoryToJndi;
    }

    @Override
    public final void packageNotFound(final String packageName) {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000194: ")+ packageNotFound$str()), packageName);
    }

    protected String packageNotFound$str() {
        return packageNotFound;
    }

    @Override
    public final void unableToCloseInputStreamForResource(final String resourceName, final IOException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000288: ")+ unableToCloseInputStreamForResource$str()), resourceName);
    }

    protected String unableToCloseInputStreamForResource$str() {
        return unableToCloseInputStreamForResource;
    }

    @Override
    public final void transactionStartedOnNonRootSession() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000267: ")+ transactionStartedOnNonRootSession$str()));
    }

    protected String transactionStartedOnNonRootSession$str() {
        return transactionStartedOnNonRootSession;
    }

    @Override
    public final void configurationResource(final String resource) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000040: ")+ configurationResource$str()), resource);
    }

    protected String configurationResource$str() {
        return configurationResource;
    }

    @Override
    public final void maxQueryTime(final long queryExecutionMaxTime) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000173: ")+ maxQueryTime$str()), queryExecutionMaxTime);
    }

    protected String maxQueryTime$str() {
        return maxQueryTime;
    }

    @Override
    public final void indexes(final Set keySet) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000126: ")+ indexes$str()), keySet);
    }

    protected String indexes$str() {
        return indexes;
    }

    @Override
    public final void failSafeEntitiesCleanup(final EntityLoadContext entityLoadContext) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000101: ")+ failSafeEntitiesCleanup$str()), entityLoadContext);
    }

    protected String failSafeEntitiesCleanup$str() {
        return failSafeEntitiesCleanup;
    }

    @Override
    public final void transactions(final long transactionCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000266: ")+ transactions$str()), transactionCount);
    }

    protected String transactions$str() {
        return transactions;
    }

    @Override
    public final void unableToBindEjb3ConfigurationToJndi(final org.hibernate.service.jndi.JndiException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000276: ")+ unableToBindEjb3ConfigurationToJndi$str()));
    }

    protected String unableToBindEjb3ConfigurationToJndi$str() {
        return unableToBindEjb3ConfigurationToJndi;
    }

    @Override
    public final void unsupportedOracleVersion() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000394: ")+ unsupportedOracleVersion$str()));
    }

    protected String unsupportedOracleVersion$str() {
        return unsupportedOracleVersion;
    }

    @Override
    public final void gettersOfLazyClassesCannotBeFinal(final String entityName, final String name) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000112: ")+ gettersOfLazyClassesCannotBeFinal$str()), entityName, name);
    }

    protected String gettersOfLazyClassesCannotBeFinal$str() {
        return gettersOfLazyClassesCannotBeFinal;
    }

    @Override
    public final void unableToCleanUpCallableStatement(final SQLException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000281: ")+ unableToCleanUpCallableStatement$str()));
    }

    protected String unableToCleanUpCallableStatement$str() {
        return unableToCleanUpCallableStatement;
    }

    @Override
    public final void cannotResolveNonNullableTransientDependencies(final String transientEntityString, final Set dependentEntityStrings, final Set nonNullableAssociationPaths) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000437: ")+ cannotResolveNonNullableTransientDependencies$str()), transientEntityString, dependentEntityStrings, nonNullableAssociationPaths);
    }

    protected String cannotResolveNonNullableTransientDependencies$str() {
        return cannotResolveNonNullableTransientDependencies;
    }

    @Override
    public final String unableToReadHiValue(final String tableName) {
        String result = String.format(((projectCode +"000350: ")+ unableToReadHiValue$str()), tableName);
        return result;
    }

    protected String unableToReadHiValue$str() {
        return unableToReadHiValue;
    }

    @Override
    public final void cleaningUpConnectionPool(final String url) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000030: ")+ cleaningUpConnectionPool$str()), url);
    }

    protected String cleaningUpConnectionPool$str() {
        return cleaningUpConnectionPool;
    }

    @Override
    public final void duplicateGeneratorName(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000069: ")+ duplicateGeneratorName$str()), name);
    }

    protected String duplicateGeneratorName$str() {
        return duplicateGeneratorName;
    }

    @Override
    public final void unableToCloseOutputFile(final String outputFile, final IOException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000291: ")+ unableToCloseOutputFile$str()), outputFile);
    }

    protected String unableToCloseOutputFile$str() {
        return unableToCloseOutputFile;
    }

    @Override
    public final void noColumnsSpecifiedForIndex(final String indexName, final String tableName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000432: ")+ noColumnsSpecifiedForIndex$str()), indexName, tableName);
    }

    protected String noColumnsSpecifiedForIndex$str() {
        return noColumnsSpecifiedForIndex;
    }

    @Override
    public final void usingAstQueryTranslatorFactory() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000397: ")+ usingAstQueryTranslatorFactory$str()));
    }

    protected String usingAstQueryTranslatorFactory$str() {
        return usingAstQueryTranslatorFactory;
    }

    @Override
    public final void expired(final Object key) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000092: ")+ expired$str()), key);
    }

    protected String expired$str() {
        return expired;
    }

    @Override
    public final void unableToObtainConnectionMetadata(final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000341: ")+ unableToObtainConnectionMetadata$str()), message);
    }

    protected String unableToObtainConnectionMetadata$str() {
        return unableToObtainConnectionMetadata;
    }

    @Override
    public final void flushes(final long flushCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000105: ")+ flushes$str()), flushCount);
    }

    protected String flushes$str() {
        return flushes;
    }

    @Override
    public final void needsLimit() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000180: ")+ needsLimit$str()));
    }

    protected String needsLimit$str() {
        return needsLimit;
    }

    @Override
    public final void startingUpdateTimestampsCache(final String region) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000250: ")+ startingUpdateTimestampsCache$str()), region);
    }

    protected String startingUpdateTimestampsCache$str() {
        return startingUpdateTimestampsCache;
    }

    @Override
    public final void fetchingDatabaseMetadata() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000102: ")+ fetchingDatabaseMetadata$str()));
    }

    protected String fetchingDatabaseMetadata$str() {
        return fetchingDatabaseMetadata;
    }

    @Override
    public final void failed(final Throwable throwable) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000099: ")+ failed$str()), throwable);
    }

    protected String failed$str() {
        return failed;
    }

    @Override
    public final void unknownSqlServerVersion(final int databaseMajorVersion) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000385: ")+ unknownSqlServerVersion$str()), databaseMajorVersion);
    }

    protected String unknownSqlServerVersion$str() {
        return unknownSqlServerVersion;
    }

    @Override
    public final void forcingContainerResourceCleanup() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000106: ")+ forcingContainerResourceCleanup$str()));
    }

    protected String forcingContainerResourceCleanup$str() {
        return forcingContainerResourceCleanup;
    }

    @Override
    public final void willNotRegisterListeners() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000414: ")+ willNotRegisterListeners$str()));
    }

    protected String willNotRegisterListeners$str() {
        return willNotRegisterListeners;
    }

    @Override
    public final void unableToLoadProperties() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000329: ")+ unableToLoadProperties$str()));
    }

    protected String unableToLoadProperties$str() {
        return unableToLoadProperties;
    }

    @Override
    public final void configuredSessionFactory(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000041: ")+ configuredSessionFactory$str()), name);
    }

    protected String configuredSessionFactory$str() {
        return configuredSessionFactory;
    }

    @Override
    public final void naturalIdCachePuts(final long naturalIdCachePutCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000438: ")+ naturalIdCachePuts$str()), naturalIdCachePutCount);
    }

    protected String naturalIdCachePuts$str() {
        return naturalIdCachePuts;
    }

    @Override
    public final void unableToCleanupTemporaryIdTable(final Throwable t) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000283: ")+ unableToCleanupTemporaryIdTable$str()), t);
    }

    protected String unableToCleanupTemporaryIdTable$str() {
        return unableToCleanupTemporaryIdTable;
    }

    @Override
    public final void unableToToggleAutoCommit(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000372: ")+ unableToToggleAutoCommit$str()));
    }

    protected String unableToToggleAutoCommit$str() {
        return unableToToggleAutoCommit;
    }

    @Override
    public final String unableToCommitJta() {
        String result = String.format(((projectCode +"000298: ")+ unableToCommitJta$str()));
        return result;
    }

    protected String unableToCommitJta$str() {
        return unableToCommitJta;
    }

    @Override
    public final void jaccContextId(final String contextId) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000140: ")+ jaccContextId$str()), contextId);
    }

    protected String jaccContextId$str() {
        return jaccContextId;
    }

    @Override
    public final void parameterPositionOccurredAsBothJpaAndHibernatePositionalParameter(final Integer position) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000195: ")+ parameterPositionOccurredAsBothJpaAndHibernatePositionalParameter$str()), position);
    }

    protected String parameterPositionOccurredAsBothJpaAndHibernatePositionalParameter$str() {
        return parameterPositionOccurredAsBothJpaAndHibernatePositionalParameter;
    }

    @Override
    public final void version(final String versionString) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000412: ")+ version$str()), versionString);
    }

    protected String version$str() {
        return version;
    }

    @Override
    public final void unableToReleaseIsolatedConnection(final Throwable ignore) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000356: ")+ unableToReleaseIsolatedConnection$str()), ignore);
    }

    protected String unableToReleaseIsolatedConnection$str() {
        return unableToReleaseIsolatedConnection;
    }

    @Override
    public final void unableToClosePooledConnection(final SQLException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000293: ")+ unableToClosePooledConnection$str()));
    }

    protected String unableToClosePooledConnection$str() {
        return unableToClosePooledConnection;
    }

    @Override
    public final void deprecatedDerbyDialect() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000430: ")+ deprecatedDerbyDialect$str()));
    }

    protected String deprecatedDerbyDialect$str() {
        return deprecatedDerbyDialect;
    }

    @Override
    public final void unableToCloseInputFiles(final String name, final IOException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000286: ")+ unableToCloseInputFiles$str()), name);
    }

    protected String unableToCloseInputFiles$str() {
        return unableToCloseInputFiles;
    }

    @Override
    public final void unableToCopySystemProperties() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000304: ")+ unableToCopySystemProperties$str()));
    }

    protected String unableToCopySystemProperties$str() {
        return unableToCopySystemProperties;
    }

    @Override
    public final void unableToDetermineLockModeValue(final String hintName, final Object value) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000311: ")+ unableToDetermineLockModeValue$str()), hintName, value);
    }

    protected String unableToDetermineLockModeValue$str() {
        return unableToDetermineLockModeValue;
    }

    @Override
    public final void validatorNotFound() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000410: ")+ validatorNotFound$str()));
    }

    protected String validatorNotFound$str() {
        return validatorNotFound;
    }

    @Override
    public final void unableToReadColumnValueFromResultSet(final String name, final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000349: ")+ unableToReadColumnValueFromResultSet$str()), name, message);
    }

    protected String unableToReadColumnValueFromResultSet$str() {
        return unableToReadColumnValueFromResultSet;
    }

    @Override
    public final void unsuccessfulCreate(final String string) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000389: ")+ unsuccessfulCreate$str()), string);
    }

    protected String unsuccessfulCreate$str() {
        return unsuccessfulCreate;
    }

    @Override
    public final void synchronizationAlreadyRegistered(final javax.transaction.Synchronization synchronization) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000259: ")+ synchronizationAlreadyRegistered$str()), synchronization);
    }

    protected String synchronizationAlreadyRegistered$str() {
        return synchronizationAlreadyRegistered;
    }

    @Override
    public final void unableToRollbackIsolatedTransaction(final Exception e, final Exception ignore) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000364: ")+ unableToRollbackIsolatedTransaction$str()), e, ignore);
    }

    protected String unableToRollbackIsolatedTransaction$str() {
        return unableToRollbackIsolatedTransaction;
    }

    @Override
    public final void unableToLocateCustomOptimizerClass(final String type) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000321: ")+ unableToLocateCustomOptimizerClass$str()), type);
    }

    protected String unableToLocateCustomOptimizerClass$str() {
        return unableToLocateCustomOptimizerClass;
    }

    @Override
    public final void unableToSynchronizeDatabaseStateWithSession(final org.hibernate.HibernateException he) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000371: ")+ unableToSynchronizeDatabaseStateWithSession$str()), he);
    }

    protected String unableToSynchronizeDatabaseStateWithSession$str() {
        return unableToSynchronizeDatabaseStateWithSession;
    }

    @Override
    public final void exceptionInSubResolver(final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000089: ")+ exceptionInSubResolver$str()), message);
    }

    protected String exceptionInSubResolver$str() {
        return exceptionInSubResolver;
    }

    @Override
    public final void unableToRemoveBagJoinFetch() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000358: ")+ unableToRemoveBagJoinFetch$str()));
    }

    protected String unableToRemoveBagJoinFetch$str() {
        return unableToRemoveBagJoinFetch;
    }

    @Override
    public final void jndiNameDoesNotHandleSessionFactoryReference(final String sfJNDIName, final ClassCastException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000155: ")+ jndiNameDoesNotHandleSessionFactoryReference$str()), sfJNDIName);
    }

    protected String jndiNameDoesNotHandleSessionFactoryReference$str() {
        return jndiNameDoesNotHandleSessionFactoryReference;
    }

    @Override
    public final void unsuccessful(final String sql) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000388: ")+ unsuccessful$str()), sql);
    }

    protected String unsuccessful$str() {
        return unsuccessful;
    }

    @Override
    public final void instantiatingExplicitConnectionProvider(final String providerClassName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000130: ")+ instantiatingExplicitConnectionProvider$str()), providerClassName);
    }

    protected String instantiatingExplicitConnectionProvider$str() {
        return instantiatingExplicitConnectionProvider;
    }

    @Override
    public final void unableToDestroyQueryCache(final String region, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000309: ")+ unableToDestroyQueryCache$str()), region, message);
    }

    protected String unableToDestroyQueryCache$str() {
        return unableToDestroyQueryCache;
    }

    @Override
    public final void invalidPrimaryKeyJoinColumnAnnotation() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000137: ")+ invalidPrimaryKeyJoinColumnAnnotation$str()));
    }

    protected String invalidPrimaryKeyJoinColumnAnnotation$str() {
        return invalidPrimaryKeyJoinColumnAnnotation;
    }

    @Override
    public final void invalidTableAnnotation(final String className) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000139: ")+ invalidTableAnnotation$str()), className);
    }

    protected String invalidTableAnnotation$str() {
        return invalidTableAnnotation;
    }

    @Override
    public final void handlingTransientEntity() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000114: ")+ handlingTransientEntity$str()));
    }

    protected String handlingTransientEntity$str() {
        return handlingTransientEntity;
    }

    @Override
    public final void noPersistentClassesFound(final String query) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000183: ")+ noPersistentClassesFound$str()), query);
    }

    protected String noPersistentClassesFound$str() {
        return noPersistentClassesFound;
    }

    @Override
    public final Object unableToUpdateHiValue(final String tableName) {
        Object result = String.format(((projectCode +"000375: ")+ unableToUpdateHiValue$str()), tableName);
        return result;
    }

    protected String unableToUpdateHiValue$str() {
        return unableToUpdateHiValue;
    }

    @Override
    public final void unableToReadOrInitHiValue(final SQLException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000351: ")+ unableToReadOrInitHiValue$str()));
    }

    protected String unableToReadOrInitHiValue$str() {
        return unableToReadOrInitHiValue;
    }

    @Override
    public final void c3p0ProviderClassNotFound(final String c3p0ProviderClassName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000022: ")+ c3p0ProviderClassNotFound$str()), c3p0ProviderClassName);
    }

    protected String c3p0ProviderClassNotFound$str() {
        return c3p0ProviderClassNotFound;
    }

    @Override
    public final void invalidEditOfReadOnlyItem(final Object key) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000134: ")+ invalidEditOfReadOnlyItem$str()), key);
    }

    protected String invalidEditOfReadOnlyItem$str() {
        return invalidEditOfReadOnlyItem;
    }

    @Override
    public final void unableToAccessSessionFactory(final String sfJNDIName, final NamingException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000272: ")+ unableToAccessSessionFactory$str()), sfJNDIName);
    }

    protected String unableToAccessSessionFactory$str() {
        return unableToAccessSessionFactory;
    }

    @Override
    public final void localLoadingCollectionKeysCount(final int size) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000160: ")+ localLoadingCollectionKeysCount$str()), size);
    }

    protected String localLoadingCollectionKeysCount$str() {
        return localLoadingCollectionKeysCount;
    }

    @Override
    public final void unableToSwitchToMethodUsingColumnIndex(final Method method) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000370: ")+ unableToSwitchToMethodUsingColumnIndex$str()), method);
    }

    protected String unableToSwitchToMethodUsingColumnIndex$str() {
        return unableToSwitchToMethodUsingColumnIndex;
    }

    @Override
    public final void unableToCloseStream(final IOException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000296: ")+ unableToCloseStream$str()));
    }

    protected String unableToCloseStream$str() {
        return unableToCloseStream;
    }

    @Override
    public final void unableToReleaseContext(final String message) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000354: ")+ unableToReleaseContext$str()), message);
    }

    protected String unableToReleaseContext$str() {
        return unableToReleaseContext;
    }

    @Override
    public final void entityMappedAsNonAbstract(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000084: ")+ entityMappedAsNonAbstract$str()), name);
    }

    protected String entityMappedAsNonAbstract$str() {
        return entityMappedAsNonAbstract;
    }

    @Override
    public final void unknownIngresVersion(final int databaseMajorVersion) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000383: ")+ unknownIngresVersion$str()), databaseMajorVersion);
    }

    protected String unknownIngresVersion$str() {
        return unknownIngresVersion;
    }

    @Override
    public final void unableToMarkForRollbackOnPersistenceException(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000337: ")+ unableToMarkForRollbackOnPersistenceException$str()));
    }

    protected String unableToMarkForRollbackOnPersistenceException$str() {
        return unableToMarkForRollbackOnPersistenceException;
    }

    @Override
    public final void factoryUnboundFromJndiName(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000097: ")+ factoryUnboundFromJndiName$str()), name);
    }

    protected String factoryUnboundFromJndiName$str() {
        return factoryUnboundFromJndiName;
    }

    @Override
    public final void unableToFindPersistenceXmlInClasspath() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000318: ")+ unableToFindPersistenceXmlInClasspath$str()));
    }

    protected String unableToFindPersistenceXmlInClasspath$str() {
        return unableToFindPersistenceXmlInClasspath;
    }

    @Override
    public final void readOnlyCacheConfiguredForMutableCollection(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000222: ")+ readOnlyCacheConfiguredForMutableCollection$str()), name);
    }

    protected String readOnlyCacheConfiguredForMutableCollection$str() {
        return readOnlyCacheConfiguredForMutableCollection;
    }

    @Override
    public final void unableToWriteCachedFile(final String path, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000378: ")+ unableToWriteCachedFile$str()), path, message);
    }

    protected String unableToWriteCachedFile$str() {
        return unableToWriteCachedFile;
    }

    @Override
    public final void invalidArrayElementType(final String message) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000132: ")+ invalidArrayElementType$str()), message);
    }

    protected String invalidArrayElementType$str() {
        return invalidArrayElementType;
    }

    @Override
    public final void propertiesNotFound() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000206: ")+ propertiesNotFound$str()));
    }

    protected String propertiesNotFound$str() {
        return propertiesNotFound;
    }

    @Override
    public final void configuringFromUrl(final URL url) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000044: ")+ configuringFromUrl$str()), url);
    }

    protected String configuringFromUrl$str() {
        return configuringFromUrl;
    }

    @Override
    public final void collectionsUpdated(final long collectionUpdateCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000036: ")+ collectionsUpdated$str()), collectionUpdateCount);
    }

    protected String collectionsUpdated$str() {
        return collectionsUpdated;
    }

    @Override
    public final void configuringFromXmlDocument() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000045: ")+ configuringFromXmlDocument$str()));
    }

    protected String configuringFromXmlDocument$str() {
        return configuringFromXmlDocument;
    }

    @Override
    public final void unableToUnbindFactoryFromJndi(final org.hibernate.service.jndi.JndiException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000374: ")+ unableToUnbindFactoryFromJndi$str()));
    }

    protected String unableToUnbindFactoryFromJndi$str() {
        return unableToUnbindFactoryFromJndi;
    }

    @Override
    public final void unableToDestroyUpdateTimestampsCache(final String region, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000310: ")+ unableToDestroyUpdateTimestampsCache$str()), region, message);
    }

    protected String unableToDestroyUpdateTimestampsCache$str() {
        return unableToDestroyUpdateTimestampsCache;
    }

    @Override
    public final void settersOfLazyClassesCannotBeFinal(final String entityName, final String name) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000243: ")+ settersOfLazyClassesCannotBeFinal$str()), entityName, name);
    }

    protected String settersOfLazyClassesCannotBeFinal$str() {
        return settersOfLazyClassesCannotBeFinal;
    }

    @Override
    public final void unableToApplyConstraints(final String className, final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000274: ")+ unableToApplyConstraints$str()), className);
    }

    protected String unableToApplyConstraints$str() {
        return unableToApplyConstraints;
    }

    @Override
    public final void resolvedSqlTypeDescriptorForDifferentSqlCode(final String name, final String valueOf, final String name2, final String valueOf2) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000419: ")+ resolvedSqlTypeDescriptorForDifferentSqlCode$str()), name, valueOf, name2, valueOf2);
    }

    protected String resolvedSqlTypeDescriptorForDifferentSqlCode$str() {
        return resolvedSqlTypeDescriptorForDifferentSqlCode;
    }

    @Override
    public final void usingOldDtd() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000404: ")+ usingOldDtd$str()));
    }

    protected String usingOldDtd$str() {
        return usingOldDtd;
    }

    @Override
    public final void unableToCloseSessionButSwallowingError(final org.hibernate.HibernateException e) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000425: ")+ unableToCloseSessionButSwallowingError$str()), e);
    }

    protected String unableToCloseSessionButSwallowingError$str() {
        return unableToCloseSessionButSwallowingError;
    }

    @Override
    public final void sqlWarning(final int errorCode, final String sqlState) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000247: ")+ sqlWarning$str()), errorCode, sqlState);
    }

    protected String sqlWarning$str() {
        return sqlWarning;
    }

    @Override
    public final void factoryBoundToJndiName(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000094: ")+ factoryBoundToJndiName$str()), name);
    }

    protected String factoryBoundToJndiName$str() {
        return factoryBoundToJndiName;
    }

    @Override
    public final void synchronizationFailed(final javax.transaction.Synchronization synchronization, final Throwable t) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000260: ")+ synchronizationFailed$str()), synchronization, t);
    }

    protected String synchronizationFailed$str() {
        return synchronizationFailed;
    }

    @Override
    public final void unableToResolveMappingFile(final String xmlFile) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000360: ")+ unableToResolveMappingFile$str()), xmlFile);
    }

    protected String unableToResolveMappingFile$str() {
        return unableToResolveMappingFile;
    }

    @Override
    public final void unableToCompleteSchemaUpdate(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000299: ")+ unableToCompleteSchemaUpdate$str()));
    }

    protected String unableToCompleteSchemaUpdate$str() {
        return unableToCompleteSchemaUpdate;
    }

    @Override
    public final void unableToCloseSession(final org.hibernate.HibernateException e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000294: ")+ unableToCloseSession$str()));
    }

    protected String unableToCloseSession$str() {
        return unableToCloseSession;
    }

    @Override
    public final void updatingSchema() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000396: ")+ updatingSchema$str()));
    }

    protected String updatingSchema$str() {
        return updatingSchema;
    }

    @Override
    public final void unsupportedIngresVersion() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000391: ")+ unsupportedIngresVersion$str()));
    }

    protected String unsupportedIngresVersion$str() {
        return unsupportedIngresVersion;
    }

    @Override
    public final void unableToDropTemporaryIdTable(final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000314: ")+ unableToDropTemporaryIdTable$str()), message);
    }

    protected String unableToDropTemporaryIdTable$str() {
        return unableToDropTemporaryIdTable;
    }

    @Override
    public final void unableToLogWarnings(final SQLException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000336: ")+ unableToLogWarnings$str()));
    }

    protected String unableToLogWarnings$str() {
        return unableToLogWarnings;
    }

    @Override
    public final void pooledOptimizerReportedInitialValue(final IntegralDataTypeHolder value) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000201: ")+ pooledOptimizerReportedInitialValue$str()), value);
    }

    protected String pooledOptimizerReportedInitialValue$str() {
        return pooledOptimizerReportedInitialValue;
    }

    @Override
    public final void statementsPrepared(final long prepareStatementCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000253: ")+ statementsPrepared$str()), prepareStatementCount);
    }

    protected String statementsPrepared$str() {
        return statementsPrepared;
    }

    @Override
    public final void readingCachedMappings(final File cachedFile) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000219: ")+ readingCachedMappings$str()), cachedFile);
    }

    protected String readingCachedMappings$str() {
        return readingCachedMappings;
    }

    @Override
    public final void collectionsRemoved(final long collectionRemoveCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000035: ")+ collectionsRemoved$str()), collectionRemoveCount);
    }

    protected String collectionsRemoved$str() {
        return collectionsRemoved;
    }

    @Override
    public final void usingDefaultTransactionStrategy() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000399: ")+ usingDefaultTransactionStrategy$str()));
    }

    protected String usingDefaultTransactionStrategy$str() {
        return usingDefaultTransactionStrategy;
    }

    @Override
    public final void parsingXmlWarningForFile(final String file, final int lineNumber, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000199: ")+ parsingXmlWarningForFile$str()), file, lineNumber, message);
    }

    protected String parsingXmlWarningForFile$str() {
        return parsingXmlWarningForFile;
    }

    @Override
    public final void processingPersistenceUnitInfoName(final String persistenceUnitName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000204: ")+ processingPersistenceUnitInfoName$str()), persistenceUnitName);
    }

    protected String processingPersistenceUnitInfoName$str() {
        return processingPersistenceUnitInfoName;
    }

    @Override
    public final void searchingForMappingDocuments(final String name) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000235: ")+ searchingForMappingDocuments$str()), name);
    }

    protected String searchingForMappingDocuments$str() {
        return searchingForMappingDocuments;
    }

    @Override
    public final void unableToLoadCommand(final org.hibernate.HibernateException e) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000327: ")+ unableToLoadCommand$str()), e);
    }

    protected String unableToLoadCommand$str() {
        return unableToLoadCommand;
    }

    @Override
    public final void usingHibernateBuiltInConnectionPool() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000402: ")+ usingHibernateBuiltInConnectionPool$str()));
    }

    protected String usingHibernateBuiltInConnectionPool$str() {
        return usingHibernateBuiltInConnectionPool;
    }

    @Override
    public final void compositeIdClassDoesNotOverrideHashCode(final String name) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000039: ")+ compositeIdClassDoesNotOverrideHashCode$str()), name);
    }

    protected String compositeIdClassDoesNotOverrideHashCode$str() {
        return compositeIdClassDoesNotOverrideHashCode;
    }

    @Override
    public final void illegalPropertyGetterArgument(final String name, final String propertyName) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000122: ")+ illegalPropertyGetterArgument$str()), name, propertyName);
    }

    protected String illegalPropertyGetterArgument$str() {
        return illegalPropertyGetterArgument;
    }

    @Override
    public final void duplicateJoins(final String entityName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000072: ")+ duplicateJoins$str()), entityName);
    }

    protected String duplicateJoins$str() {
        return duplicateJoins;
    }

    @Override
    public final void unableToLocateConfiguredSchemaNameResolver(final String resolverClassName, final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000331: ")+ unableToLocateConfiguredSchemaNameResolver$str()), resolverClassName, message);
    }

    protected String unableToLocateConfiguredSchemaNameResolver$str() {
        return unableToLocateConfiguredSchemaNameResolver;
    }

    @Override
    public final void unableToRunSchemaUpdate(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000366: ")+ unableToRunSchemaUpdate$str()));
    }

    protected String unableToRunSchemaUpdate$str() {
        return unableToRunSchemaUpdate;
    }

    @Override
    public final void exceptionHeaderFound(final String exceptionHeader, final String metaInfOrmXml) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000085: ")+ exceptionHeaderFound$str()), exceptionHeader, metaInfOrmXml);
    }

    protected String exceptionHeaderFound$str() {
        return exceptionHeaderFound;
    }

    @Override
    public final void closingUnreleasedBatch() {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000420: ")+ closingUnreleasedBatch$str()));
    }

    protected String closingUnreleasedBatch$str() {
        return closingUnreleasedBatch;
    }

    @Override
    public final void naturalIdCacheHits(final long naturalIdCacheHitCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000439: ")+ naturalIdCacheHits$str()), naturalIdCacheHitCount);
    }

    protected String naturalIdCacheHits$str() {
        return naturalIdCacheHits;
    }

    @Override
    public final void unableToObtainConnectionToQueryMetadata(final String message) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000342: ")+ unableToObtainConnectionToQueryMetadata$str()), message);
    }

    protected String unableToObtainConnectionToQueryMetadata$str() {
        return unableToObtainConnectionToQueryMetadata;
    }

    @Override
    public final void unableToBuildEnhancementMetamodel(final String className) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000279: ")+ unableToBuildEnhancementMetamodel$str()), className);
    }

    protected String unableToBuildEnhancementMetamodel$str() {
        return unableToBuildEnhancementMetamodel;
    }

    @Override
    public final void couldNotBindJndiListener() {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000127: ")+ couldNotBindJndiListener$str()));
    }

    protected String couldNotBindJndiListener$str() {
        return couldNotBindJndiListener;
    }

    @Override
    public final void guidGenerated(final String result) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000113: ")+ guidGenerated$str()), result);
    }

    protected String guidGenerated$str() {
        return guidGenerated;
    }

    @Override
    public final void optimisticLockFailures(final long optimisticFailureCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000187: ")+ optimisticLockFailures$str()), optimisticFailureCount);
    }

    protected String optimisticLockFailures$str() {
        return optimisticLockFailures;
    }

    @Override
    public final void queriesExecuted(final long queryExecutionCount) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000210: ")+ queriesExecuted$str()), queryExecutionCount);
    }

    protected String queriesExecuted$str() {
        return queriesExecuted;
    }

    @Override
    public final void hibernateConnectionPoolSize(final int poolSize) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000115: ")+ hibernateConnectionPoolSize$str()), poolSize);
    }

    protected String hibernateConnectionPoolSize$str() {
        return hibernateConnectionPoolSize;
    }

    @Override
    public final void factoryJndiRename(final String oldName, final String newName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000096: ")+ factoryJndiRename$str()), oldName, newName);
    }

    protected String factoryJndiRename$str() {
        return factoryJndiRename;
    }

    @Override
    public final void unableToCloseIterator(final SQLException e) {
        log.logf(FQCN, (Logger.Level.INFO), (e), ((projectCode +"000289: ")+ unableToCloseIterator$str()));
    }

    protected String unableToCloseIterator$str() {
        return unableToCloseIterator;
    }

}
