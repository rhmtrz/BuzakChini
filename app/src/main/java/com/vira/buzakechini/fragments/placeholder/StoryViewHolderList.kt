package com.vira.buzakechini.fragments.placeholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vira.buzakechini.R

class StoryViewHolderList(item: View) : RecyclerView.ViewHolder(item) {
    val title: TextView = item.findViewById(R.id.titleText)
    val author: TextView = item.findViewById(R.id.authorText)
}