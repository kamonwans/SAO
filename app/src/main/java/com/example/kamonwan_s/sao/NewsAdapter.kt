package com.example.kamonwan_s.sao

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.system.Os.bind
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class NewsAdapter(private var items: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var news = items[position]
        holder?.tvDetailNews?.text = news.detailNews
        holder?.tvTitleNews?.text = news.titleNews
        holder?.imgNews?.setImageResource(news.photoNews)
        holder?.itemView.setOnClickListener {

            Log.d("NewsDetail", "Next to page DetailNews")
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_news, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        var tvDetailNews: TextView? = null
        var tvTitleNews: TextView? = null
        var imgNews: ImageView? = null

        init {
            this.tvDetailNews = row?.findViewById(R.id.tvDetailNews) as TextView
            this.tvTitleNews = row?.findViewById(R.id.tvTitleNews) as TextView
            this.imgNews = row?.findViewById(R.id.imgNews) as ImageView


        }

    }


}



