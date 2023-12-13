package com.hcc.entities.enums;

//As a Reviewer I want to be able to click a Reject Assignment
// As a Reviewer I want to be able to click on a claim
// As a Reviewer I want to be able to click on a Complete assignment
// As a Reviewer I want to be able to click a View button
public enum AssignmentStatusEnum {
    PENDING_SUBMISSION("Pending Submission"),
    SUBMITTED("Submitted"),
    IN_REVIEW("In Review"),
    NEEDS_UPDATE("Needs update"),
    COMPLETED("Completed"),
    RESUBMITTED("Resubmitted");


    private String status;


    AssignmentStatusEnum(String status){
        this.status = status;

    }
    public String getStatus(){
        return status;
    }
}
