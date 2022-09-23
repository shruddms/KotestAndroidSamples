package com.kyungeun.kotestandroidsamples

import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe

class LoginUtilUnitTest: FunSpec() {
    private lateinit var loginUtils: LoginUtils

    override fun beforeSpec(spec: Spec) {
        super.beforeSpec(spec)
        println("beforeSpec")
        loginUtils = LoginUtils()
    }

    override fun beforeTest(testCase: TestCase) {
        super.beforeTest(testCase)
        println("beforeTest")
    }

    init {
        /**
         * email test
         */
        test("email is empty") {
            loginUtils.isEmailValid("") shouldBe false
            loginUtils.isEmailValid(" ") shouldBe false
        }

        test("email is include spaces") {
            loginUtils.isEmailValid("i@ gmail.com") shouldBe false
            loginUtils.isEmailValid("i@gmail. com") shouldBe false
        }

        test("email is include more than one dot") {
            loginUtils.isEmailValid("i@gmail.com.a") shouldBe false
        }

        test("email is not include @") {
            loginUtils.isEmailValid("gmail.com") shouldBe false
        }

        test("email format is true") {
            loginUtils.isEmailValid("i@gmail.com") shouldBe true
        }

        /**
         * password test
         */
        test("password is empty") {
            loginUtils.isPasswordValid("") shouldBe false
            loginUtils.isPasswordValid(" ") shouldBe false
        }

        test("password is include spaces") {
            loginUtils.isPasswordValid("12 34567") shouldBe false
        }

        test("password length is less than 8") {
            loginUtils.isPasswordValid("1234567") shouldBe false
        }

        test("password length is greater than 20.") {
            loginUtils.isPasswordValid("123456789123456789123") shouldBe false
        }

        test("password format is true") {
            loginUtils.isPasswordValid("12345678") shouldBe true
        }
    }
}
