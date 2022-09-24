package com.kyungeun.kotestandroidsamples

import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class LoginModelTest : FunSpec() {

    private lateinit var loginModel: LoginModel

    override fun beforeSpec(spec: Spec) {
        super.beforeSpec(spec)
        println("beforeSpec")
        loginModel = LoginModel()
    }

    override fun beforeTest(testCase: TestCase) {
        super.beforeTest(testCase)
        println("beforeTest")
    }

    init {
        test("login model test") {
            loginModel.login("test", "1234") shouldBe true
        }

        test("login success response data test") {
          loginModel.isLoginResponse() shouldBe true
        }

    }


}