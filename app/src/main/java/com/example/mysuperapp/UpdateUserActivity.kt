package com.example.mysuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mysuperapp.databinding.ActivityUpdateUserBinding

class UpdateUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_update_user)

        // Hide action bar
        supportActionBar?.hide()

        binding.buttonUpdateUser.setOnClickListener {
            goFromUpdateUserActivityToMainActivity()
        }

        binding.buttonCancelUpdateUser.setOnClickListener {
            goFromUpdateUserActivityToMainActivity()
        }
    }

    private fun goFromUpdateUserActivityToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}