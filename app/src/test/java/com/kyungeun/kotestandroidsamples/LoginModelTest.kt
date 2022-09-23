package com.kyungeun.kotestandroidsamples

import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.TestCase

class LoginModelTest : FunSpec() {

    override fun beforeSpec(spec: Spec) {
        super.beforeSpec(spec)
        println("beforeSpec")
    }

    override fun beforeTest(testCase: TestCase) {
        super.beforeTest(testCase)
        println("beforeTest")
    }

    init {
        test("LoginModelTest") {
            val loginModel = LoginModel()
            loginModel.login("test", "1234")
        }


    }


}