package com.vira.buzakechini

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import vira.buzakechini.R

import com.google.firebase.storage.ktx.component1
import com.google.firebase.storage.ktx.component2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var settingButton = findViewById<Button>(R.id.settingButton)
        settingButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }


        val navMenu = findViewById<BottomNavigationView>(R.id.navMenu)
        navMenu.selectedItemId = R.id.home
        navMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.setting -> {
                    val intent = Intent(this, SettingActivity::class.java)
                    startActivity(intent)
                    return@setOnItemSelectedListener true
                }
                R.id.home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    return@setOnItemSelectedListener true
                }
                R.id.profile -> {
                    val intent = Intent(this, SampleActivity::class.java)
                    startActivity(intent)
                    return@setOnItemSelectedListener true
                }
                R.id.contentList -> {
                    val intent = Intent(this, ContentActivity::class.java)
                    startActivity(intent)
                    return@setOnItemSelectedListener true
                }
            }
            return@setOnItemSelectedListener false
        }


//        val storage = Firebase.storage
//        val listRef = storage.reference.child("stories/")
//
//        listRef.listAll()
//            .addOnSuccessListener { (items, prefixes) ->
//                prefixes.forEach { prefix ->
//                    // All the prefixes under listRef.
//                    // You may call listAll() recursively on them.
//                    println("Prefix: ***")
//                    println(prefix)
//                }
//
//                items.forEach { item ->
//                    // All the items under listRef.
//                    println("ITEMS: ***")
//                    println(item)
//                }
//            }
//            .addOnFailureListener {
//                // Uh-oh, an error occurred!
//            }


    }
}

