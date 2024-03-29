package com.rizal.aplikasitopup

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity){
    private val JUMLAH_MENU = 2
    override fun createFragment(position: Int): Fragment {
        when (position){
            0 ->  {return TopUp()}
            1 -> {return  Joki()}
            else -> (return  TopUp())

        }
    }
    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}