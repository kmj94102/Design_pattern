package com.example.designpattern.chainOfResponsibility

import android.util.Log

class PlusCalculator : Calculator() {
    override fun operator(request: Request): Boolean {
        return if(request.operator == "+"){
            Log.e("ChainOfResponsibility ", "${request.a}, ${request.b}의 합 결과 : ${(request.a + request.b)}")
            true
        }else{
            false
        }
    }
}