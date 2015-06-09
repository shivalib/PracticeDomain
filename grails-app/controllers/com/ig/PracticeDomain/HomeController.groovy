package com.ig.PracticeDomain

import org.hibernate.criterion.Projections

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

    def orderTotal() {
        CustomerOrder customerOrder = CustomerOrder.get(1)

        def orderedProducts = OrderedProduct.findAllByCustomerOrder(customerOrder)
        def productTotal
        def grandTotal = 0

        println "try :" + orderedProducts.product.discountedPrice.sum()

        orderedProducts.each {
            productTotal = 0
            println it.product.name
            println "price after discount :" + it.product.discountedPrice
            println "quantity :" + it.quantity
            productTotal = it.quantity * it.product.discountedPrice
            println "product total=" + productTotal
            grandTotal += productTotal
        }
        println "Order total :" + grandTotal
    }

    def priceAfterDiscount() {
        CustomerOrder customerOrder = CustomerOrder.get(1)
        def products = OrderedProduct.createCriteria().list {
            eq('customerOrder', customerOrder)
            projections {
                sqlProjection 'sum(quantity * price) as totalPrice', 'totalPrice', FLOAT
            }
        }

        println "Order total :" + products
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

    def viewShoppingCart() {
        Customer customer = Customer.get(1)
        ShoppingCart shoppingCart = ShoppingCart.findByCustomer(customer)
        println shoppingCart.cartProducts.product
    }

    def viewBrand() {
        println ".........."
        Product product = Product.get(1)
        println product.brand.name
    }

    def viewProductOfBrand() {
        println "--------"
        Brand brand = Brand.get(1)
        def productList = Product.findAllWhere(brand: brand)
        println brand.name
        println productList.name
    }

}
