package com.effa.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class VerifyAndDecode {
    public static Object verifyToken(String token){
            Algorithm algorithm = Algorithm.HMAC256("super secret");
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("Effa_Amponsah")
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return  jwt;
    }

    public static Object decode(String token){
        try{
            DecodedJWT jwt = JWT.decode(token);
            Claim claim = jwt.getClaim("username");
            return  claim.asString();
        }catch (JWTDecodeException exception){
            return exception.getMessage();
        }
    }

}
