package com.vira.buzakechini.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vira.buzakechini.datastorage.Story
import com.vira.buzakechini.activities.ContentActivity
import com.vira.buzakechini.fragments.adapter.StoryListAdapter


class StoryListFragment : Fragment() {

    private val recyclerView: RecyclerView? = null
    private var nav: BottomNavigationView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(vira.buzakechini.R.layout.fragment_story_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(vira.buzakechini.R.id.recyclerList)
        recyclerView.layoutDirection = View.LAYOUT_DIRECTION_RTL
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