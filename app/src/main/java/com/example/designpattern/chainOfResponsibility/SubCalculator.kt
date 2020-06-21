package com.example.designpattern.chainOfResponsibility

import android.util.Log

class SubCalculator : Calculator(){
    override fun operator(request: Request): Boolean {
        return if(request.operator == "-"){
            Log.e("ChainOfResponsibility ", "${request.a}, ${request.b}의 차 결과 : ${(request.a - request.b)}")
            true
        }else{
            false
        }
    }
}