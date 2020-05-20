package com.bytesRoom.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


//第一种属性注入方式

@Configuration
@EnableConfigurationProperties(JdbcProperties2.class )
public class JdbcConfiguration2 {

//    @Autowired
//    JdbcProperties jdbcProperties;


    @Bean
    public DataSource MyDataSource(JdbcProperties2 jdbcProperties2){
        System.out.println("jdbc2:"+ jdbcProperties2);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(jdbcProperties2.getDriverClassName());
        druidDataSource.setUrl(jdbcProperties2.getUrl());
        druidDataSource.setUsername(jdbcProperties2.getUsername());
        druidDataSource.setPassword(jdbcProperties2.getPassword());
        return druidDataSource;
    }

}
