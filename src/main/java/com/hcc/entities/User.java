package com.hcc.entities;

import java.time.LocalDate;

public class User {

    private long id;
    public LocalDate cohortStartDate;
    public String username;
    public String password;

    /**
     * Create a No args constructor
     */
    public User(){}

    public User(LocalDate cohortStartDate, String username, String password){

    }



}
