package com.ig.PracticeDomain

enum PaymentMethod {
    CREDITCARD('creditCard'),
    DEBITCARD('debitCard'),
    NETBANKING('netBanking'),
    EMI('emi'),
    CASHONDELIVERY('cashOnDelivery')

    String paymentMethod

    PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod
    }


}