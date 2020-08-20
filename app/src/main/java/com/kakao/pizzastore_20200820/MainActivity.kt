package com.kakao.pizzastore_20200820

import android.os.Bundle
import com.kakao.pizzastore_20200820.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

//BaseActivity
//STEP1 : Fragment + ViewPager + TabLayout
//STEP2 : (Intent1)Fragment + Listview(Dataset) + Glide
//STEp3 : StoreProfile : Photo(circleimageview) + CALL(Tedpermission)
//STEp4 : (Intent2)Fragment

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

//9 : mvpa - MainViewPagerAdapter
    lateinit var mvpa : MainViewPagerAdapter

    override fun setValues() {
//9-1
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa
//10 : tabLayout - build.gradle : implementation 'com.android.support:design:29.0.3'
        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}