package com.hcc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Assignment {


    @Column
    private long id;

    @Column
    private String status;
    @Column
    private Integer number;
    @Column
    private String githubUrl;
    @Column
    private String branch;
    @Column
    private String reviewVideoUrl;
    @Column
    private User user;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getReviewVideoUrl() {
        return reviewVideoUrl;
    }

    public void setReviewVideoUrl(String reviewVideoUrl) {
        this.reviewVideoUrl = reviewVideoUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
