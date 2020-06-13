package com.example.designpattern.bridge

class PrintMorseCode(private val function: MorseCodeFun) : MorseCode(function) {

    fun a() : PrintMorseCode{
        dot()
        dash()
        space()
        return this
    }

    fun b(){
        dash()
        dot()
        dot()
        dot()
        space()
    }

    fun c() : PrintMorseCode{
        dash()
        dot()
        dash()
        dot()
        space()
        return this
    }

    fun d() : PrintMorseCode{
        dash()
        dot()
        dot()
        space()
        return this
    }

    fun e() : PrintMorseCode{
        dot()
        space()
        return this
    }

    fun f() : PrintMorseCode{
        dot()
        dot()
        dash()
        dot()
        space()
        return this
    }

    fun g() : PrintMorseCode{
        dash()
        dash()
        dot()
        space()
        return this
    }

    fun h() : PrintMorseCode{
        dot()
        dot()
        dot()
        dot()
        space()
        return this
    }

    fun i() : PrintMorseCode{
        dot()
        dot()
        space()
        return this
    }

    fun j() : PrintMorseCode{
        dot()
        dash()
        dash()
        dash()
        space()
        return this
    }

    fun k() : PrintMorseCode{
        dash()
        dot()
        dash()
        space()
        return this
    }

    fun l() : PrintMorseCode{
        dot()
        dash()
        dash()
        dash()
        space()
        return this
    }

    fun m() : PrintMorseCode{
        dash()
        dash()
        space()
        return this
    }

    fun n() : PrintMorseCode{
        dash()
        dot()
        space()
        return this
    }

    fun o() : PrintMorseCode{
        dash()
        dash()
        dash()
        space()
        return this
    }

    fun p() : PrintMorseCode{
        dot()
        dash()
        dash()
        dot()
        space()
        return this
    }

    fun q() : PrintMorseCode{
        dash()
        dash()
        dot()
        dash()
        space()
        return this
    }

    fun r() : PrintMorseCode{
        dot()
        dash()
        dot()
        space()
        return this
    }

    fun s() : PrintMorseCode{
        dot()
        dot()
        dot()
        space()
        return this
    }

    fun t() : PrintMorseCode{
        dash()
        space()
        return this
    }

    fun u() : PrintMorseCode{
        dot()
        dot()
        dash()
        space()
        return this
    }

    fun v() : PrintMorseCode{
        dot()
        dot()
        dot()
        dash()
        space()
        return this
    }

    fun w() : PrintMorseCode{
        dot()
        dash()
        dash()
        space()
        return this
    }

    fun x() : PrintMorseCode{
        dash()
        dot()
        dot()
        dash()
        space()
        return this
    }

    fun y() : PrintMorseCode{
        dash()
        dot()
        dash()
        dash()
        space()
        return this
    }

    fun z() : PrintMorseCode{
        dash()
        dash()
        dot()
        dot()
        return this
    }

    fun tab() : PrintMorseCode{
        dash()
        dash()
        dash()
        return this
    }

    fun name(name : String) : PrintMorseCode{
        println(name)
        return this
    }
}