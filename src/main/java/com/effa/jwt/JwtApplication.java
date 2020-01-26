package com.effa.jwt;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.effa.jwt.utils.Generator;
import com.effa.jwt.utils.VerifyAndDecode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);

//		System.out.println(VerifyAndDecode.verifyToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhdXRoZW50aWNhdGlvbiIsImlzcyI6IkVmZmFfQW1wb25zYWgiLCJleHAiOjE1Nzk5OTY5NDAsImlhdCI6MTU3OTk5Njg4MCwidXNlcm5hbWUiOiJkZW5uaXMifQ.sjT64U34DEbW4CGEY3ctcbEyAXOiwoEgjipluSysPdM"));
//		System.out.println(Generator.generate("dennis"));

//		try{
//			System.out.println(VerifyAndDecode.verifyToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhdXRoZW50aWNhdGlvbiIsImlzcyI6IkVmZmFfQW1wb25zYWgiLCJleHAiOjE1ODAwNTM4NzMsImlhdCI6MTU4MDA1MzgxMywidXNlcm5hbWUiOiJkZW5uaXMifQ.4a7mtm2jHLTLsJGAlnrOdSvtDGWg2aEb1umR-eVjdjw"));
//		} catch (JWTVerificationException exception){
////            return  exception.getMessage();
//			System.out.println(exception.getMessage());
////
//        }

//		System.out.println(VerifyAndDecode.decode());;
	}

}
