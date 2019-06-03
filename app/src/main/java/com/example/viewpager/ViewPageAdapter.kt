package com.example.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.view.View

class ViewPageAdapter(fragmentManager : FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    val fragmentList : MutableList<Fragment> = ArrayList()
    val titleList : MutableList<String> = ArrayList()

    override fun getItem(p0: Int): Fragment {
        return fragmentList[p0]
    }

    override fun getCount(): Int {
        return fragmentList.count()
    }

    fun addFragment (fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}