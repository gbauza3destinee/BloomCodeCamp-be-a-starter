package com.hcc.entities;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

    public long id;
    public String authority;
    public User user;

    public Authority(long id, String authority, User user){
        this.id = id;
        this.authority = authority;
        this.user = user;
    }
    public Authority(){}

    public Authority (String authority){
        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return null;
    }
}








