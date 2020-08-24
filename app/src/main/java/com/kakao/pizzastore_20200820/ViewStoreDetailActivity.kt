package com.kakao.pizzastore_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kakao.pizzastore_20200820.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

//15:피자가게상세페이지(Intent) -> 16:피자가게전화걸기
class ViewStoreDetailActivity : BaseActivity() {

    //15-1:Store
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

        //15-2:Intent(activity_store_detail1)
        mStore = intent.getSerializableExtra("storeInfo") as Store //StoreListFragment:IntentName
        nameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum
        Glide.with(mContext).load(mStore.logoUrl).into(logoImg)
    }

}