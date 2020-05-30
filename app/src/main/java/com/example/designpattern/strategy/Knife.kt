package com.example.designpattern.strategy

import android.util.Log

class Knife : Weapon{
    override fun attack(): String {
        Log.e("Strategy ", "칼 공격")
        return "칼 공격"
    }
}