package com.example.endpoint.endpoint;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class HikariCPAutoConfiguration {

    @Bean
    @ConditionalOnEnabledEndpoint
    @ConditionalOnMissingBean
    public HikariCPEndpoint hikariCPEndpoint (DataSource dataSource) {
        return new HikariCPEndpoint((HikariDataSource)dataSource);
    }
}
