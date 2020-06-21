package com.example.designpattern.visitor

interface Visitable{
    fun accept(visitor: Visitor)
}