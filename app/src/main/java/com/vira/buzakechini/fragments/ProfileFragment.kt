package com.vira.buzakechini.fragments

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vira.buzakechini.Story
import com.vira.buzakechini.activities.ContentActivity


class ProfileFragment : Fragment() {

    private val recyclerView: RecyclerView? = null
    private var nav: BottomNavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(vira.buzakechini.R.layout.fragment_profile, container, false)
        val recyclerView = view.findViewById<RecyclerView>(vira.buzakechini.R.id.recyclerList)
        val linearLayoutManager = LinearLayoutManager(view.context)
        val adapter = StoryListAdapter { story -> adapterOnClick(story)}

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
        nav = view.findViewById(vira.buzakechini.R.id.navMenu)

        return view
    }

    private fun adapterOnClick(story: Story) {
        val intent = Intent(context, ContentActivity()::class.java)
        intent.putExtra("Content", story.content)

        startActivity(intent)
    }

}