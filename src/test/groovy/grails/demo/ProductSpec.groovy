package grails.demo

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ProductSpec extends Specification implements DomainUnitTest<Product> {

    def setup() {
    }

    def cleanup() {
    }

    void "Domain class validation"() {
        when: 'A domain class is saved with bad data'
        Product product = new Product(name: '', price: -2.0d)
        product.save()

        then: 'There were errors and the data was not saved'
        product.hasErrors()
        product.errors.getFieldError('price')
        product.errors.getFieldError('name')
        Product.count() == 0

        when: 'A valid product is saved'
        product.name = 'Smoked Brisket'
        product.price = 9.72d
        product.save()

        then: 'The product was saved successfully'
        Product.count() == 1
        Product.first().price == 9.72d

    }
}



