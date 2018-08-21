package com.example.kamonwan_s.sao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   private lateinit var recyclerViewNews : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initInstance()
    }

    private fun initInstance() {
        recyclerViewNews = findViewById(R.id.recyclerViewNews) as RecyclerView
    }
}
