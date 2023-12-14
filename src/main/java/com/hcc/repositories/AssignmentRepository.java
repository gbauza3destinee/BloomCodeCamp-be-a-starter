package com.hcc.repositories;

import com.hcc.entities.Assignment;
import com.hcc.entities.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/// Talking through
@Repository
// inserting spring boot tags


// autowired
public interface AssignmentRepository extends JpaRepository<Hello, Long> {

    @GetMapping("/api/assignments")
    public static Assignment getAssignmentById(long assignmentId){
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
