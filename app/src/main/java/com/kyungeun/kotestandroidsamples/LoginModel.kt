package com.kyungeun.kotestandroidsamples

class LoginModel {

        fun login(id: String, pw: String): Boolean {
            return id == "test" && pw == "1234"
        }
}