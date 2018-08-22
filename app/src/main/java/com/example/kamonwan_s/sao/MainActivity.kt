package com.example.kamonwan_s.sao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerViewNews: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // initInstance()
        FragmentNews()
        //FragmentDetailNews()
    }

//    private fun initInstance() {
//        var adapter = NewsAdapter(generateData())
//        val layoutManager = LinearLayoutManager(applicationContext)
//        recyclerViewNews = findViewById(R.id.recyclerViewNews) as RecyclerView
//        recyclerViewNews?.layoutManager = layoutManager
//        recyclerViewNews?.itemAnimator = DefaultItemAnimator()
//        recyclerViewNews?.adapter = adapter
//    }
//
//    fun generateData(): ArrayList<News> {
//        var result = ArrayList<News>()
//
//        for (i in 0..9) {
//            var news: News = News("สวัสดีค่ะ กมลวรรณ สิงสวนมอญ", "Hi Title", R.drawable.news_test)
//            result.add(news)
//        }
//        return result
//    }
//
//    fun FragmentDetailNews() {
//        val fragment = DetailNewsFragment()
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container, fragment)
//        transaction.commit()
//
//    }
    fun FragmentNews() {
        val fragment = NewsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()

    }
}


