package com.upgrad.paymentservice.Payment.Service.service.impl;

import com.upgrad.paymentservice.Payment.Service.dto.PaymentRequestDTO;
import com.upgrad.paymentservice.Payment.Service.dto.PaymentResponseDTO;
import com.upgrad.paymentservice.Payment.Service.entity.TransactionDetailsEntity;
import com.upgrad.paymentservice.Payment.Service.execption.InvalidPaymentException;
import com.upgrad.paymentservice.Payment.Service.mapper.PaymentMapper;
import com.upgrad.paymentservice.Payment.Service.repository.PaymentRepo;
import com.upgrad.paymentservice.Payment.Service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public PaymentResponseDTO saveTransaction(PaymentRequestDTO paymentDTO) {
        verifyPayment(paymentDTO.getPaymentmode());
        TransactionDetailsEntity payment = PaymentMapper.convertDTOToEntity(paymentDTO);
        return PaymentMapper.convertEntityToDTO(paymentRepo.save(payment));
    }

    @Override
    public TransactionDetailsEntity getTransactionDetails(Integer transactionId) {
        return paymentRepo.findById(transactionId).get();
    }

    @Override
    public Boolean verifyPayment(String paymentType) {
        if (paymentType.toUpperCase().equals("CARD") || paymentType.toUpperCase().equals("UPI")) {
            return Boolean.TRUE;
        } else {
            throw new InvalidPaymentException("INVALID MODE OF PAYMENT");
        }

    }
}
