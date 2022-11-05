package com.vira.buzakechini.fragments.placeholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vira.buzakechini.R

class StoryViewHolderList(item: View) : RecyclerView.ViewHolder(item) {
    val list: TextView = item.findViewById(R.id.Text1)
}