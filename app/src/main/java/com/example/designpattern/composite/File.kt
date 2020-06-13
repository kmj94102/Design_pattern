package com.example.designpattern.composite

class File(fileName : String) : Component(fileName) {
    lateinit var data : Any
    override fun getChildren(component: Component): Component {
        return this
    }
}