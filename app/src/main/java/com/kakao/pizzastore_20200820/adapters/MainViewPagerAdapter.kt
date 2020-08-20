package com.kakao.pizzastore_20200820.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kakao.pizzastore_20200820.fragments.MyProfileFragment
import com.kakao.pizzastore_20200820.fragments.PizzaStoreFragment

//8
class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

//8-1
    override fun getCount(): Int {
        return 2
    }

//8-2
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaStoreFragment()
            else -> MyProfileFragment()
        }
    }

//8-3
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "피자주문"
            else -> "내정보설정"
        }
    }

}