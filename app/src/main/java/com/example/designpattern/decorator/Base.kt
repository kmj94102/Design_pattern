package com.example.designpattern.decorator

// ConcreteComponent : 컴포넌트의 실질적인 인스턴스의 부분이며, 책임의 주체
class Base : IBeverage {
    override fun getTotalPrice(): Int {
        return 0
    }
}