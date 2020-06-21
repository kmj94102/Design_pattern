package com.example.designpattern.chainOfResponsibility

class Armor(var def : Int) : Defense{

    private var nextDefense : Defense? = null

    override fun defense(attack: Attack) {
        // Point!
        process(attack)

        nextDefense?.defense(attack)
    }

    fun process(attack: Attack){
        attack.amount = attack.amount - def
    }

    fun setNextDefense(nextDefense: Defense){
        this.nextDefense = nextDefense
    }
}