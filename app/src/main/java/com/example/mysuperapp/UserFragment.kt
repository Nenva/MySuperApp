package com.example.mysuperapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mysuperapp.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user, container, false)

        binding.fabUpdateUser.setOnClickListener {
            goUpdateUserActivityFromUserInfoFragment()
        }

        return binding.root
    }

    private fun goUpdateUserActivityFromUserInfoFragment() {
        val intent = Intent(context, UpdateUserActivity::class.java)
        startActivity(intent)
    }
}