package com.example.designpattern.composite

class Folder(folderName : String) : Component(folderName) {
    private var children = mutableListOf<Component>()

    fun addComponent(component : Component) : Boolean{
        return children.add(component)
    }

    fun removeComponent(component: Component) : Boolean{
        return children.remove(component)
    }

    override fun getChildren(component: Component): Component {
        val index = children.indexOf(component)
        return children[index+1]
    }
}