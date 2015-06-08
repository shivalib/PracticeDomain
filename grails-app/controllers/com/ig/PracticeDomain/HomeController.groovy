package com.ig.PracticeDomain

import com.ig.PracticeDomian.Category
import com.ig.PracticeDomian.Customer
import com.ig.PracticeDomian.CustomerOrder
import com.ig.PracticeDomian.OrderedProduct
import com.ig.PracticeDomian.Product

class HomeController {

    def index() {
        Category category = Category.findByName('Clothes')
        def categList = Category.findAllWhere(parentCategory: category)
        println "Main Category :" + category.name
        categList.each { println "Sub category :" + it.name }

        Product product = Product.findByName('shoe')
        println "Parameters of shoe :" + product.parameters
        product.parameters.each { key, value ->
            println("key :" + key + " value :" + value)
        }

        render(view: 'homePage')
    }

    def priceAfterDiscount() {
        Product product = Product.findByName('shoe')
        println "Price of shoe :" + product.price
        def discountedPrice = (product.discount.discountAllowed * product.price) / 100
        def priceAfterDiscount = product.price - discountedPrice
        println("Discount :" + product.discount.discountAllowed + "%")
        println("Price after discount :" + priceAfterDiscount)
    }

    def deleteProduct() {
        Product product = Product.findByName('shoe')
        product.delete(flush: true)
    }

    def averageRating() {
        Product product = Product.findByName('watch')
        println(product.reviews.numberOfStars)
        def sum = 0
        product.reviews.each {
            println "stars :" + it.numberOfStars
            sum += it.numberOfStars
        }

        def avg = sum / product.reviews.size()
        println "Average rating :" + avg
    }

    def afterPriceChange() {
        Customer customer2 = Customer.get(2)

        Product product1 = Product.get(1)
        product1.price = 120
        product1.save(flush: true, failOnError: true)

        CustomerOrder customerOrder = new CustomerOrder(customer: customer2)
        customerOrder.save(failOnError: true, flush: true)

        OrderedProduct orderedProduct3 = new OrderedProduct(product: product1, customerOrder: customerOrder, quantity: 5, price: product1.price)
        orderedProduct3.save(flush: true, failOnError: true)

    }

    def salesOfProduct() {
        Product product = Product.get(1)
        def orderedProduct = OrderedProduct.findAllWhere(product: product)
        println "Product name :" + product.name
        def totalSales = 0
        orderedProduct.each {
            totalSales += it.price
        }
        println "totalSales :" + totalSales
    }
}
