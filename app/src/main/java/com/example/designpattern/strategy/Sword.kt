package com.example.designpattern.strategy

import android.util.Log

class Sword : Weapon{
    override fun attack(): String {
        Log.e("Strategy ", "검 공격")
        return "검 공격"
    }
}