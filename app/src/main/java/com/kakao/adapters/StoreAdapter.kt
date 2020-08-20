package com.kakao.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.kakao.datas.Store
import com.kakao.pizzastore_20200820.R

class StoreAdapter(
//14
    val mContext: Context,
    val resId: Int,
    val mList: List<Store>
) : ArrayAdapter<Store>(mContext, resId, mList) {
    //14-1
    val inf = LayoutInflater.from(mContext)

    //14-2
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent)
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!
        return row
    }

}