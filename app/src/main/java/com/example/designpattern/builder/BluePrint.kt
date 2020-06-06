package com.example.designpattern.builder

abstract class BluePrint {
    abstract fun setCpu()
    abstract fun setRam()
    abstract fun setStorage()
    abstract fun getComputer() : Computer
}