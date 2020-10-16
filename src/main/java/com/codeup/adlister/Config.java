package com.codeup.adlister;

public class Config {

    public String getUrl(){
        return "jdbc:mysql://localhost/adlister_db_?serverTimezone=UTC&useSSL=false";
    }

    public String getUser(){
        return "test";
    }

    public String getPassword(){
        return "test";
    }
}
