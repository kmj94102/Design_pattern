package com.example.designpattern.decorator

// ConcreteDecorator 실질적인 장식 인스턴스 및 정의이며, 책임이 추가되는 부분입니다.
open class Espresso(base : IBeverage) : AbstAdding(base){
    companion object{
        protected var espressoCount : Int = 0

        // 에스프레소 추가 가격
        private fun getAddPrice() : Int{
            espressoCount += 1
            var addPrice = 100
            if(espressoCount > 1)
                addPrice = 70
            return addPrice
        }
    }

    override fun getTotalPrice(): Int {
        return super.getTotalPrice() + getAddPrice()
    }
}