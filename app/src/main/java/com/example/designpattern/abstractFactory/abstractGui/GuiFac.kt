package com.example.designpattern.abstractFactory.abstractGui

interface GuiFac{
    fun createButton() : AbstractButton
    fun createTextArea() : AbstractTextArea
}