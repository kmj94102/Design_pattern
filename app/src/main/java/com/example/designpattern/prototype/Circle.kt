package com.example.designpattern.prototype

class Circle(var x : Int, var y : Int, var z : Int) : Shape() {
    @Throws(CloneNotSupportedException::class)
    fun copy() : Circle{
        var circle = clone() as Circle
        circle.x++
        circle.y++
        circle.z++
        return circle
    }
}