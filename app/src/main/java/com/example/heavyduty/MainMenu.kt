package com.example.heavyduty

import Beranda
import Pesanan
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.heavyduty.databinding.ActivityMainBinding

class MainMenu : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Beranda())

        binding.bottomNavigationView.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.Home -> replaceFragment(Beranda())
                R.id.Pesanan -> replaceFragment(Pesanan())
                R.id.Bantuan -> replaceFragment(Bantuan())
                R.id.Akun -> replaceFragment(Akun())
                else -> {
                    // Handle case when no item is selected
                }
            }
            true
        }
        }

        private fun replaceFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content, fragment)
                .commit()
    }}


