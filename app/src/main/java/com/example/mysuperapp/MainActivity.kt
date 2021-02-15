package com.example.mysuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.mysuperapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,  R.layout.activity_main)

        // Bottom navigation
        navController = findNavController(R.id.host_fragment)
        binding.bottomNav.setupWithNavController(navController)

        // Navigation up button
        appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawerLayout)
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerLayout)

        // Toggle drawer navigation
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Set item click drawer navigation menu
        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.sos -> Toast.makeText(this, "SOS Emergencias",
                Toast.LENGTH_SHORT).show()
                R.id.municipality -> Toast.makeText(this, "Municipalidad",
                    Toast.LENGTH_SHORT).show()
                R.id.procedures -> Toast.makeText(this, "Trámites",
                    Toast.LENGTH_SHORT).show()
                R.id.services -> Toast.makeText(this, "Servicios",
                    Toast.LENGTH_SHORT).show()
                R.id.official_web -> Toast.makeText(this, "Página web oficial",
                    Toast.LENGTH_SHORT).show()
                R.id.coronavirus -> Toast.makeText(this, "Coronavirus",
                    Toast.LENGTH_SHORT).show()
                R.id.number_phones -> Toast.makeText(this, "Teléfonos útiles",
                    Toast.LENGTH_SHORT).show()
                R.id.videos -> Toast.makeText(this, "Videos",
                    Toast.LENGTH_SHORT).show()
                R.id.faq -> Toast.makeText(this, "FAQ",
                    Toast.LENGTH_SHORT).show()
                R.id.terms_and_conditions ->
                    Toast.makeText(this, "Términos y condiciones",
                    Toast.LENGTH_SHORT).show()
                R.id.logout ->
                goLoginActivityFromMainActivity()
            }
            true
        }
    }

    private fun goLoginActivityFromMainActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}