package com.revature.spring_mvc;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ErrorResponse {

    private int statusCode;
    private String message;
    private LocalDateTime timestamp;

    public ErrorResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

}
