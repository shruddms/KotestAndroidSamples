package com.kyungeun.kotestandroidsamples

class LoginModel {

    lateinit var loginUser: LoginUser

    fun login(id: String, pw: String): Boolean {
        if (id == "test" && pw == "1234") {
            loginUser = LoginUser("name", "first", "last", "1@naver.com", "token")
            return true
        }
        return false
    }

    fun getUser(): LoginUser {
        return loginUser
    }

    fun setUser(user: LoginUser) {
        loginUser = user
    }

    fun isLoginResponse(): Boolean {
        if (loginUser.name.isNotEmpty()) {
            return true
        }
        return false
    }

    fun logout() {
        loginUser = LoginUser("", "", "", "", "")
    }

}