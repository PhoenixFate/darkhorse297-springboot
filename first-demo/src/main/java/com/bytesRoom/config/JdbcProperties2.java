package com.bytesRoom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "jdbc2")//第二种属性注入不写以上两个注解
public class JdbcProperties2 {

    String url;
    String driverClassName;
    String username;
    String password;

}
