package com.example.designpattern.decorator

// Component : 컴포넌트의 역할은 실질적인 컴포넌트를 다루는 컨트롤하는 역할
interface IBeverage {
    // 총 가격
    fun getTotalPrice() : Int
}