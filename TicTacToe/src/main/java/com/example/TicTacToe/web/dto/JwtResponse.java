package com.example.TicTacToe.web.dto;


import lombok.Data;

@Data
public class JwtResponse {
    String accessToken;
    String refreshToken;
}
