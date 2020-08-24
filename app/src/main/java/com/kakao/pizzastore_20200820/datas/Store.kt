package com.kakao.pizzastore_20200820.datas

import java.io.Serializable

//10:피자가게목록(Serializable) -> 11:피자가게목록(store_list_item.xml)
class Store(
    val name: String,
    val logoUrl: String,
    val phoneNum: String
) : Serializable {

}