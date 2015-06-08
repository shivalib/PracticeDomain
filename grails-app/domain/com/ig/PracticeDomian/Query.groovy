package com.ig.PracticeDomian

class Query {
    String description
    String type

    static constraints = {
        type(nullable: false,blank: false,inList: ['Color','Design','Material','Usage','Size'])
    }
}
