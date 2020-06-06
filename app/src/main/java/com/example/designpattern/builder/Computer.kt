package com.example.designpattern.builder

class Computer(var cpu : String, var ram : String, var storage : String){
    override fun toString(): String {
        return "$cpu, $ram, $storage"
    }
}