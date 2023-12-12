package com.hcc.entities;

public class Assignment {


    private long id;
    public String status;
    public Integer number;
    public String githubUrl;
    public String branch;
    public String reviewVideoUrl;
    public User user;

    /**
     * No Arg constructor
     */
    public Assignment(){}

    /**
     * All args constructor except id
     * @param Status
     * @param number
     * @param githubUrl
     * @param branch
     * @param reviewVideoUrl
     * @param user
     */
    public Assignment(String Status, Integer number,
                      String githubUrl, String branch, String reviewVideoUrl,
                      User user){

    }

}
