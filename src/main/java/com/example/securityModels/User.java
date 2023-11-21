package com.example.securityModels;

import lombok.Data;
import lombok.Getter;

@Getter
public class User {

    String username;
    String password;
    String email;

    public User(){
    }

    public User(String username,String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }


}
