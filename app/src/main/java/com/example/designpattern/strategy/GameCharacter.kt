package com.example.designpattern.strategy

import android.util.Log

class GameCharacter{
    // 접근 점
    private var weapon : Weapon
    init {
        weapon = object : Weapon{
            override fun attack(): String {
                Log.e("Strategy ","맨손 공격")
                return "맨손 공격"
            }
        }
    }

    //교환 가능
    fun setWeapon(weapon: Weapon){
        this.weapon = weapon
    }

    fun attack() : String{
        // 델리게이트
        return weapon.attack()
    }
}