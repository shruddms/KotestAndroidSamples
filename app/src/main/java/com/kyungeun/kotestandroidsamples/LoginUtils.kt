package com.kyungeun.kotestandroidsamples

import java.util.regex.Pattern

class LoginUtils {
    fun isEmailValid(email: String): Boolean {
        val EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        val pattern = Pattern.compile(EMAIL_PATTERN)
        return pattern.matcher(email).matches()
    }

    fun isPasswordValid(password: String): Boolean {
        return password.length in 8..20 && !password.contains(" ")
    }
}