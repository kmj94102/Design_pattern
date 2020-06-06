package com.example.designpattern.singleton

import android.util.Log

object SystemSpeaker {
    var volume : Int = 1
    init {
        Log.e("SingleTon ", "스피커를 생성합니다.")
    }
}