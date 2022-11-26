package com.vira.buzakechini.fragments.placeholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vira.buzakechini.R

class DastanhaViewHolderList(item: View) : RecyclerView.ViewHolder(item) {
    val list : TextView = item.findViewById(R.id.nameDastan)
}