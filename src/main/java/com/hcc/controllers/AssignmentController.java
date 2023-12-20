package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AssignmentController {

    @Autowired
    private static AssignmentRepository assignmentRepository;
   // The controller handles HTTP requests and is used to touch the api endpoints

    @GetMapping("/api/assignments")
    public static Assignment getAssignmentById(long assignmentId){

        Assignment assignment = assignmentRepository.getReferenceById(assignmentId);
        return assignment;
    }

    @GetMapping("/api/assignments")
    public static Assignment getAssignmentByUser(User user){
        Assignment assignment= assignmentRepository.getReferenceById(user.getId());
        return assignment;
    }
    @PutMapping("/api/assignments/{id}")
    public static boolean putAssignmentsById(long assignmentId){
        Assignment assignment = getAssignmentById(assignmentId);
        assignmentRepository.save(assignment);
        boolean isSaved = true;
        return isSaved;
    }

    @PostMapping("/api/assignments")
    public static boolean postAssignmentsById(long assignmentId){
        Assignment assignment = getAssignmentById(assignmentId);
        assignmentRepository.save(assignment);
        boolean isSaved = true;
        return isSaved;
    }

}
