package com.upgrad.paymentservice.Payment.Service.execption;

public class InvalidPaymentException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public InvalidPaymentException(String message) {
        super(message);
    }
}
