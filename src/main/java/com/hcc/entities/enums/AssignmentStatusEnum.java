package com.hcc.entities.enums;

// TODO: Which annotation goes in this class?
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
