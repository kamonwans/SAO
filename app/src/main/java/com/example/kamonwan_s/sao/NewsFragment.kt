package com.example.kamonwan_s.sao

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class NewsFragment : Fragment() {
    private var recyclerViewNews: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_news, container, false)
        initInstance(view)
        return  view
    }
    private fun initInstance(view: View) {
        var adapter = NewsAdapter(generateData())
        val layoutManager = LinearLayoutManager(view.context)
        recyclerViewNews = view.findViewById(R.id.recyclerViewNews) as RecyclerView
        recyclerViewNews?.layoutManager = layoutManager
        recyclerViewNews?.itemAnimator = DefaultItemAnimator()
        recyclerViewNews?.adapter = adapter
    }

    fun generateData(): ArrayList<News> {
        var result = ArrayList<News>()

        for (i in 0..9) {
            var news: News = News("สวัสดีค่ะ กมลวรรณ สิงสวนมอญ", "Hi Title", R.drawable.news_test)
            result.add(news)
        }
        return result
    }
}
