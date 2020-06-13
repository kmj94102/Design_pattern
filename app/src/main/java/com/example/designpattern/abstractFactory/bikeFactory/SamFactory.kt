package com.example.designpattern.abstractFactory.bikeFactory

import com.example.designpattern.abstractFactory.bikeInterface.BikeFactory
import com.example.designpattern.abstractFactory.bikeInterface.Body
import com.example.designpattern.abstractFactory.bikeInterface.Wheel

class SamFactory : BikeFactory {
    override fun createBody(): Body {
        return SamBody()
    }

    override fun createWheel(): Wheel {
        return SamWheel()
    }

}