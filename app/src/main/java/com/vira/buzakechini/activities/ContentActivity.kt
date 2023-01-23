package com.vira.buzakechini.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.mukesh.MarkDown
import vira.buzakechini.R
import io.noties.markwon.Markwon
import io.noties.markwon.html.HtmlPlugin
import vira.buzakechini.databinding.ActivityMainBinding

class ContentActivity : AppCompatActivity() {
    private lateinit var views : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        val contentView =  findViewById<TextView>(R.id.working_example_text)

        val content = intent.getStringExtra("Content")

        val markwon = Markwon.builder(this)
            .usePlugin(HtmlPlugin.create())
            .build()

        val node = markwon.parse(
            content!!
        )

        val spanned = markwon.render(node)

        markwon.setParsedMarkdown(contentView, spanned)


    }


}