package com.ig.PracticeDomain

class Discount {
    float discountAllowed
    static belongsTo = [product: Product]
    static constraints = {
    }
}
