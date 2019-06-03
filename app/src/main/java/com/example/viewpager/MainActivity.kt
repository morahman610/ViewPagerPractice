package com.example.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View

class MainActivity : AppCompatActivity() {

    internal lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPageAdapter(supportFragmentManager)
        adapter.addFragment(FragmentOne(), "One")
        adapter.addFragment(FragmentTwo(), "Two")
        adapter.addFragment(FragmentThree(), "Three")



        viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        viewPager.adapter = adapter
    }
}
