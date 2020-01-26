package com.effa.jwt.controllers;


import com.auth0.jwt.exceptions.JWTVerificationException;
import com.effa.jwt.DAO.UserDao;
import com.effa.jwt.models.LoginCredentials;
import com.effa.jwt.models.User;
import com.effa.jwt.utils.Generator;
import com.effa.jwt.utils.VerifyAndDecode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api
@RestController
public class Usercontroller implements UserDao {
    List<User> dummyusers = Arrays.asList(
            new User(1, "dennis123", "effaamponsah"),
            new User(2, "isaac123", "agyen")
    );

    @ApiOperation("Login")
    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    @Override
    public Map<String, Object> login(@RequestBody LoginCredentials credentials) {
       User dennis = new User(1, "dennis123", "effaamponsah");
        Map<String, Object> response = new HashMap<>();
        if (credentials.getUsername().equals("dennis123") && credentials.getPassword().equals("password")){
            response.put("success", true);
            response.put("data", dennis);
            response.put("token", Generator.generate(credentials.getUsername()));
            return response;
        }
        else {
            response.put("success", false);
            response.put("msg", "User 404. Not found");
            return response;
        }
    }

    @ApiOperation("Get all users")
    @CrossOrigin(origins = "*")
    @GetMapping("/users")
    @Override
    public Map<String, Object> getallusers(@RequestHeader("access-token") String token) {
        Map<String, Object> response = new HashMap<>();
        try{
            VerifyAndDecode.verifyToken(token);
            VerifyAndDecode.decode(token);
            response.put("users", dummyusers);
            response.put("user_initiating_request",VerifyAndDecode.decode(token)); //this can be anything useful to the endpoint. Maybe username or userid etc

            return response;
        }
        catch (JWTVerificationException exception){
            response.put("success",false);
            response.put("msg", exception.getMessage());
            return response;
        }
    }
}
