package com.example.mysuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mysuperapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        // Hide action bar
        supportActionBar?.hide()

        binding.textRegister.setOnClickListener {
            goRegisterActivityFromLoginActivity()
        }

        binding.buttonLogin.setOnClickListener {
            goMainActivityFromLoginActivity()
        }
    }

    private fun goRegisterActivityFromLoginActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun goMainActivityFromLoginActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}