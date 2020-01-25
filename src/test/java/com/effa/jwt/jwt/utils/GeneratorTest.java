package com.effa.jwt.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    @Test
    void checkSubject() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJva2F5IiwibmFtZSI6IkRlbm5pcyIsImlzcyI6ImF1dGgwIn0.D33FBQQu5X2oBP5eoFsckZ9mF1RANludvBdT-U12-Ww";
        DecodedJWT string = JWT.decode(token);
        assertEquals(string.getSubject(), "okay");
    }

    @Test
    void checkClaim(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJva2F5IiwibmFtZSI6IkRlbm5pcyIsImlzcyI6ImF1dGgwIn0.D33FBQQu5X2oBP5eoFsckZ9mF1RANludvBdT-U12-Ww";
        DecodedJWT string = JWT.decode(token);
        assertEquals(string.getClaim("name").asString(), "Dennis");
    }
}