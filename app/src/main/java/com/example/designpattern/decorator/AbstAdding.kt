package com.example.designpattern.decorator

// Decorator : 컴포넌트와 장식을 동일시 해주는 역할
abstract class AbstAdding(private val base: IBeverage) : IBeverage{

    override fun getTotalPrice(): Int {
        return base.getTotalPrice()
    }

    protected fun getBase() : IBeverage{
        return base
    }
}