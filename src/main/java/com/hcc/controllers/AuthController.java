package com.hcc.controllers;

import com.hcc.services.UserDetailServiceImpl;
import com.hcc.utils.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping()
    public Authentication login(String username, String password){
        UsernamePasswordAuthenticationToken passwordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authenticate = authenticationManager.authenticate(passwordAuthenticationToken);
        return authenticate;
    }



    // validating token - checking we have a valid logged in person (hits protected endpoints)
    // take token in as request param, username
    // validateToken
    @PostMapping()
    public boolean validateToken(String token, String username){
        JwtUtil jwtUtil = new JwtUtil();
        UserDetailServiceImpl userDetailsService = new UserDetailServiceImpl();
        UserDetails userdetails = userDetailsService.loadUserByUsername(username);
        return  jwtUtil.validateToken(token, userdetails);
    }


}
