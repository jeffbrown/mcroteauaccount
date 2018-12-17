package mcroteauaccount

import grails.testing.gorm.DataTest
import spock.lang.Specification

class AccountSpec extends Specification implements DataTest {

    void setupSpec() {
        mockDomain Account
    }

    void "test basic persistence mocking"() {
        setup:
        def account = new Account(name: 'Robert Fripp', username: "robert", password: "robert", email: "robert@mail.com").save(flush: true)

        expect:
        Account.count() == 1
    }
}
