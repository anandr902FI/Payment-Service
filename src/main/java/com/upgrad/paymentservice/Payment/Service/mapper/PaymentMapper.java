package com.upgrad.paymentservice.Payment.Service.mapper;

import com.upgrad.paymentservice.Payment.Service.dto.PaymentRequestDTO;
import com.upgrad.paymentservice.Payment.Service.dto.PaymentResponseDTO;
import com.upgrad.paymentservice.Payment.Service.entity.TransactionDetailsEntity;

public class PaymentMapper {

    public static PaymentResponseDTO convertEntityToDTO(TransactionDetailsEntity transaction){
        PaymentResponseDTO tmpPaymentDTO=new PaymentResponseDTO();
        tmpPaymentDTO.setTransactionId(transaction.getTransactionId());
        return tmpPaymentDTO;
    }

    public static TransactionDetailsEntity convertDTOToEntity(PaymentRequestDTO paymentDTO){
        TransactionDetailsEntity tmpTransactionDetailsEntity=new TransactionDetailsEntity();
        tmpTransactionDetailsEntity.setBookingId(paymentDTO.getBookingId());
        tmpTransactionDetailsEntity.setPaymentmode(paymentDTO.getPaymentmode());
        tmpTransactionDetailsEntity.setCardNumber(paymentDTO.getCardNumber());
        tmpTransactionDetailsEntity.setPaymentmode(paymentDTO.getPaymentmode());
        tmpTransactionDetailsEntity.setUpiId(paymentDTO.getUpiId());
        return tmpTransactionDetailsEntity;
    }
}
