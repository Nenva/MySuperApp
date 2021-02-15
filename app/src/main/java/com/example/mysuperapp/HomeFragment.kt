package com.example.mysuperapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mysuperapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.homeImage911.setOnClickListener {
            Toast.makeText(requireContext(), "Llamando al 911", Toast.LENGTH_LONG).show()
        }

        binding.homeImagePolice.setOnClickListener {
            Toast.makeText(requireContext(), "Llamando a la policia", Toast.LENGTH_LONG).show()
        }

        binding.homeImageFire.setOnClickListener {
            Toast.makeText(requireContext(), "Llamando a los bomberos", Toast.LENGTH_LONG).show()
        }

        binding.homeImageImOk.setOnClickListener {

        }

        binding.homeImageAmbulance.setOnClickListener {
            Toast.makeText(requireContext(), "Llamando a una ambulancia", Toast.LENGTH_LONG).show()
        }

        binding.homeImageGenreViolence.setOnClickListener {

        }

        binding.homeImageKidnapping.setOnClickListener {

        }

        binding.homeImageRobbery.setOnClickListener {

        }

        return binding.root
    }
}