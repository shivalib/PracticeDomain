package com.ig.PracticeDomian

class Brand {
    String name
    String logoPath

    static hasMany = [products:Product]

    static constraints = {
    }
}
