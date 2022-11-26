package com.vira.buzakechini.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vira.buzakechini.fragments.adapter.AdapterListDastanha
import vira.buzakechini.R

class FehrestDastanhaFragment : Fragment()  {

    val listDastanha = listOf(
        "داستان بزک چینی",
        "شاگردان موفق ویرا",
        "تیم فوتبال ویرا",
        "داستان صنف برنامه نویسها",
        "ワリオ",
        "ワルイージ",
        "ヘイホー"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val design = inflater.inflate(R.layout.fragment_fehrest_dastanha, container, false)
        val recyclerView = design.findViewById<RecyclerView>(R.id.safheListDastanha)
        val linearLayoutManager = LinearLayoutManager(design.context)
        val adapter = AdapterListDastanha(listDastanha)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter

        return design
    }

}