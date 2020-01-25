package com.effa.jwt.jwt.DAO;

import com.effa.jwt.jwt.models.LoginCredentials;
import com.effa.jwt.jwt.models.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    Map<String, Object> login(LoginCredentials credentials);

    Map<String, Object> getallusers(String token);
}
