package com.example.designpattern.strategy

import android.util.Log

class Ax : Weapon{
    override fun attack() : String {
        Log.e("Strategy : ", "도끼 공격")
        return "도끼 공격"
    }
}