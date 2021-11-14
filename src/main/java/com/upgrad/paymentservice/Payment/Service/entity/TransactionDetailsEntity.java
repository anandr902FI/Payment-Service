package com.upgrad.paymentservice.Payment.Service.entity;

import javax.persistence.*;

@Entity
@Table(name ="payment_service",schema="RESTARTURANT", catalog="")
public class TransactionDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name="paymentmode")
    private String paymentmode;

    @Column(name="booking_id",nullable=false)
    private Integer bookingId;

    @Column(name="upi_id",nullable = true)
    private String upiId;

    @Column(name="card_number",nullable = true)
    private String cardNumber;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
