package com.kakao.pizzastore_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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

    override fun setValues() {

    }

}