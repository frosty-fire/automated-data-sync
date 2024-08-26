//package vn.baodh.data_sync.infra.database.config;
//
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
///**
// * Configuration properties for Cassandra.
// */
//@EqualsAndHashCode(callSuper = false)
//@Data
//@Configuration
//public class CassandraConfiguration {
//    /**
//     * Name of the Cassandra session.
//     */
//    private String sessionName;
//
//    /**
//     * Cluster node addresses in the form 'host:port', or a simple 'host' to use the
//     * configured port.
//     */
//    private List<String> contactPoints;
//
//    /**
//     * Port to use if a contact point does not specify one.
//     */
//    private int port = 9042;
//
//    /**
//     * Keyspace name to use. A keyspace is analogous to a database in relational databases.
//     */
//    private String keyspaceName;
//
//    /**
//     * Datacenter that is considered "local". Contact points should be from this
//     * datacenter. It's required when using the DCAwareRoundRobinPolicy for load balancing.
//     */
//    private String localDatacenter;
//
//
//    /**
//     * Login user of the server.
//     */
//    private String username;
//
//    /**
//     * Login password of the server.
//     */
//    private String password;
//
//    /**
//     * Schema action to take at startup.
//     * <ul>
//     *     <li>none: Do nothing (default).</li>
//     *     <li>create: Creates the schema from scratch.</li>
//     *     <li>create_if_not_exists: Creates the schema if it does not exist.</li>
//     *     <li>recreate: Drops the schema and creates it again.</li>
//     *     <li>recreate_drop_unused: Drops and recreates the schema, but only unused tables and columns.</li>
//     *     <li>validate: Validates the schema.</li>
//     * </ul>
//     */
//    private String schemaAction = "none";
//}
//
//
////    /**
////     * Compression supported by the Cassandra binary protocol.
////     */
////    private CassandraProperties.Compression compression;
////
////
////    /**
////     * SSL configuration.
////     */
////    private CassandraProperties.Ssl ssl = new CassandraProperties.Ssl();
////
////    /**
////     * Connection configuration.
////     */
////    private final CassandraProperties.Connection connection = new CassandraProperties.Connection();
////
////    /**
////     * Pool configuration.
////     */
////    private final CassandraProperties.Pool pool = new CassandraProperties.Pool();
////
////    /**
////     * Request configuration.
////     */
////    private final CassandraProperties.Request request = new CassandraProperties.Request();
////
////    /**
////     * Control connection configuration.
////     */
////    private final CassandraProperties.Controlconnection controlconnection = new CassandraProperties.Controlconnection();