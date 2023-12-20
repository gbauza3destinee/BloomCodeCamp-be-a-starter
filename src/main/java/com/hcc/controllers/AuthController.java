package com.hcc.controllers;

import com.hcc.services.UserDetailServiceImpl;
import com.hcc.utils.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    // login - log in a person
    // username
    // password
    // UsernamePasswordAuthenticationToken - pass in username and password
    // pass to authentication manager authenticate
    // authentication = authenticateManager.auth
    @PostMapping("/api/auth/login")
    public Authentication login(@PathVariable String username, @PathVariable String password){
        UsernamePasswordAuthenticationToken passwordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(passwordAuthenticationToken);
        return authentication;
    }

    // Request param is used for
    // ResponseEntity<?> because it has logging
    // Parameter has (@RequestBody parameter)


    // validating token - checking we have a valid logged in person (hits protected endpoints)
    // take token in as request param, username
    // validateToken
    @PostMapping("/api/auth/validate")
    public boolean validateToken(@RequestBody String token, @RequestBody String username){
        JwtUtil jwtUtil = new JwtUtil();
        UserDetailServiceImpl userDetailsService = new UserDetailServiceImpl();
        UserDetails userdetails = userDetailsService.loadUserByUsername(username);
        return  jwtUtil.validateToken(token, userdetails);
    }


}
