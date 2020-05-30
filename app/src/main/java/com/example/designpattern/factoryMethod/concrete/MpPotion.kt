package com.example.designpattern.factoryMethod.concrete

import android.util.Log
import com.example.designpattern.factoryMethod.framework.Item

class MpPotion : Item {
    override fun use() {
        Log.e("Factory Method ", "마력 회복")
    }
}