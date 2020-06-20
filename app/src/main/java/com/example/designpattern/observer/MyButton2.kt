package com.example.designpattern.observer

import java.util.*

class MyButton2 : Observable() {
    fun onClick(){
        setChanged()
        notifyObservers()
    }
}