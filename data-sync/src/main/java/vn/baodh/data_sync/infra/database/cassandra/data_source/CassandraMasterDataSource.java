//package vn.baodh.data_sync.infra.database.cassandra.data_source;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
//import org.springframework.data.cassandra.core.CassandraTemplate;
//import org.springframework.data.cassandra.core.convert.MappingCassandraConverter;
//
//import java.util.Objects;
//
//@Configuration
//@RequiredArgsConstructor
//public class CassandraMasterDataSource {
//
//    private final CassandraMasterConfiguration configuration;
//
//    @Bean(name = "masterCqlSession")
//    public CqlSessionFactoryBean masterCqlSession() {
//        CqlSessionFactoryBean session = new CqlSessionFactoryBean();
//        session.setContactPoints("localhost");
//        session.setKeyspaceName(configuration.getKeyspaceName());
//        return session;
//    }
//
//    @Bean(name = "masterCassandraTemplate")
//    public CassandraTemplate masterCassandraTemplate() {
//        return new CassandraTemplate(Objects.requireNonNull(masterCqlSession().getObject()), new MappingCassandraConverter());
//    }
//}
