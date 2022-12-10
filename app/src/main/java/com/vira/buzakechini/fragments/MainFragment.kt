package com.vira.buzakechini.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.mukesh.MarkDown
import vira.buzakechini.R
import java.net.URL

class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val markdown : ComposeView  = view!!.findViewById<View>(R.id.markdown) as ComposeView
        markdown.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    MarkDown(
                        url = URL("https://raw.githubusercontent.com/rhmtrz/BuzakChini/master/README.md")
                    )
                }
            }
        }

        return view
    }

}