package com.example.designpattern.factoryMethod.concrete

import android.util.Log
import com.example.designpattern.factoryMethod.framework.Item

class HpPotion : Item {
    override fun use() {
        Log.e("Factory Method ", "체력 회복")
    }
}