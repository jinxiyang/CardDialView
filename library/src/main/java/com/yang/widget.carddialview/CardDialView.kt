package com.yang.widget.carddialview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.ViewGroup

class CardDialView : ViewGroup {
    private var debug = true

    private var spaceLeft: Int = 0
    private var space: Int = 0

    private var mCardProvider: CardProvider? = null

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        initCardDial(context)
    }

    private fun initCardDial(context: Context) {
        log("initParams")
    }


    override fun canScrollHorizontally(direction: Int): Boolean {
        return super.canScrollHorizontally(direction)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

    }

    private fun log(log: String){
        if (debug){
            Log.i(TAG, log)
        }
    }

    fun setCardProvider(cardProvider: CardProvider?){
        mCardProvider = cardProvider
        requestLayout()
    }

    fun getCardProvider(): CardProvider? = mCardProvider

    fun notifyItemChanged(){
        //TODO
        invalidate()
    }

    companion object{
        const val TAG = "CardDialView"
    }

}