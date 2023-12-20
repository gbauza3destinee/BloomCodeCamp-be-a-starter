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
    public static Assignment getAssignmentById(@RequestBody long assignmentId){
        Assignment assignment = assignmentRepository.getReferenceById(assignmentId);
        return assignment;
    }
    // RequestBody
    // RequestParam
    // whats the difference between using RequestBody and Pathvariable?
    @GetMapping("/api/assignments")
    public static Assignment getAssignmentByUser( @PathVariable  User user){
        Assignment assignment= assignmentRepository.getReferenceById(user.getId());
        return assignment;
    }
    @PutMapping("/api/assignments/{id}")
    public static boolean putAssignmentsById( @PathVariable long assignmentId){

        Assignment assignment = getAssignmentById(assignmentId);
        if( assignment == null){
            throw new NullPointerException("Assignment could not be found by iD!");
        }  else {

            assignmentRepository.save(assignment);
            boolean isSaved = true;
            return isSaved;
        }
    }


    @PostMapping("/api/assignments")
    public static boolean postAssignmentsById( @PathVariable long assignmentId){
        Assignment assignment = getAssignmentById(assignmentId);
       if(assignment == null){
           throw new NullPointerException("Assignment was not found!");
        }
        assignmentRepository.save(assignment);
        boolean isSaved = true;
        return isSaved;
    }

}
