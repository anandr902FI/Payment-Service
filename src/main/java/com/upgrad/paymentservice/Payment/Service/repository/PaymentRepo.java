package com.upgrad.paymentservice.Payment.Service.repository;

import com.upgrad.paymentservice.Payment.Service.entity.TransactionDetailsEntity;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<TransactionDetailsEntity,Integer> {
}
