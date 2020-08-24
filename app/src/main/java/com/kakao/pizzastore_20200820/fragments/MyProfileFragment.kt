package com.kakao.pizzastore_20200820.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kakao.pizzastore_20200820.EditNicknameActivity
import com.kakao.pizzastore_20200820.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

//6:내정보변경 -> 7:TabLayout(StorePagerAdapter.kt)
class MyProfileFragment : Fragment(){

    //6-1:onCreateView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    //6-2:onActivityCreated
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //17:nickname
        changeNicknameBtn.setOnClickListener {

            val myIntent = Intent(context!!, EditNicknameActivity::class.java)
        }

    }

}