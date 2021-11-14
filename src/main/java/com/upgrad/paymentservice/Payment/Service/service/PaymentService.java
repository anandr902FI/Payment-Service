package com.upgrad.paymentservice.Payment.Service.service;

import com.upgrad.paymentservice.Payment.Service.dto.PaymentRequestDTO;
import com.upgrad.paymentservice.Payment.Service.dto.PaymentResponseDTO;
import com.upgrad.paymentservice.Payment.Service.entity.TransactionDetailsEntity;

public interface PaymentService {
    public PaymentResponseDTO saveTransaction(PaymentRequestDTO payment);

    TransactionDetailsEntity getTransactionDetails(Integer transactionId);
    Boolean verifyPayment(String paymentType);
}
