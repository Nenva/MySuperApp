package com.example.mysuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mysuperapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        // Hide action bar
        supportActionBar?.hide()

        binding.buttonRegisterUser.setOnClickListener {
            goMainActivityFromRegisterActivity()
        }

        binding.textLogin.setOnClickListener {
            goLoginActivityFromRegisterActivity()
        }
    }

    private fun goMainActivityFromRegisterActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun goLoginActivityFromRegisterActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

    }
}