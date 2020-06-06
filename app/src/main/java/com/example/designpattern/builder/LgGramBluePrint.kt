package com.example.designpattern.builder

class LgGramBluePrint : BluePrint() {
    private var computer : Computer = Computer("default", "default", "default")
    override fun setCpu() {
        computer.cpu = "i7"
    }

    override fun setRam() {
        computer.ram = "8g"
    }

    override fun setStorage() {
        computer.storage = "256g ssd"
    }

    override fun getComputer() : Computer {
        return computer
    }
}