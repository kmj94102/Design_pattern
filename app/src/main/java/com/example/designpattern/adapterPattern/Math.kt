package com.example.designpattern.adapterPattern

class Math {
    companion object{
        // 두배
        fun twoTime(num : Double) : Double{return  num * 2}
        // 절반
        fun half(num : Double) : Double{return  num / 2}
        // 두배
        fun doubled(d : Double) : Double{return  d * 2}
    }
}