package com.ig.PracticeDomian

class Discount {
    float discountAllowed
    static belongsTo = [product: Product]
    static constraints = {
    }
}
