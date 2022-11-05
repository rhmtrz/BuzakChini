package com.vira.buzakechini.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vira.buzakechini.R


class ProfileFragment : Fragment() {

    private val recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    val TextList = listOf(
        "マリオ",
        "ルイージ",
        "ピーチ",
        "クッパ",
        "デイジー",
        "ワリオ",
        "ワルイージ",
        "ヘイホー"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_profile, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerList)
        val linearLayoutManager = LinearLayoutManager(view.context)
        val adapter = StoryListAdapter(TextList)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter



        return view
    }


}