package com.hcc.entities.enums;

public enum AssignmentEnum {

    ASSIGNMENT_1(1, "Class implementation"),
    ASSIGNMENT_2(2, "Testing"),
    ASSIGNMENT_3(3,"Refactor code"),
    ASSIGNMENT_4(4, "Class design"),
    ASSIGNMENT_5(5,"Optimization" ),
    ASSIGNMENT_6(6, "Database Setup");

    private int assignmentNumber;
    private String assignmentName;
    AssignmentEnum(int assignmentNumber, String assignmentName){
        this.assignmentNumber = assignmentNumber;
        this.assignmentName = assignmentName;
    }

    public String getAssignmentName(){
        return assignmentName;
    }

    public int getAssignmentNumber(){
        return assignmentNumber;
    }
}
