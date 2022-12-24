package com.vira.buzakechini.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import vira.buzakechini.R
import com.vira.buzakechini.fragments.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navMenu = findViewById<BottomNavigationView>(R.id.navMenu)
        navMenu.selectedItemId = R.id.home
        supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, MainFragment()).commit()

        navMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, MainFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, ProfileFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.storyList -> {
                    return@setOnItemSelectedListener true
                }
            }

            return@setOnItemSelectedListener false
        }
        
    }





}

