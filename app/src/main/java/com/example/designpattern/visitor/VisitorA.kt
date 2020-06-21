package com.example.designpattern.visitor

import android.util.Log

class VisitorA : Visitor{

    private var ageSum = 0

    override fun visit(visitable: Visitable) {
        if(visitable is VisitableA){
            ageSum += visitable.getAge()
        }else{
            Log.e("Visitor Pattern ", "VisitableA가 아닙니다.")
        }
    }

    fun getAgeSum() : Int{
        return ageSum
    }
}