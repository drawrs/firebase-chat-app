package com.fiqri.clonewhatsapp.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.*

class TabPagerAdapter( fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    var titles: ArrayList<String>? = null
    var fragments: ArrayList<Fragment>? = null

    fun addFragment(fragment: Fragment, title: String) {
        titles?.add(title)
        fragments?.add(fragment)
    }

    override fun getItem(index: Int): Fragment {
        return fragments!![index]
    }

    override fun getCount(): Int {
        return fragments?.size!!
    }

    override fun getPageTitle(index: Int): CharSequence? {
        return titles?.get(index)
    }
}