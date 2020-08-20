package com.kakao.pizzastore_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kakao.pizzastore_20200820.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    //18
    lateinit var mStore: Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

//18-1
        mStore = intent.getSerializableExtra("storeInfo") as Store
        nameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum
        Glide.with(mContext).load(mStore.logoUrl).into(logoImg)

    }

}