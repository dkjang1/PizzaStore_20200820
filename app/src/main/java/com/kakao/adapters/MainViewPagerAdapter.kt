package com.kakao.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "피자주문"
            else -> "내정보설정"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaFragment()
            else -> ProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }


}