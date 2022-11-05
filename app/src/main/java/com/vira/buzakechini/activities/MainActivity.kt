package com.vira.buzakechini.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import vira.buzakechini.R

import com.google.firebase.storage.ktx.component1
import com.google.firebase.storage.ktx.component2
import com.vira.buzakechini.fragments.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var settingButton = findViewById<Button>(R.id.settingButton)
//        settingButton.setOnClickListener {
//            val intent = Intent(this, SettingActivity::class.java)
//            startActivity(intent)
//        }



        val navMenu = findViewById<BottomNavigationView>(R.id.navMenu)
        navMenu.selectedItemId = R.id.home
        supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, MainFragment()).commit()



        navMenu.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, MainFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.setting -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, SettingFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, ProfileFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.storyList -> {
                    supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, storyFragment()).commit()
                    return@setOnItemSelectedListener true
                }
            }

            return@setOnItemSelectedListener false
        }
        
    }





}

