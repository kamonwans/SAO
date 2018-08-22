package com.example.kamonwan_s.sao

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.viewpagerindicator.CirclePageIndicator

class DetailNewsFragment : Fragment() {

    lateinit var pagerPhoto : ViewPager
    lateinit var indicator : CirclePageIndicator
    var path : IntArray = intArrayOf(R.drawable.one,R.drawable.two,R.drawable.three)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_detail_news, container, false)
        initInstance(view)

        return view
    }

    private fun initInstance(view: View?) {
        pagerPhoto = view?.findViewById(R.id.pagerPhoto) as ViewPager
        indicator = view?.findViewById(R.id.indicator) as CirclePageIndicator

        var adapter : PagerAdapter = PhotoAdapter(super.getContext()!!,path)
        pagerPhoto.adapter = adapter
        pagerPhoto.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
             // Toast.makeText(this, path[position], Toast.LENGTH_LONG).show()

            }

        })

        indicator.setViewPager(pagerPhoto)

    }


}
