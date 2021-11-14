package com.upgrad.paymentservice.Payment.Service.execption.Handler;

import com.upgrad.paymentservice.Payment.Service.dto.ErrorResponse;
import com.upgrad.paymentservice.Payment.Service.execption.InvalidPaymentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHanlder extends ResponseEntityExceptionHandler {

    private String INVALID_PAYMENT = "INVALID MODE OF PAYMENT";

    @ExceptionHandler(value = InvalidPaymentException.class)
    public ResponseEntity<ErrorResponse> handleInvalidPaymentType(InvalidPaymentException e, WebRequest r) {
        List<String> errorDetails = new ArrayList<String>();
        errorDetails.add(e.getLocalizedMessage());
        ErrorResponse response = new ErrorResponse(INVALID_PAYMENT, errorDetails);
        return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
    }

}
