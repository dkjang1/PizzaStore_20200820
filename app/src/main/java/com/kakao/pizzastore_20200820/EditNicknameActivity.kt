package com.kakao.pizzastore_20200820

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        //19
        okBtn.setOnClickListener {

            val inputNickname = newNicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

    }

    override fun setValues() {

    }

}