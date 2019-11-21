package com.yang.widget.carddialview

import android.content.Context
import android.view.View

/**
 * 卡片
 */
interface CardProvider {

    /**
     * 提供一个卡片
     */
    fun provide(context: Context): View

    /**
     * 绑定卡片
     */
    fun onBind(view: View, position: Int)

    /**
     * 卡片的数量
     */
    fun getCount(): Int
}