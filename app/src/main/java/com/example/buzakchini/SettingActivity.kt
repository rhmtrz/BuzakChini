package com.example.buzakchini

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingActivity : AppCompatActivity() {
    override fun onCreate(instaState: Bundle?) {
        super.onCreate(instaState)
        setContentView(R.layout.safhe_tanzimat);

        var btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}