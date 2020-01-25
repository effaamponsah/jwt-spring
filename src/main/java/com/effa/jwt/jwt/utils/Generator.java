package com.effa.jwt.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class Generator {

    public void generate(){
        Algorithm algorithm = Algorithm.HMAC256("super secret");
        String token = JWT.create()
                .withClaim("name", "Dennis")
                .withSubject("okay")
                .withIssuer("auth0").sign(algorithm);

        System.out.println(token);
    }
}
