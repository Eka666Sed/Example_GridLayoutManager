package com.yandexpracticum.example_gridlayoutmanager

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val title: TextView = itemView.findViewById(R.id.title)
    private val description: TextView = itemView.findViewById(R.id.description)

    fun bind(news: News) {
        title.text = news.title
        description.text = news.description
    }
}