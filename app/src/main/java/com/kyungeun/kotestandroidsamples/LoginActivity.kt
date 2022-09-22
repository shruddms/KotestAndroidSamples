package com.kyungeun.kotestandroidsamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.kyungeun.kotestandroidsamples.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val loginUtils: LoginUtils by lazy { LoginUtils() }

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener { view ->
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (loginUtils.isEmailValid(email) && loginUtils.isPasswordValid(password)) {
                Snackbar.make(view, "Login Success", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else {
                Snackbar.make(view, "Login Failed", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }
    }
}