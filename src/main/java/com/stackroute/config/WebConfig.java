package com.stackroute.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;

@Configuration
public class WebConfig {
   @Bean("dataSource")
   public DataSource dataSource() {
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/Movie");
       dataSource.setUsername("root");
       dataSource.setPassword("Root@123");
       return dataSource;
   }
}
