package com.vira.buzakechini.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.mukesh.MarkDown
import vira.buzakechini.R

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        val content = intent.getStringExtra("Content")

        val markdown : ComposeView = findViewById<View>(R.id.markdown) as ComposeView
        markdown.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    MarkDown(
                        text = content!!,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }


    }


}