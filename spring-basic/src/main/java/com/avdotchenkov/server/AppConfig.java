package com.avdotchenkov.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.avdotchenkov.server")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource("jdbc:mysql://localhost:3306/mysql", "root", "root");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        return ds;
    }
}
