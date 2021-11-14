package com.upgrad.paymentservice.Payment.Service.dto;

import java.util.List;

public class ErrorResponse {
    private String message;
//     HttpStatus status;
    private List<String> errorDetails;

    public ErrorResponse(String message, List<String> errorDetails) {
        this.message = message;
//        this.status=status;
        this.errorDetails = errorDetails;
    }
}
