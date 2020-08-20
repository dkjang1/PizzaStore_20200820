package com.kakao.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.kakao.datas.Store

class PizzaStoreAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: List<Store>
) : ArrayAdapter<Store>(mContext, resId, mList) {
}