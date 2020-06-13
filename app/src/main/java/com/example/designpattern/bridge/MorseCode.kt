package com.example.designpattern.bridge

import android.util.Log

open class MorseCode(private val function: MorseCodeFun) {

    fun dot(){
        function.dot()
    }

    fun dash(){
        function.dash()
    }

    fun space(){
        function.space()
    }

}