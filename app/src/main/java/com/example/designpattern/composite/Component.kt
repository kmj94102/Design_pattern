package com.example.designpattern.composite

abstract class Component(var name : String) {
    abstract fun getChildren(component: Component) : Component
}