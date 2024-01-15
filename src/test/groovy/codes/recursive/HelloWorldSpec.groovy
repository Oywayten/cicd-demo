package codes.recursive

/**
 * Oywayten 13.01.2024.
 */

class HelloWorldSpec extends AbstractSpec {

    def "test hello world"() {
        def foo = 'bar'
        when:
        foo == 'bar'
        then:
        foo.reverse() == 'rab'
    }
}
