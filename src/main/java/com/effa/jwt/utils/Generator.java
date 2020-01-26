package com.effa.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Generator {
    public static String generate(String username){
        Algorithm algorithm = Algorithm.HMAC256("super secret");
        String token = JWT.create()
                .withClaim("username", username)
                .withIssuedAt(Date.from(
                        ZonedDateTime.now(ZoneId.systemDefault()).toInstant()
                ))
                .withExpiresAt(
                        Date.from(ZonedDateTime.now(
                                ZoneId.systemDefault()).plusMinutes(1).toInstant()
                        )
                )
                .withSubject("authentication")
                .withIssuer("Effa_Amponsah").sign(algorithm);
        return  token;

    }
}
