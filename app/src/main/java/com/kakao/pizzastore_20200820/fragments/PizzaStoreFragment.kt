package com.kakao.pizzastore_20200820.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakao.pizzastore_20200820.adapters.StoreAdapter
import com.kakao.pizzastore_20200820.datas.Store
import com.kakao.pizzastore_20200820.R
import com.kakao.pizzastore_20200820.ViewStoreDetailActivity
import kotlinx.android.synthetic.main.fragment_pizza_store.*

//2
class PizzaStoreFragment : Fragment() {

    //15
    val mPizzaStoreList = ArrayList<Store>()

    //15-2
    lateinit var mPizzaStoreAdapter: StoreAdapter

    //3 : fragment_pizza.xml <ListView>
//4
    override

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_pizza_store, container, false)
    }

    //5
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //15-1
        mPizzaStoreList.add(
            Store(
                "피자헛",
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg",
                "1588-5588"
            )
        )
        mPizzaStoreList.add(
            Store(
                "파파존스",
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800",
                "1577-8080"
            )
        )
        mPizzaStoreList.add(
            Store(
                "미스터피자",
                "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200",
                "1577-0077"
            )
        )
        mPizzaStoreList.add(
            Store(
                "도미노피자",
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png",
                "1577-3082"
            )
        )

        //15-3
        mPizzaStoreAdapter = StoreAdapter(context!!, R.layout.store_list_item, mPizzaStoreList)
        pizzaStoreListView.adapter = mPizzaStoreAdapter


        //17
        pizzaStoreListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStore = mPizzaStoreList[position]
            val myIntent = Intent(context, ViewStoreDetailActivity::class.java)
//17-1 : Store.class -> Serializable
            myIntent.putExtra("storeInfo", clickedStore)
            startActivity(myIntent)

        }
    }

}