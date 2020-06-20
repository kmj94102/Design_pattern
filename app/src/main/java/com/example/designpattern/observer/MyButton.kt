package com.example.designpattern.observer

import android.util.Log

class MyButton {

    private var onClickListener : OnClickListener? = null

    fun onClick(){
        // 이벤트 처리
        if (onClickListener == null){
            Log.e("Observe Pattern ", "리스너가 등록되지 않았습니다.")
        }
        onClickListener?.onClick(this)
    }
    interface OnClickListener{
        fun onClick(myButton: MyButton)
    }

    fun setOnclickListener(onClickListener: OnClickListener){
        this.onClickListener = onClickListener
    }
}