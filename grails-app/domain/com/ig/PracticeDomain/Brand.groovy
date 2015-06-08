package com.ig.PracticeDomain

class Brand {
    String name
    String logoPath

    static hasMany = [products:Product]

    static constraints = {
    }
}
