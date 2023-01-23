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
        navMenu.selectedItemId = R.id.storyList
        supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, StoryListFragment()).commit()

        navMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.storyList -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, StoryListFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.setting -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, SettingFragment()).commit()
                    return@setOnItemSelectedListener true
                }
            }

            return@setOnItemSelectedListener false
        }
        
    }





}

