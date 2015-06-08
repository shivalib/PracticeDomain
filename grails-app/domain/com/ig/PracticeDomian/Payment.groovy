package com.ig.PracticeDomian

class Payment {
    String method
    static belongsTo = [customer:Customer]

    static constraints = {
        method(inList: ['Credit Card', 'Debit Card', 'Net Banking', 'EMI', 'Cash On Delivery'])
    }
}
