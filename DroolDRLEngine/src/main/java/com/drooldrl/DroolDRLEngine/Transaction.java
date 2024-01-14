package com.drooldrl.DroolDRLEngine;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    private int amount;

    private String sendCountry;

    private String recipientCountry;
    private String sendCurrency;

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//
//    public String getSendCountry() {
//        return sendCountry;
//    }
//
//    public void setSendCountry(String sendCountry) {
//        this.sendCountry = sendCountry;
//    }
//
//    public String getRecipientCountry() {
//        return recipientCountry;
//    }
//
//    public void setRecipientCountry(String recipientCountry) {
//        this.recipientCountry = recipientCountry;
//    }
//
//    public String getSendCurrency() {
//        return sendCurrency;
//    }
//
//    public void setSendCurrency(String sendCurrency) {
//        this.sendCurrency = sendCurrency;
//    }
//
//    public String getRecieveCurrency() {
//        return recieveCurrency;
//    }
//
//    public void setRecieveCurrency(String recieveCurrency) {
//        this.recieveCurrency = recieveCurrency;
//    }
//
//    public String getBinNumber() {
//        return binNumber;
//    }
//
//    public void setBinNumber(String binNumber) {
//        this.binNumber = binNumber;
//    }
//
//    public String getCardCountry() {
//        return cardCountry;
//    }
//
//    public void setCardCountry(String cardCountry) {
//        this.cardCountry = cardCountry;
//    }
//
//    public String getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public Boolean getFirstPaid() {
//        return firstPaid;
//    }
//
//    public void setFirstPaid(Boolean firstPaid) {
//        this.firstPaid = firstPaid;
//    }
//
//    public int getTimeSinceFirstTransaction() {
//        return timeSinceFirstTransaction;
//    }
//
//    public void setTimeSinceFirstTransaction(int timeSinceFirstTransaction) {
//        this.timeSinceFirstTransaction = timeSinceFirstTransaction;
//    }
//
//    public String getThreeDsCheck() {
//        return threeDsCheck;
//    }
//
//    public void setThreeDsCheck(String threeDsCheck) {
//        this.threeDsCheck = threeDsCheck;
//    }
//
//    public int getTotalTransactionInTwelveHours() {
//        return totalTransactionInTwelveHours;
//    }
//
//    public void setTotalTransactionInTwelveHours(int totalTransactionInTwelveHours) {
//        this.totalTransactionInTwelveHours = totalTransactionInTwelveHours;
//    }
//
//    public int getCardsAddedInADay() {
//        return cardsAddedInADay;
//    }
//
//    public void setCardsAddedInADay(int cardsAddedInADay) {
//        this.cardsAddedInADay = cardsAddedInADay;
//    }

    private String recieveCurrency;

    private String binNumber;

    //    private Boolean block;
    private String cardCountry;

    private String paymentMethod;

    private Boolean firstPaid;

    private int timeSinceFirstTransaction;

    private String threeDsCheck;

    private int totalTransactionInTwelveHours;

    private int cardsAddedInADay;

}
