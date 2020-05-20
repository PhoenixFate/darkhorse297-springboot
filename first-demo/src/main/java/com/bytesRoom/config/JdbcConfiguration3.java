package com.bytesRoom.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class JdbcConfiguration3 {

    //第二种属性注入方式
    @Bean
    @ConfigurationProperties(prefix = "jdbc3")
    public DataSource MyDataSource(){
        return new DruidDataSource();
    }

}
