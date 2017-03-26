
package org.hibernate.search.util.logging.impl;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Properties;
import javax.annotation.Generated;
import org.apache.lucene.index.CorruptIndexException;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.model.MessageLoggerImplementor", date = "2012-05-09T11:27:45+0100")
public class Log_$logger
    implements Serializable, Log, BasicLogger
{

    private final static long serialVersionUID = 1L;
    private final static String projectCode = "HSEARCH";
    private final static String FQCN = Log_$logger.class.getName();
    protected final Logger log;
    private final static String unableToDeserializeAvroStream = "Unable to deserialize Avro stream";
    private final static String unableToRetrieveNamedAnalyzer = "Unable to retrieve named analyzer: %1$s";
    private final static String messageReceivedForUndefinedIndex = "Received a remote message about an unknown index '%1$s': discarding message!";
    private final static String shuttingDownBackend = "Shutting down backend for IndexManager '%1$s'";
    private final static String unableToConvertSerializableStoreToLuceneStore = "Unable to convert serializable Store to Lucene Store: %1$s";
    private final static String needAtLeastOneIndexedEntityType = "At least one entity type must be provided: can't open an IndexReader on nothing";
    private final static String exceptionDuringIndexMergeOperation = "Exception during index Merge operation";
    private final static String jGroupsDisconnectingAndClosingChannel = "Disconnecting and closing JGroups Channel";
    private final static String requestedIndexNotDefined = "Index names %1$s is not defined";
    private final static String unableToReadSerializedLuceneWorks = "Unable to read serialized List<LuceneWork>";
    private final static String massIndexerUnexpectedErrorMessage = "Unexpected error during MassIndexer operation";
    private final static String unableToConvertSerializableTermVectorToLuceneTermVector = "Unable to convert serializable TermVector to Lucene TermVector: %1$s";
    private final static String indexingCompletedAndMBeanUnregistered = "Indexing completed. Reindexed %1$d entities. Unregistering MBean from server";
    private final static String cantOpenCorruptedIndex = "Could not open Lucene index: index data is corrupted. index name: '%1$s'";
    private final static String unexpectedValueMissingFromFieldCache = "Unexpected: value is missing from FieldCache. This is likely a bug in the FieldCache implementation, Hibernate Search might have to workaround this by slightly inaccurate faceting values or reduced performance.";
    private final static String incompatibleProtocolVersion = "Unable to parse message from protocol version %1$d.%2$d. Current protocol version: %3$d.%4$d";
    private final static String jGroupsFlushNotPresentInStack = "FLUSH is not present in your JGroups stack!  FLUSH is needed to ensure messages are not dropped while new nodes join the cluster.  Will proceed, but inconsistencies may arise!";
    private final static String incorrectMessageType = "Incorrect message type: %1$s";
    private final static String recommendConfiguringLuceneVersion = "Configuration setting hibernate.search.lucene_version was not specified, using LUCENE_CURRENT.";
    private final static String nullIsInvalidIndexedType = "'null' is not a valid indexed type";
    private final static String initializedBlackholeBackend = "initialized \"blackhole\" backend. Index changes will be prepared but discarded!";
    private final static String noCurrentMarkerInSourceDirectory = "No current marker in source directory. Has the master being started already?";
    private final static String notDeleted = "Could not delete %1$s";
    private final static String unableToReadTokenStream = "Unable to read TokenStream";
    private final static String terminatingBatchWorkCanCauseInconsistentState = "Terminating batch work! Index might end up in inconsistent state.";
    private final static String unableToSerializeLuceneWorks = "Unable to serialize List<LuceneWork>";
    private final static String jGroupsConnectedToCluster = "Connected to cluster [ %1$s ]. The node address is %2$s";
    private final static String containedInPointsToProvidedId = "@ContainedIn is pointing to an entity having @ProvidedId: %1$s. This is not supported, indexing of contained in entities will be skipped. Indexed data of the embedded object might become out of date in objects of type ";
    private final static String jGroupsClosingChannelError = "Problem closing channel; setting it to null";
    private final static String notChangeTimestamp = "Could not change timestamp for %1$s. Index synchronization may be slow.";
    private final static String unableToRetrieveObjectFromMessage = "Unable to retrieve object from message: %1$s";
    private final static String ioExceptionOnIndex = "An IOException happened while accessing the Lucene index '%1$s'";
    private final static String updatedDirectoryProviders = "update DirectoryProviders \"blackhole\" backend. Index changes will be prepared but discarded!";
    private final static String indexingSpeed = "Indexing speed: %1$f documents/second; progress: %2$.2f%%";
    private final static String receivedEmptyLuceneWorksInMessage = "Received null or empty Lucene works list in message.";
    private final static String cannotOpenIndexWriterCausePreviousError = "Couldn't open the IndexWriter because of previous error: operation skipped, index ouf of sync!";
    private final static String illegalObjectRetrievedFromMessage = "Illegal object retrieved from message";
    private final static String unableToCloseLuceneDirectory = "Unable to properly close Lucene directory %1$s";
    private final static String forcingReleaseIndexWriterLock = "Going to force release of the IndexWriter lock";
    private final static String forceSkipIndexOperationViaInterception = "Interceptor enforces skip index operation %2$s on instance of class %1$s";
    private final static String unableToInitializeIndexManager = "Unable to initialize IndexManager %1$s";
    private final static String indexingEntitiesCompleted = "Reindexed %1$d entities";
    private final static String directoryProviderExceptionOnStop = "DirectoryProvider raises an exception on stop() ";
    private final static String jGroupsDefaultConfigurationFileNotFound = "Default JGroups configuration file was not found. Attempt to start JGroups channel with default configuration!";
    private final static String fieldLooksBinaryButDecompressionFailed = "Field %1$s looks like binary but couldn't be decompressed";
    private final static String skippingDirectorySynchronization = "Skipping directory synchronization, previous work still in progress: %1$s";
    private final static String unableToCloseSearcherInScrollableResult = "Unable to properly close searcher in ScrollableResults";
    private final static String pushedChangesOutOfTransaction = "It appears changes are being pushed to the index out of a transaction. Register the IndexWorkFlushEventListener listener on flush to correctly manage Collections!";
    private final static String forceUpdateOnIndexOperationViaInterception = "Interceptor enforces update of index data instead of index operation %2$s on instance of class %1$s";
    private final static String unableToStartSerializationLayer = "Unable to start serialization layer";
    private final static String indexingEntities = "Going to reindex %d entities";
    private final static String exceptionOccurred = "%1$s";
    private final static String unableToSynchronizeSource = "Unable to synchronize source of %1$s";
    private final static String jGroupsChannelCreationFromStringError = "Error while trying to create a channel using config string: %1$s";
    private final static String similarityInstantiationException = "Exception attempting to instantiate Similarity '%1$s' set for %2$s";
    private final static String optimizationSkippedStillBusy = "Skipping optimization on index %1$s as it is already being optimized";
    private final static String errorExecutingRunnableInTransaction = "Error while executing runnable wrapped in a JTA transaction";
    private final static String readerProviderExceptionOnDestroy = "ReaderProvider raises an exception on destroy()";
    private final static String serviceProviderNotReleased = "Service provider has been used but not released: %1$s";
    private final static String indexingDocumentsCompleted = "%1$d documents indexed in %2$d ms";
    private final static String ioExceptionOnIndexWriter = "IOException on the IndexWriter";
    private final static String nullIsInvalidIndexName = "'null' is not a valid index name";
    private final static String unableToSerializeInAvro = "Unable to serialize Lucene works in Avro";
    private final static String foundCurrentMarker = "Found current marker in source directory - initialization succeeded";
    private final static String cannotSerializeCustomField = "Cannot serialize custom Fieldable '%1$s'. Must be NumericField, Field or a Serializable Fieldable implementation.";
    private final static String inconsistentFieldConfiguration = "There are multiple properties indexed against the same field name '%1$s', but with different indexing settings. The behaviour is undefined.";
    private final static String unknownNumericFieldType = "Unknown NumericField type: %1$s";
    private final static String unableToCompareSourceWithDestinationDirectory = "Unable to compare %1$s with %2$s.";
    private final static String eventListenerWontBeRegistered = "Property hibernate.search.autoregister_listeners is set to false. No attempt will be made to register Hibernate Search event listeners.";
    private final static String errorDuringBatchIndexing = "Error during batch indexing: ";
    private final static String unableToSendWorkViaJGroups = "Unable to send Lucene update work via JGroups cluster";
    private final static String unableToCreateCurrentMarker = "Unable to create current marker in source of %1$s";
    private final static String unableToCloseSearcherDuringQuery = "Unable to properly close searcher during lucene query: %1$s";
    private final static String failToDeserializeObject = "Fail to deserialize object";
    private final static String cannotExtractValueForIdentifier = "FieldCache was enabled on class %1$s but for this type of identifier we can't extract values from the FieldCache: cache disabled";
    private final static String jGroupsStartingChannel = "Starting JGroups Channel";
    private final static String forceRemoveOnIndexOperationViaInterception = "Interceptor enforces removal of index data instead of index operation %2$s on instance of class %1$s";
    private final static String unknownFieldType = "Unknown Field type: %1$s";
    private final static String unableToDetermineCurrentInSourceDirectory = "Unable to determine current in source directory, will try again during the next synchronization";
    private final static String cannotDeserializeOperation = "Cannot deserialize operation %1$s, unknown operation.";
    private final static String interruptedWorkError = "Work discarded, thread was interrupted while waiting for space to schedule: %1$s";
    private final static String attributeNotRecognizedNorSerializable = "Attribute type is not recognized and not serializable: %1$s";
    private final static String couldNotCloseResource = "Could not close resource.";
    private final static String idCannotBeExtracted = "Unable to reindex entity on collection change, id cannot be extracted: %1$s";
    private final static String backendError = "Error in backend";
    private final static String unknownAttributeSerializedRepresentation = "Unknown attribute serialized representation: %1$s";
    private final static String ignoringBackendOptionForIndex = "Ignoring backend option for index '%1$s', configured IndexManager requires using '%2$s' instead.";
    private final static String legacyJGroupsConfigurationDefined = "JGroups channel configuration should be specified in the global section [hibernate.search.services.jgroups.], not as an IndexManager property for index '%1$s'. See http://docs.jboss.org/hibernate/search/4.1/reference/en-US/html_single/#jgroups-backend";
    private final static String unexpectedErrorInLuceneBackend = "Unexpected error in Lucene Backend:";
    private final static String unableConnectingToJGroupsCluster = "Unable to connect to: [%1$s] JGroups channel";
    private final static String needAtLeastOneIndexName = "At least one index name must be provided: can't open an IndexReader on nothing";
    private final static String unableToReadFile = "Unable to read file %1$s";
    private final static String unableToCloseJmsConnection = "Unable to close JMS connection for %1$s";
    private final static String interruptedBatchIndexing = "Batch indexing was interrupted";
    private final static String interruptedWhileWaitingForIndexActivity = "Was interrupted while waiting for index activity to finish. Index might be inconsistent or have a stale lock";
    private final static String cannotDeserializeField = "Cannot deserialize field type %1$s, unknown field type.";
    private final static String massIndexerIndexWriterThreadsIgnored = "The option 'threadsForIndexWriter' of the MassIndexer is deprecated and is being ignored! Control the size of worker.thread_pool.size for each index instead.";
    private final static String jGroupsReceivedNewClusterView = "Received new cluster view: %1$s";
    private final static String jGroupsChannelCreationUsingFileError = "Error while trying to create a channel using config file: %1$s";
    private final static String warnSuspiciousBackendDirectoryCombination = "The index '%1$s' is using a non-recommended combination of backend and directoryProvider implementations";
    private final static String conversionFromReaderToStringNotYetImplemented = "Conversion from Reader to String not yet implemented";
    private final static String unableToUnregisterExistingMBean = "Unable to un-register existing MBean: %1$s";
    private final static String indexDirectoryNotFoundCreatingNewOne = "Index directory not found, creating: '%1$s'";
    private final static String failedSlaveDirectoryProviderInitialization = "Failed to initialize SlaveDirectoryProvider %1$s";
    private final static String jGroupsChannelCreationUsingXmlError = "Error while trying to create a channel using config XML: %1$s";
    private final static String unableToShutdownAsynchronousIndexingByTimeout = "Timed out waiting to flush all operations to the backend of index %1$s";
    private final static String serializationProtocol = "Serialization protocol version %1$d.%2$d";
    private final static String unableToStartJGroupsChannel = "Unable to start JGroups channel";
    private final static String unableToLoadResource = "Could not load resource: '%1$s'";
    private final static String unableToConvertSerializableIndexToLuceneIndex = "Unable to convert serializable Index to Lucene Index: %1$s";
    private final static String closedBlackholeBackend = "closed \"blackhole\" backend.";
    private final static String cannotGetResultSizeWithCriteriaAndRestriction = "Cannot safely compute getResultSize() when a Criteria with restriction is used. Use query.list().size() or query.getResultList().size(). Criteria at stake: %1$s";
    private final static String unableToRemovePreviousMarket = "Unable to remove previous marker file from source of %1$s";
    private final static String errorRollingBackTransaction = "Error while rolling back transaction after %1$s";
    private final static String unableToCLoseLuceneIndexReader = "Unable to close Lucene IndexReader";
    private final static String jGroupsConfigurationNotFoundInProperties = "Unable to use any JGroups configuration mechanisms provided in properties %1$s. Using default JGroups configuration file!";
    private final static String notAnIndexedType = "%1$s is not an indexed type";
    private final static String jGroupsChannelInjectionError = "Object injected for JGroups channel in hibernate.search.services.jgroups.providedChannel is of an unexpected type %1$s (expecting org.jgroups.JChannel)";
    private final static String readersNotProperlyClosedInReaderProvider = "ReaderProvider contains readers not properly closed at destroy time";
    private final static String cannotGuessTransactionStatus = "Cannot guess the Transaction Status: not starting a JTA transaction";
    private final static String unknownFullTextFilter = "Unknown @FullTextFilter: '%1$s'";
    private final static String forceToUseDocumentExtraction = "Forced to use Document extraction to workaround FieldCache bug in Lucene";
    private final static String failToSerializeObject = "Fail to serialize object of type %1$s";
    private final static String workerException = "Worker raises an exception on close()";
    private final static String version = "Hibernate Search %1$s";
    private final static String checkSizeMustBePositive = "Chunk size must be positive: using default value.";
    private final static String abstractClassesCannotInsertDocuments = "Abstract classes can never insert index documents. Remove @Indexed.";
    private final static String unableToShutdownAsynchronousIndexing = "Unable to properly shut down asynchronous indexing work";
    private final static String stopServiceFailed = "Fail to properly stop service: %1$s";

    public Log_$logger(final Logger log) {
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
    public final org.hibernate.search.SearchException unableToDeserializeAvroStream(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000099: ")+ unableToDeserializeAvroStream$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToDeserializeAvroStream$str() {
        return unableToDeserializeAvroStream;
    }

    @Override
    public final void unableToRetrieveNamedAnalyzer(final String value) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000048: ")+ unableToRetrieveNamedAnalyzer$str()), value);
    }

    protected String unableToRetrieveNamedAnalyzer$str() {
        return unableToRetrieveNamedAnalyzer;
    }

    @Override
    public final void messageReceivedForUndefinedIndex(final String indexName) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000080: ")+ messageReceivedForUndefinedIndex$str()), indexName);
    }

    protected String messageReceivedForUndefinedIndex$str() {
        return messageReceivedForUndefinedIndex;
    }

    @Override
    public final void shuttingDownBackend(final String indexName) {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000108: ")+ shuttingDownBackend$str()), indexName);
    }

    protected String shuttingDownBackend$str() {
        return shuttingDownBackend;
    }

    @Override
    public final org.hibernate.search.SearchException unableToConvertSerializableStoreToLuceneStore(final String store) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000090: ")+ unableToConvertSerializableStoreToLuceneStore$str()), store));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToConvertSerializableStoreToLuceneStore$str() {
        return unableToConvertSerializableStoreToLuceneStore;
    }

    @Override
    public final IllegalArgumentException needAtLeastOneIndexedEntityType() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000112: ")+ needAtLeastOneIndexedEntityType$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String needAtLeastOneIndexedEntityType$str() {
        return needAtLeastOneIndexedEntityType;
    }

    @Override
    public final String exceptionDuringIndexMergeOperation() {
        String result = String.format(((projectCode +"000118: ")+ exceptionDuringIndexMergeOperation$str()));
        return result;
    }

    protected String exceptionDuringIndexMergeOperation$str() {
        return exceptionDuringIndexMergeOperation;
    }

    @Override
    public final void jGroupsDisconnectingAndClosingChannel() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000013: ")+ jGroupsDisconnectingAndClosingChannel$str()));
    }

    protected String jGroupsDisconnectingAndClosingChannel$str() {
        return jGroupsDisconnectingAndClosingChannel;
    }

    @Override
    public final org.hibernate.search.SearchException requestedIndexNotDefined(final String indexName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000107: ")+ requestedIndexNotDefined$str()), indexName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String requestedIndexNotDefined$str() {
        return requestedIndexNotDefined;
    }

    @Override
    public final org.hibernate.search.SearchException unableToReadSerializedLuceneWorks(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000084: ")+ unableToReadSerializedLuceneWorks$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToReadSerializedLuceneWorks$str() {
        return unableToReadSerializedLuceneWorks;
    }

    @Override
    public final String massIndexerUnexpectedErrorMessage() {
        String result = String.format(((projectCode +"000116: ")+ massIndexerUnexpectedErrorMessage$str()));
        return result;
    }

    protected String massIndexerUnexpectedErrorMessage$str() {
        return massIndexerUnexpectedErrorMessage;
    }

    @Override
    public final org.hibernate.search.SearchException unableToConvertSerializableTermVectorToLuceneTermVector(final String termVector) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000088: ")+ unableToConvertSerializableTermVectorToLuceneTermVector$str()), termVector));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToConvertSerializableTermVectorToLuceneTermVector$str() {
        return unableToConvertSerializableTermVectorToLuceneTermVector;
    }

    @Override
    public final void indexingCompletedAndMBeanUnregistered(final long nbrOfEntities) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000029: ")+ indexingCompletedAndMBeanUnregistered$str()), nbrOfEntities);
    }

    protected String indexingCompletedAndMBeanUnregistered$str() {
        return indexingCompletedAndMBeanUnregistered;
    }

    @Override
    public final org.hibernate.search.SearchException cantOpenCorruptedIndex(final CorruptIndexException e, final String indexName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000076: ")+ cantOpenCorruptedIndex$str()), indexName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String cantOpenCorruptedIndex$str() {
        return cantOpenCorruptedIndex;
    }

    @Override
    public final void unexpectedValueMissingFromFieldCache() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000040: ")+ unexpectedValueMissingFromFieldCache$str()));
    }

    protected String unexpectedValueMissingFromFieldCache$str() {
        return unexpectedValueMissingFromFieldCache;
    }

    @Override
    public final org.hibernate.search.SearchException incompatibleProtocolVersion(final int messageMajor, final int messageMinor, final int currentMajor, final int currentMinor) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000098: ")+ incompatibleProtocolVersion$str()), messageMajor, messageMinor, currentMajor, currentMinor));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String incompatibleProtocolVersion$str() {
        return incompatibleProtocolVersion;
    }

    @Override
    public final void jGroupsFlushNotPresentInStack() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000007: ")+ jGroupsFlushNotPresentInStack$str()));
    }

    protected String jGroupsFlushNotPresentInStack$str() {
        return jGroupsFlushNotPresentInStack;
    }

    @Override
    public final void incorrectMessageType(final Class messageType) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000016: ")+ incorrectMessageType$str()), messageType);
    }

    protected String incorrectMessageType$str() {
        return incorrectMessageType;
    }

    @Override
    public final void recommendConfiguringLuceneVersion() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000075: ")+ recommendConfiguringLuceneVersion$str()));
    }

    protected String recommendConfiguringLuceneVersion$str() {
        return recommendConfiguringLuceneVersion;
    }

    @Override
    public final IllegalArgumentException nullIsInvalidIndexedType() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000110: ")+ nullIsInvalidIndexedType$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String nullIsInvalidIndexedType$str() {
        return nullIsInvalidIndexedType;
    }

    @Override
    public final void initializedBlackholeBackend() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000001: ")+ initializedBlackholeBackend$str()));
    }

    protected String initializedBlackholeBackend$str() {
        return initializedBlackholeBackend;
    }

    @Override
    public final void noCurrentMarkerInSourceDirectory() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000042: ")+ noCurrentMarkerInSourceDirectory$str()));
    }

    protected String noCurrentMarkerInSourceDirectory$str() {
        return noCurrentMarkerInSourceDirectory;
    }

    @Override
    public final void notDeleted(final File file) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000032: ")+ notDeleted$str()), file);
    }

    protected String notDeleted$str() {
        return notDeleted;
    }

    @Override
    public final org.hibernate.search.SearchException unableToReadTokenStream() {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000087: ")+ unableToReadTokenStream$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToReadTokenStream$str() {
        return unableToReadTokenStream;
    }

    @Override
    public final void terminatingBatchWorkCanCauseInconsistentState() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000070: ")+ terminatingBatchWorkCanCauseInconsistentState$str()));
    }

    protected String terminatingBatchWorkCanCauseInconsistentState$str() {
        return terminatingBatchWorkCanCauseInconsistentState;
    }

    @Override
    public final org.hibernate.search.SearchException unableToSerializeLuceneWorks(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000083: ")+ unableToSerializeLuceneWorks$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToSerializeLuceneWorks$str() {
        return unableToSerializeLuceneWorks;
    }

    @Override
    public final void jGroupsConnectedToCluster(final String clusterName, final Object address) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000006: ")+ jGroupsConnectedToCluster$str()), clusterName, address);
    }

    protected String jGroupsConnectedToCluster$str() {
        return jGroupsConnectedToCluster;
    }

    @Override
    public final void containedInPointsToProvidedId(final Class objectClass) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000045: ")+ containedInPointsToProvidedId$str()), objectClass);
    }

    protected String containedInPointsToProvidedId$str() {
        return containedInPointsToProvidedId;
    }

    @Override
    public final void jGroupsClosingChannelError(final Exception toLog) {
        log.logf(FQCN, (Logger.Level.ERROR), (toLog), ((projectCode +"000014: ")+ jGroupsClosingChannelError$str()));
    }

    protected String jGroupsClosingChannelError$str() {
        return jGroupsClosingChannelError;
    }

    @Override
    public final void notChangeTimestamp(final File destFile) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000033: ")+ notChangeTimestamp$str()), destFile);
    }

    protected String notChangeTimestamp$str() {
        return notChangeTimestamp;
    }

    @Override
    public final void unableToRetrieveObjectFromMessage(final Class messageClass, final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000068: ")+ unableToRetrieveObjectFromMessage$str()), messageClass);
    }

    protected String unableToRetrieveObjectFromMessage$str() {
        return unableToRetrieveObjectFromMessage;
    }

    @Override
    public final org.hibernate.search.SearchException ioExceptionOnIndex(final IOException e, final String indexName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000077: ")+ ioExceptionOnIndex$str()), indexName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String ioExceptionOnIndex$str() {
        return ioExceptionOnIndex;
    }

    @Override
    public final void updatedDirectoryProviders() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000003: ")+ updatedDirectoryProviders$str()));
    }

    protected String updatedDirectoryProviders$str() {
        return updatedDirectoryProviders;
    }

    @Override
    public final void indexingSpeed(final float estimateSpeed, final float estimatePercentileComplete) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000031: ")+ indexingSpeed$str()), estimateSpeed, estimatePercentileComplete);
    }

    protected String indexingSpeed$str() {
        return indexingSpeed;
    }

    @Override
    public final void receivedEmptyLuceneWorksInMessage() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000051: ")+ receivedEmptyLuceneWorksInMessage$str()));
    }

    protected String receivedEmptyLuceneWorksInMessage$str() {
        return receivedEmptyLuceneWorksInMessage;
    }

    @Override
    public final void cannotOpenIndexWriterCausePreviousError() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000072: ")+ cannotOpenIndexWriterCausePreviousError$str()));
    }

    protected String cannotOpenIndexWriterCausePreviousError$str() {
        return cannotOpenIndexWriterCausePreviousError;
    }

    @Override
    public final void illegalObjectRetrievedFromMessage(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000069: ")+ illegalObjectRetrievedFromMessage$str()));
    }

    protected String illegalObjectRetrievedFromMessage$str() {
        return illegalObjectRetrievedFromMessage;
    }

    @Override
    public final void unableToCloseLuceneDirectory(final Object directory, final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000067: ")+ unableToCloseLuceneDirectory$str()), directory);
    }

    protected String unableToCloseLuceneDirectory$str() {
        return unableToCloseLuceneDirectory;
    }

    @Override
    public final void forcingReleaseIndexWriterLock() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000052: ")+ forcingReleaseIndexWriterLock$str()));
    }

    protected String forcingReleaseIndexWriterLock$str() {
        return forcingReleaseIndexWriterLock;
    }

    @Override
    public final void forceSkipIndexOperationViaInterception(final Class entityClass, final org.hibernate.search.backend.spi.WorkType type) {
        log.logf(FQCN, (Logger.Level.TRACE), null, ((projectCode +"000125: ")+ forceSkipIndexOperationViaInterception$str()), entityClass, type);
    }

    protected String forceSkipIndexOperationViaInterception$str() {
        return forceSkipIndexOperationViaInterception;
    }

    @Override
    public final org.hibernate.search.SearchException unableToInitializeIndexManager(final String indexName, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000103: ")+ unableToInitializeIndexManager$str()), indexName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToInitializeIndexManager$str() {
        return unableToInitializeIndexManager;
    }

    @Override
    public final void indexingEntitiesCompleted(final long nbrOfEntities) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000028: ")+ indexingEntitiesCompleted$str()), nbrOfEntities);
    }

    protected String indexingEntitiesCompleted$str() {
        return indexingEntitiesCompleted;
    }

    @Override
    public final void directoryProviderExceptionOnStop(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000061: ")+ directoryProviderExceptionOnStop$str()));
    }

    protected String directoryProviderExceptionOnStop$str() {
        return directoryProviderExceptionOnStop;
    }

    @Override
    public final void jGroupsDefaultConfigurationFileNotFound() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000012: ")+ jGroupsDefaultConfigurationFileNotFound$str()));
    }

    protected String jGroupsDefaultConfigurationFileNotFound$str() {
        return jGroupsDefaultConfigurationFileNotFound;
    }

    @Override
    public final org.hibernate.search.SearchException fieldLooksBinaryButDecompressionFailed(final String fieldName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000106: ")+ fieldLooksBinaryButDecompressionFailed$str()), fieldName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String fieldLooksBinaryButDecompressionFailed$str() {
        return fieldLooksBinaryButDecompressionFailed;
    }

    @Override
    public final void skippingDirectorySynchronization(final String indexName) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000018: ")+ skippingDirectorySynchronization$str()), indexName);
    }

    protected String skippingDirectorySynchronization$str() {
        return skippingDirectorySynchronization;
    }

    @Override
    public final void unableToCloseSearcherInScrollableResult(final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000039: ")+ unableToCloseSearcherInScrollableResult$str()));
    }

    protected String unableToCloseSearcherInScrollableResult$str() {
        return unableToCloseSearcherInScrollableResult;
    }

    @Override
    public final void pushedChangesOutOfTransaction() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000050: ")+ pushedChangesOutOfTransaction$str()));
    }

    protected String pushedChangesOutOfTransaction$str() {
        return pushedChangesOutOfTransaction;
    }

    @Override
    public final void forceUpdateOnIndexOperationViaInterception(final Class entityClass, final org.hibernate.search.backend.spi.WorkType type) {
        log.logf(FQCN, (Logger.Level.TRACE), null, ((projectCode +"000128: ")+ forceUpdateOnIndexOperationViaInterception$str()), entityClass, type);
    }

    protected String forceUpdateOnIndexOperationViaInterception$str() {
        return forceUpdateOnIndexOperationViaInterception;
    }

    @Override
    public final org.hibernate.search.SearchException unableToStartSerializationLayer(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000082: ")+ unableToStartSerializationLayer$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToStartSerializationLayer$str() {
        return unableToStartSerializationLayer;
    }

    @Override
    public final void indexingEntities(final long count) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000027: ")+ indexingEntities$str()), count);
    }

    protected String indexingEntities$str() {
        return indexingEntities;
    }

    @Override
    public final void exceptionOccurred(final String errorMsg, final Throwable exceptionThatOccurred) {
        log.logf(FQCN, (Logger.Level.ERROR), (exceptionThatOccurred), ((projectCode +"000058: ")+ exceptionOccurred$str()), errorMsg);
    }

    protected String exceptionOccurred$str() {
        return exceptionOccurred;
    }

    @Override
    public final void unableToSynchronizeSource(final String indexName, final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000021: ")+ unableToSynchronizeSource$str()), indexName);
    }

    protected String unableToSynchronizeSource$str() {
        return unableToSynchronizeSource;
    }

    @Override
    public final org.hibernate.search.SearchException jGroupsChannelCreationFromStringError(final String configuration, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000010: ")+ jGroupsChannelCreationFromStringError$str()), configuration), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String jGroupsChannelCreationFromStringError$str() {
        return jGroupsChannelCreationFromStringError;
    }

    @Override
    public final void similarityInstantiationException(final String similarityName, final String beanXClassName) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000004: ")+ similarityInstantiationException$str()), similarityName, beanXClassName);
    }

    protected String similarityInstantiationException$str() {
        return similarityInstantiationException;
    }

    @Override
    public final void optimizationSkippedStillBusy(final String indexName) {
        log.logf(FQCN, (Logger.Level.DEBUG), null, ((projectCode +"000119: ")+ optimizationSkippedStillBusy$str()), indexName);
    }

    protected String optimizationSkippedStillBusy$str() {
        return optimizationSkippedStillBusy;
    }

    @Override
    public final void errorExecutingRunnableInTransaction(final Throwable e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000064: ")+ errorExecutingRunnableInTransaction$str()));
    }

    protected String errorExecutingRunnableInTransaction$str() {
        return errorExecutingRunnableInTransaction;
    }

    @Override
    public final void readerProviderExceptionOnDestroy(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000060: ")+ readerProviderExceptionOnDestroy$str()));
    }

    protected String readerProviderExceptionOnDestroy$str() {
        return readerProviderExceptionOnDestroy;
    }

    @Override
    public final void serviceProviderNotReleased(final Class class1) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000025: ")+ serviceProviderNotReleased$str()), class1);
    }

    protected String serviceProviderNotReleased$str() {
        return serviceProviderNotReleased;
    }

    @Override
    public final void indexingDocumentsCompleted(final long doneCount, final long elapsedMs) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000030: ")+ indexingDocumentsCompleted$str()), doneCount, elapsedMs);
    }

    protected String indexingDocumentsCompleted$str() {
        return indexingDocumentsCompleted;
    }

    @Override
    public final String ioExceptionOnIndexWriter() {
        String result = String.format(((projectCode +"000117: ")+ ioExceptionOnIndexWriter$str()));
        return result;
    }

    protected String ioExceptionOnIndexWriter$str() {
        return ioExceptionOnIndexWriter;
    }

    @Override
    public final IllegalArgumentException nullIsInvalidIndexName() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000113: ")+ nullIsInvalidIndexName$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String nullIsInvalidIndexName$str() {
        return nullIsInvalidIndexName;
    }

    @Override
    public final org.hibernate.search.SearchException unableToSerializeInAvro(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000102: ")+ unableToSerializeInAvro$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToSerializeInAvro$str() {
        return unableToSerializeInAvro;
    }

    @Override
    public final void foundCurrentMarker() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000043: ")+ foundCurrentMarker$str()));
    }

    protected String foundCurrentMarker$str() {
        return foundCurrentMarker;
    }

    @Override
    public final org.hibernate.search.SearchException cannotSerializeCustomField(final Class fieldType) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000094: ")+ cannotSerializeCustomField$str()), fieldType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String cannotSerializeCustomField$str() {
        return cannotSerializeCustomField;
    }

    @Override
    public final void inconsistentFieldConfiguration(final String fieldName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000120: ")+ inconsistentFieldConfiguration$str()), fieldName);
    }

    protected String inconsistentFieldConfiguration$str() {
        return inconsistentFieldConfiguration;
    }

    @Override
    public final org.hibernate.search.SearchException unknownNumericFieldType(final String dataType) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000091: ")+ unknownNumericFieldType$str()), dataType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unknownNumericFieldType$str() {
        return unknownNumericFieldType;
    }

    @Override
    public final void unableToCompareSourceWithDestinationDirectory(final String source, final String destination) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000023: ")+ unableToCompareSourceWithDestinationDirectory$str()), source, destination);
    }

    protected String unableToCompareSourceWithDestinationDirectory$str() {
        return unableToCompareSourceWithDestinationDirectory;
    }

    @Override
    public final void eventListenerWontBeRegistered() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000057: ")+ eventListenerWontBeRegistered$str()));
    }

    protected String eventListenerWontBeRegistered$str() {
        return eventListenerWontBeRegistered;
    }

    @Override
    public final void errorDuringBatchIndexing(final Throwable e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000063: ")+ errorDuringBatchIndexing$str()));
    }

    protected String errorDuringBatchIndexing$str() {
        return errorDuringBatchIndexing;
    }

    @Override
    public final org.hibernate.search.SearchException unableToSendWorkViaJGroups(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000123: ")+ unableToSendWorkViaJGroups$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToSendWorkViaJGroups$str() {
        return unableToSendWorkViaJGroups;
    }

    @Override
    public final void unableToCreateCurrentMarker(final String indexName, final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000020: ")+ unableToCreateCurrentMarker$str()), indexName);
    }

    protected String unableToCreateCurrentMarker$str() {
        return unableToCreateCurrentMarker;
    }

    @Override
    public final void unableToCloseSearcherDuringQuery(final String query, final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000037: ")+ unableToCloseSearcherDuringQuery$str()), query);
    }

    protected String unableToCloseSearcherDuringQuery$str() {
        return unableToCloseSearcherDuringQuery;
    }

    @Override
    public final org.hibernate.search.SearchException failToDeserializeObject(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000096: ")+ failToDeserializeObject$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String failToDeserializeObject$str() {
        return failToDeserializeObject;
    }

    @Override
    public final void cannotExtractValueForIdentifier(final Class beanClass) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000046: ")+ cannotExtractValueForIdentifier$str()), beanClass);
    }

    protected String cannotExtractValueForIdentifier$str() {
        return cannotExtractValueForIdentifier;
    }

    @Override
    public final void jGroupsStartingChannel() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000005: ")+ jGroupsStartingChannel$str()));
    }

    protected String jGroupsStartingChannel$str() {
        return jGroupsStartingChannel;
    }

    @Override
    public final void forceRemoveOnIndexOperationViaInterception(final Class entityClass, final org.hibernate.search.backend.spi.WorkType type) {
        log.logf(FQCN, (Logger.Level.TRACE), null, ((projectCode +"000126: ")+ forceRemoveOnIndexOperationViaInterception$str()), entityClass, type);
    }

    protected String forceRemoveOnIndexOperationViaInterception$str() {
        return forceRemoveOnIndexOperationViaInterception;
    }

    @Override
    public final org.hibernate.search.SearchException unknownFieldType(final Class fieldType) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000093: ")+ unknownFieldType$str()), fieldType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unknownFieldType$str() {
        return unknownFieldType;
    }

    @Override
    public final void unableToDetermineCurrentInSourceDirectory() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000022: ")+ unableToDetermineCurrentInSourceDirectory$str()));
    }

    protected String unableToDetermineCurrentInSourceDirectory$str() {
        return unableToDetermineCurrentInSourceDirectory;
    }

    @Override
    public final org.hibernate.search.SearchException cannotDeserializeOperation(final String schema) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000100: ")+ cannotDeserializeOperation$str()), schema));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String cannotDeserializeOperation$str() {
        return cannotDeserializeOperation;
    }

    @Override
    public final void interruptedWorkError(final Runnable r) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000017: ")+ interruptedWorkError$str()), r);
    }

    protected String interruptedWorkError$str() {
        return interruptedWorkError;
    }

    @Override
    public final org.hibernate.search.SearchException attributeNotRecognizedNorSerializable(final Class attributeType) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000085: ")+ attributeNotRecognizedNorSerializable$str()), attributeType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String attributeNotRecognizedNorSerializable$str() {
        return attributeNotRecognizedNorSerializable;
    }

    @Override
    public final void couldNotCloseResource(final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000035: ")+ couldNotCloseResource$str()));
    }

    protected String couldNotCloseResource$str() {
        return couldNotCloseResource;
    }

    @Override
    public final void idCannotBeExtracted(final String affectedOwnerEntityName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000024: ")+ idCannotBeExtracted$str()), affectedOwnerEntityName);
    }

    protected String idCannotBeExtracted$str() {
        return idCannotBeExtracted;
    }

    @Override
    public final void backendError(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000073: ")+ backendError$str()));
    }

    protected String backendError$str() {
        return backendError;
    }

    @Override
    public final org.hibernate.search.SearchException unknownAttributeSerializedRepresentation(final String name) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000086: ")+ unknownAttributeSerializedRepresentation$str()), name));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unknownAttributeSerializedRepresentation$str() {
        return unknownAttributeSerializedRepresentation;
    }

    @Override
    public final void ignoringBackendOptionForIndex(final String indexName, final String forcedBackend) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000104: ")+ ignoringBackendOptionForIndex$str()), indexName, forcedBackend);
    }

    protected String ignoringBackendOptionForIndex$str() {
        return ignoringBackendOptionForIndex;
    }

    @Override
    public final org.hibernate.search.SearchException legacyJGroupsConfigurationDefined(final String indexName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000130: ")+ legacyJGroupsConfigurationDefined$str()), indexName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String legacyJGroupsConfigurationDefined$str() {
        return legacyJGroupsConfigurationDefined;
    }

    @Override
    public final void unexpectedErrorInLuceneBackend(final Throwable tw) {
        log.logf(FQCN, (Logger.Level.ERROR), (tw), ((projectCode +"000074: ")+ unexpectedErrorInLuceneBackend$str()));
    }

    protected String unexpectedErrorInLuceneBackend$str() {
        return unexpectedErrorInLuceneBackend;
    }

    @Override
    public final org.hibernate.search.SearchException unableConnectingToJGroupsCluster(final String clusterName, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000121: ")+ unableConnectingToJGroupsCluster$str()), clusterName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableConnectingToJGroupsCluster$str() {
        return unableConnectingToJGroupsCluster;
    }

    @Override
    public final IllegalArgumentException needAtLeastOneIndexName() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000111: ")+ needAtLeastOneIndexName$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String needAtLeastOneIndexName$str() {
        return needAtLeastOneIndexName;
    }

    @Override
    public final org.hibernate.search.SearchException unableToReadFile(final String filename, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000097: ")+ unableToReadFile$str()), filename), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToReadFile$str() {
        return unableToReadFile;
    }

    @Override
    public final void unableToCloseJmsConnection(final String jmsQueueName, final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000047: ")+ unableToCloseJmsConnection$str()), jmsQueueName);
    }

    protected String unableToCloseJmsConnection$str() {
        return unableToCloseJmsConnection;
    }

    @Override
    public final void interruptedBatchIndexing() {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000062: ")+ interruptedBatchIndexing$str()));
    }

    protected String interruptedBatchIndexing$str() {
        return interruptedBatchIndexing;
    }

    @Override
    public final void interruptedWhileWaitingForIndexActivity(final InterruptedException e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000049: ")+ interruptedWhileWaitingForIndexActivity$str()));
    }

    protected String interruptedWhileWaitingForIndexActivity$str() {
        return interruptedWhileWaitingForIndexActivity;
    }

    @Override
    public final org.hibernate.search.SearchException cannotDeserializeField(final String schema) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000101: ")+ cannotDeserializeField$str()), schema));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String cannotDeserializeField$str() {
        return cannotDeserializeField;
    }

    @Override
    public final void massIndexerIndexWriterThreadsIgnored() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000124: ")+ massIndexerIndexWriterThreadsIgnored$str()));
    }

    protected String massIndexerIndexWriterThreadsIgnored$str() {
        return massIndexerIndexWriterThreadsIgnored;
    }

    @Override
    public final void jGroupsReceivedNewClusterView(final Object view) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000015: ")+ jGroupsReceivedNewClusterView$str()), view);
    }

    protected String jGroupsReceivedNewClusterView$str() {
        return jGroupsReceivedNewClusterView;
    }

    @Override
    public final org.hibernate.search.SearchException jGroupsChannelCreationUsingFileError(final String configuration, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000008: ")+ jGroupsChannelCreationUsingFileError$str()), configuration), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String jGroupsChannelCreationUsingFileError$str() {
        return jGroupsChannelCreationUsingFileError;
    }

    @Override
    public final void warnSuspiciousBackendDirectoryCombination(final String indexName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000081: ")+ warnSuspiciousBackendDirectoryCombination$str()), indexName);
    }

    protected String warnSuspiciousBackendDirectoryCombination$str() {
        return warnSuspiciousBackendDirectoryCombination;
    }

    @Override
    public final org.hibernate.search.SearchException conversionFromReaderToStringNotYetImplemented() {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000092: ")+ conversionFromReaderToStringNotYetImplemented$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String conversionFromReaderToStringNotYetImplemented$str() {
        return conversionFromReaderToStringNotYetImplemented;
    }

    @Override
    public final void unableToUnregisterExistingMBean(final String name, final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000056: ")+ unableToUnregisterExistingMBean$str()), name);
    }

    protected String unableToUnregisterExistingMBean$str() {
        return unableToUnregisterExistingMBean;
    }

    @Override
    public final void indexDirectoryNotFoundCreatingNewOne(final String absolutePath) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000041: ")+ indexDirectoryNotFoundCreatingNewOne$str()), absolutePath);
    }

    protected String indexDirectoryNotFoundCreatingNewOne$str() {
        return indexDirectoryNotFoundCreatingNewOne;
    }

    @Override
    public final void failedSlaveDirectoryProviderInitialization(final String indexName, final Exception re) {
        log.logf(FQCN, (Logger.Level.ERROR), (re), ((projectCode +"000066: ")+ failedSlaveDirectoryProviderInitialization$str()), indexName);
    }

    protected String failedSlaveDirectoryProviderInitialization$str() {
        return failedSlaveDirectoryProviderInitialization;
    }

    @Override
    public final org.hibernate.search.SearchException jGroupsChannelCreationUsingXmlError(final String configuration, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000009: ")+ jGroupsChannelCreationUsingXmlError$str()), configuration), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String jGroupsChannelCreationUsingXmlError$str() {
        return jGroupsChannelCreationUsingXmlError;
    }

    @Override
    public final void unableToShutdownAsynchronousIndexingByTimeout(final String indexName) {
        log.logf(FQCN, (Logger.Level.ERROR), null, ((projectCode +"000078: ")+ unableToShutdownAsynchronousIndexingByTimeout$str()), indexName);
    }

    protected String unableToShutdownAsynchronousIndexingByTimeout$str() {
        return unableToShutdownAsynchronousIndexingByTimeout;
    }

    @Override
    public final void serializationProtocol(final int major, final int minor) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000079: ")+ serializationProtocol$str()), major, minor);
    }

    protected String serializationProtocol$str() {
        return serializationProtocol;
    }

    @Override
    public final org.hibernate.search.SearchException unableToStartJGroupsChannel(final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000122: ")+ unableToStartJGroupsChannel$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToStartJGroupsChannel$str() {
        return unableToStartJGroupsChannel;
    }

    @Override
    public final org.hibernate.search.SearchException unableToLoadResource(final String fileName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000114: ")+ unableToLoadResource$str()), fileName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToLoadResource$str() {
        return unableToLoadResource;
    }

    @Override
    public final org.hibernate.search.SearchException unableToConvertSerializableIndexToLuceneIndex(final String index) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000089: ")+ unableToConvertSerializableIndexToLuceneIndex$str()), index));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unableToConvertSerializableIndexToLuceneIndex$str() {
        return unableToConvertSerializableIndexToLuceneIndex;
    }

    @Override
    public final void closedBlackholeBackend() {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000002: ")+ closedBlackholeBackend$str()));
    }

    protected String closedBlackholeBackend$str() {
        return closedBlackholeBackend;
    }

    @Override
    public final org.hibernate.search.SearchException cannotGetResultSizeWithCriteriaAndRestriction(final String criteria) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000105: ")+ cannotGetResultSizeWithCriteriaAndRestriction$str()), criteria));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String cannotGetResultSizeWithCriteriaAndRestriction$str() {
        return cannotGetResultSizeWithCriteriaAndRestriction;
    }

    @Override
    public final void unableToRemovePreviousMarket(final String indexName) {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000019: ")+ unableToRemovePreviousMarket$str()), indexName);
    }

    protected String unableToRemovePreviousMarket$str() {
        return unableToRemovePreviousMarket;
    }

    @Override
    public final void errorRollingBackTransaction(final String message, final Exception e1) {
        log.logf(FQCN, (Logger.Level.ERROR), (e1), ((projectCode +"000065: ")+ errorRollingBackTransaction$str()), message);
    }

    protected String errorRollingBackTransaction$str() {
        return errorRollingBackTransaction;
    }

    @Override
    public final void unableToCLoseLuceneIndexReader(final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000055: ")+ unableToCLoseLuceneIndexReader$str()));
    }

    protected String unableToCLoseLuceneIndexReader$str() {
        return unableToCLoseLuceneIndexReader;
    }

    @Override
    public final void jGroupsConfigurationNotFoundInProperties(final Properties props) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000011: ")+ jGroupsConfigurationNotFoundInProperties$str()), props);
    }

    protected String jGroupsConfigurationNotFoundInProperties$str() {
        return jGroupsConfigurationNotFoundInProperties;
    }

    @Override
    public final IllegalArgumentException notAnIndexedType(final String entityName) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000109: ")+ notAnIndexedType$str()), entityName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String notAnIndexedType$str() {
        return notAnIndexedType;
    }

    @Override
    public final org.hibernate.search.SearchException jGroupsChannelInjectionError(final Exception e, final Class actualType) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000129: ")+ jGroupsChannelInjectionError$str()), actualType), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String jGroupsChannelInjectionError$str() {
        return jGroupsChannelInjectionError;
    }

    @Override
    public final void readersNotProperlyClosedInReaderProvider() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000054: ")+ readersNotProperlyClosedInReaderProvider$str()));
    }

    protected String readersNotProperlyClosedInReaderProvider$str() {
        return readersNotProperlyClosedInReaderProvider;
    }

    @Override
    public final void cannotGuessTransactionStatus(final Exception e) {
        log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000036: ")+ cannotGuessTransactionStatus$str()));
    }

    protected String cannotGuessTransactionStatus$str() {
        return cannotGuessTransactionStatus;
    }

    @Override
    public final org.hibernate.search.SearchException unknownFullTextFilter(final String filterName) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000115: ")+ unknownFullTextFilter$str()), filterName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String unknownFullTextFilter$str() {
        return unknownFullTextFilter;
    }

    @Override
    public final void forceToUseDocumentExtraction() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000038: ")+ forceToUseDocumentExtraction$str()));
    }

    protected String forceToUseDocumentExtraction$str() {
        return forceToUseDocumentExtraction;
    }

    @Override
    public final org.hibernate.search.SearchException failToSerializeObject(final Class type, final Throwable e) {
        org.hibernate.search.SearchException result = new org.hibernate.search.SearchException(String.format(((projectCode +"000095: ")+ failToSerializeObject$str()), type), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String failToSerializeObject$str() {
        return failToSerializeObject;
    }

    @Override
    public final void workerException(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000059: ")+ workerException$str()));
    }

    protected String workerException$str() {
        return workerException;
    }

    @Override
    public final void version(final String versionString) {
        log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000034: ")+ version$str()), versionString);
    }

    protected String version$str() {
        return version;
    }

    @Override
    public final void checkSizeMustBePositive() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000053: ")+ checkSizeMustBePositive$str()));
    }

    protected String checkSizeMustBePositive$str() {
        return checkSizeMustBePositive;
    }

    @Override
    public final void abstractClassesCannotInsertDocuments() {
        log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000044: ")+ abstractClassesCannotInsertDocuments$str()));
    }

    protected String abstractClassesCannotInsertDocuments$str() {
        return abstractClassesCannotInsertDocuments;
    }

    @Override
    public final void unableToShutdownAsynchronousIndexing(final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000071: ")+ unableToShutdownAsynchronousIndexing$str()));
    }

    protected String unableToShutdownAsynchronousIndexing$str() {
        return unableToShutdownAsynchronousIndexing;
    }

    @Override
    public final void stopServiceFailed(final Class class1, final Exception e) {
        log.logf(FQCN, (Logger.Level.ERROR), (e), ((projectCode +"000026: ")+ stopServiceFailed$str()), class1);
    }

    protected String stopServiceFailed$str() {
        return stopServiceFailed;
    }

}
