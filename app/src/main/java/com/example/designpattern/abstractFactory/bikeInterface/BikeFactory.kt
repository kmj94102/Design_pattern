package com.example.designpattern.abstractFactory.bikeInterface

interface BikeFactory{
    fun createBody() : Body
    fun createWheel() : Wheel
}