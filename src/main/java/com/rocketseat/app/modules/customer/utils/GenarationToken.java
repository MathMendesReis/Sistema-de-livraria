package com.rocketseat.app.modules.customer.utils;

import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.rocketseat.app.modules.customer.entitie.CustomerEntitie;
@Service
public class GenarationToken {

  @Value("{security.token.secret}")
  private String secretKey;
  public String generateToken(int minutes,CustomerEntitie customer) {
    Algorithm algorithm = Algorithm.HMAC256(secretKey);
    var expiresIn = Instant.now().plus(Duration.ofMinutes(minutes));
    var token = JWT.create()
        .withIssuer("javagas")
        .withSubject(customer.getId().toString())
        .withExpiresAt(expiresIn)
        .sign(algorithm);

    return token;
  }
  
}
