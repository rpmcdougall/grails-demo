package grails.demo

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import grails.plugin.json.view.mvc.JsonViewResolver

@SuppressWarnings('MethodName')
class ProductControllerSpec extends Specification implements ControllerUnitTest<ProductController> {

    void setup() {
        Product.saveAll(
                new Product(name: 'Apple', price: 2.0),
                new Product(name: 'Orange', price: 3.0),
                new Product(name: 'Banana', price: 1.0),
                new Product(name: 'Cake', price: 4.0)
        )

    }

    def cleanup() {
    }

    void "test search results"() {
        when: 'A query is executed that finds results'
        controller.search('pp', 10)

        then: 'The response is correct'
        response.json.size() == 1
        response.json[0].name == 'Apple'
    }
}
