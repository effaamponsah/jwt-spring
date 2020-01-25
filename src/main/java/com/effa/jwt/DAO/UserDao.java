package com.effa.jwt.DAO;

import com.effa.jwt.models.LoginCredentials;

import java.util.Map;

public interface UserDao {
    Map<String, Object> login(LoginCredentials credentials);

    Map<String, Object> getallusers(String token);
}
