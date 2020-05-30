package com.example.designpattern.factoryMethod.concrete

import android.util.Log
import com.example.designpattern.factoryMethod.framework.Item
import com.example.designpattern.factoryMethod.framework.ItemCreator

class MpCreator : ItemCreator() {
    override fun requestItemsInfo() {
        Log.e("Factory Method ", "데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.")
    }

    override fun createItemLog() {
        Log.e("Factory Method ", "마력 회복 물약을 새로 생성했습니다. ${System.currentTimeMillis()}")
    }

    override fun createItem(): Item {
        Log.e("Factory Method ", "마력 회복 아이템 생성")
        return MpPotion()
    }

}