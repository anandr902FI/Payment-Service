package com.upgrad.paymentservice.Payment.Service.controller;

import com.upgrad.paymentservice.Payment.Service.dto.PaymentRequestDTO;
import com.upgrad.paymentservice.Payment.Service.dto.PaymentResponseDTO;
import com.upgrad.paymentservice.Payment.Service.entity.TransactionDetailsEntity;
import com.upgrad.paymentservice.Payment.Service.service.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment/v1")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping(value="/transaction")
    public ResponseEntity<PaymentResponseDTO> savePayment(@RequestBody PaymentRequestDTO paymentDTO){

        PaymentResponseDTO response = paymentService.saveTransaction(paymentDTO);
        return  ResponseEntity.ok(response);
    }

    @GetMapping(value="/transaction/{transactionId}")
    public ResponseEntity<TransactionDetailsEntity> getTransactionDetails(@PathVariable Integer transactionId){
        TransactionDetailsEntity response = paymentService.getTransactionDetails(transactionId);
        return ResponseEntity.ok(response);
    }
}
