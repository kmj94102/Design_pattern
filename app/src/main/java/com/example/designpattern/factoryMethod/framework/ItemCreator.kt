package com.example.designpattern.factoryMethod.framework

abstract class ItemCreator {
    fun create() : Item{
        var item = Item()

        // step1
        requestItemsInfo()
        // step2
        item = createItem()
        // step3
        createItemLog()

        return item
    }

    // step1 : 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다.
    protected abstract fun requestItemsInfo()
    // step2 : 아이템을 생성 후 아이템 복제 등의 불법을 방자힉 위해 데이터베이스에 아이템 생성 정보를 남깁니다.
    protected abstract fun createItemLog()
    // step3 : 아이템을 생성하는 알고리즘
    protected abstract fun createItem() : Item
}