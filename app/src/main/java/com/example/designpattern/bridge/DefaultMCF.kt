package com.example.designpattern.bridge

class DefaultMCF : MorseCodeFun {
    override fun dot() {
        print(".")
    }

    override fun dash() {
        print("_")
    }

    override fun space() {
        print(" ")
    }
}