package com.vira.buzakechini.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.common.data.DataHolder
import com.vira.buzakechini.fragments.placeholder.DastanhaViewHolderList
import com.vira.buzakechini.fragments.placeholder.StoryViewHolderList
import vira.buzakechini.R

class AdapterListDastanha(val dastanha: List<String>) : RecyclerView.Adapter<DastanhaViewHolderList> {

    override fun getItemCount(): Int {
        return dastanha.size

    }

    override fun onBindViewHolder(holder: DastanhaViewHolderList, position: Int) {
        holder.list.text = dastanha[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DastanhaViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.safheListDastanha, parent, false)
        return StoryViewHolderList(itemView)
    }


}