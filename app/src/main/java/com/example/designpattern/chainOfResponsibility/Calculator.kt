package com.example.designpattern.chainOfResponsibility

import android.util.Log

abstract class Calculator {
    private var nextCalculator : Calculator? = null

    fun setNextCalculator(nextCalculator : Calculator){
        this.nextCalculator = nextCalculator
    }

    fun process(request : Request) : Boolean{
        return if(operator(request)){
            true
        }else{
            nextCalculator?.process(request) ?: false
        }
    }

    protected abstract fun operator(request : Request) : Boolean
}