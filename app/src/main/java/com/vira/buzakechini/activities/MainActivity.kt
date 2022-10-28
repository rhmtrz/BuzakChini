package com.vira.buzakechini.activities

import android.content.Intent
import android.os.Bundle
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
import com.vira.buzakechini.fragments.ContentsListFragment
import com.vira.buzakechini.fragments.MainFragment
import com.vira.buzakechini.fragments.SettingFragment

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
            lateinit var selectedFragment: Fragment
            when(item.itemId) {
                R.id.home -> {
                    selectedFragment = MainFragment()
                }
                R.id.profile -> {
                    selectedFragment = SettingFragment()

                }
                R.id.contentList -> {
                    selectedFragment = ContentsListFragment()
                }
                R.id.setting -> {
                    selectedFragment = SettingFragment()
                }
            }
            supportFragmentManager.beginTransaction().replace(R.id.navbarHostFragment, selectedFragment).commit()
            true
        }


    }





}

