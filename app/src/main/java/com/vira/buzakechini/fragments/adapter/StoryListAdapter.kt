package com.vira.buzakechini.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vira.buzakechini.datastorage.Story
import com.vira.buzakechini.datastorage.storyList
import vira.buzakechini.R

class StoryListAdapter(
    private val onClick: (Story) -> Unit
) : RecyclerView.Adapter<StoryListAdapter.StoryViewHolder>() {

    inner class StoryViewHolder(item: View, val onClick: (Story) -> Unit) : RecyclerView.ViewHolder(item) {
        private val title: TextView = item.findViewById(R.id.titleText)
        private val author: TextView = item.findViewById(R.id.authorText)
        private var currentStory: Story? = null

        init {
            item.setOnClickListener {
                currentStory?.let {
                    onClick(it)
                }
            }
        }

        /* Bind story */
        fun bind(story: Story) {
            currentStory = story
            title.text = story.title
            author.text = story.author
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.story_list_item, parent, false)
        return StoryViewHolder(itemView, onClick)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val story = storyList()[position]
        holder.bind(story)
    }

    override fun getItemCount(): Int {
        return storyList().size
    }



}