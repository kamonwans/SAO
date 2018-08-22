package com.example.kamonwan_s.sao

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

class PhotoAdapter : PagerAdapter {
     var context: Context
     var path: IntArray
    lateinit var infator : LayoutInflater

    constructor(context: Context, path: IntArray) : super() {
        this.context = context
        this.path = path
    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
    return view == `object` as RelativeLayout
    }

    override fun getCount(): Int {
        return path.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var images : ImageView
        infator = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var pic: View = infator.inflate(R.layout.item_photo,container,false)
        images = pic.findViewById(R.id.imgSlider) as ImageView
        images.setImageResource(path[position])
        container!!.addView(pic)
      return pic
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container!!.removeView(`object` as RelativeLayout)
    }
}