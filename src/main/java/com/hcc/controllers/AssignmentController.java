package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AssignmentController {

    //since this handles http requests, should @getmapping only be mentioned
    // here?


    @GetMapping("/api/assignments")
    public static Assignment getAssignmentById(long assignmentId){
        return null;
    }

    @GetMapping("/api/assignments/{id}")
    public static Assignment getAssignmentByUser(User user){
        return null;
    }
    @PutMapping("/api/assignments/{id}")
    public static boolean putAssignmentsById(long assignmentId){
        return false;
    }

    @PostMapping("/api/assignments")
    public static boolean postAssignmentsById(long assignmentId){
        return false;
    }

}
