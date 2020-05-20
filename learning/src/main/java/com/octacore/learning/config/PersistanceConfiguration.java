package com.octacore.learning.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {

//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        System.out.println("OverRiding with custom configuration class");
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.username("");
//        builder.password("");
//        return builder.build();
//    }
}