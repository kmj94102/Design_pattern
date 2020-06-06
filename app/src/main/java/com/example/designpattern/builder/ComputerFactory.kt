package com.example.designpattern.builder

class ComputerFactory {
    private lateinit var print : BluePrint
    fun setBluePrint(print: BluePrint){
        this.print = print
    }

    fun make(){
        print.setRam()
        print.setCpu()
        print.setStorage()
    }

    fun getComputer() : Computer{
        return print.getComputer()
    }
}