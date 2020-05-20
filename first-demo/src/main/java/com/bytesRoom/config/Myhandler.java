package com.bytesRoom.config;

import org.springframework.stereotype.Component;

@Component
public class Myhandler {

    private JdbcProperties2 jdbcProperties1;

    Myhandler(JdbcProperties2 jdbcProperties1){
        this.jdbcProperties1 = jdbcProperties1;
    }

    public void test(){
        System.out.println("spring 可以通过构造函数注入对象："+ jdbcProperties1.getUrl());
    }

}
