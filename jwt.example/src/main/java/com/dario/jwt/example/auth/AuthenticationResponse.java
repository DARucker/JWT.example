package com.dario.jwt.example.auth;

import lombok.*;

@Data @Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
}
