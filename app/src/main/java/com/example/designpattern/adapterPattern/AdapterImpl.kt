package com.example.designpattern.adapterPattern

class AdapterImpl : Adapter {
    override fun twiceOf(f: Float): Float {
        return Math.twoTime(f.toDouble()).toFloat()
    }

    override fun halfOf(f: Float): Float {
        return Math.half(f.toDouble()).toFloat()
    }
}