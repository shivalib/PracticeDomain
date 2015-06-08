package com.ig.PracticeDomain

class Brand {
    String name
    String logoPath

    static constraints = {
        logoPath(nullable: true,blank: true)
    }
}
