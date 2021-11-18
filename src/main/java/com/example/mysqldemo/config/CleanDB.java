package com.example.mysqldemo.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 18, November 2021
 * Time: 4:38 PM
 * Project: mysql-demo
 * Package Name: com.example.mysqldemo.config
 * Class/Interface/Enum Name: CleanDB
 * To change this template use File | Settings | File and Code Template
 */
@Configuration
@Profile("clean")
public class CleanDB {

    @Bean
    public FlywayMigrationStrategy clean(){
        return flyway -> {
            flyway.clean();
            flyway.migrate();
        };
    }
}
