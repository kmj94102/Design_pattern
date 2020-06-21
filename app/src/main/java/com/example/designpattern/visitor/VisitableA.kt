package com.example.designpattern.visitor

class VisitableA : Visitable{
    private var age: Int = 0

    constructor()

    constructor(age: Int){
        this.age = age
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    fun setAge(age : Int){
        this.age = age
    }

    fun getAge() : Int{
        return age
    }

}