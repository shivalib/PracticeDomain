package com.ig.PracticeDomain

class Category {
    String name
    Category parentCategory

    static constraints = {
        parentCategory(nullable: true)
        name(nullable: true, blank: true)
    }
}
