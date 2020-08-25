package com.kakao.pizzastore_20200820.fragments

import android.app.Activity
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
class MyProfileFragment : Fragment() {

    //20:닉네임변겅
    val REQ_FOR_NICKNAME = 1000

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

        //20-1:닉네임변겅
        changeNicknameBtn.setOnClickListener {

            val myIntent = Intent(context!!, EditNicknameActivity::class.java)
            //startActivityForResult(myIntent, 1000)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

    }

    //20-2:닉네임변겅(완료)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {
            if (resultCode == Activity.RESULT_OK) {
                myNicknameTxt.text = data?.getStringExtra("nick")
            }
        }
    }

}