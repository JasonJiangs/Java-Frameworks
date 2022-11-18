package com.spring.jdbcTemplate.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author: Jason
 * @Date: 2022/11/17 23:31 23 31
 */

/**
 * Transaction Management by Annotation
 */

@Configuration
@ComponentScan(basePackages = "com.spring")  // component scan
@EnableTransactionManagement
public class TxConfig {
    // build database connection pool
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/user_db?serverTimezone=UTC");
        source.setPassword("root");
        source.setUsername("root");
        return source;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}