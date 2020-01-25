package com.effa.jwt.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class Generator {
    public String generate(String username){
        Algorithm algorithm = Algorithm.HMAC256("super secret");
        String token = JWT.create()
                .withClaim("username", username)
                .withSubject("authentication")
                .withIssuer("Effa_Amponsah").sign(algorithm);
        return  token;

    }
}
