package com.example.designpattern.decorator

class Milk(meterial: IBeverage) : AbstAdding(meterial){
    override fun getTotalPrice(): Int {
        return super.getTotalPrice() + 50
    }
}