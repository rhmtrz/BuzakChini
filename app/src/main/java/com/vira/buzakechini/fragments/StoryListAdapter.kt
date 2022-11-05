package com.vira.buzakechini.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vira.buzakechini.fragments.placeholder.StoryViewHolderList
import vira.buzakechini.R

class StoryListAdapter(val list: List<String>) : RecyclerView.Adapter<StoryViewHolderList>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.story_list_item, parent, false)
        return StoryViewHolderList(itemView)
    }

    override fun onBindViewHolder(holder: StoryViewHolderList, position: Int) {
        holder.list.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}