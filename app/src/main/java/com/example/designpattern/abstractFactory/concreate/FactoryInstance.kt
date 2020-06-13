package com.example.designpattern.abstractFactory.concreate

import android.util.Log
import com.example.designpattern.abstractFactory.abstractGui.AbstractButton
import com.example.designpattern.abstractFactory.abstractGui.AbstractTextArea
import com.example.designpattern.abstractFactory.abstractGui.GuiFac
class FactoryInstance {
    companion object{
        fun getGuiFac() : GuiFac?{
            when(0){
                0 -> return MacGuiFac()
                1 -> return LinuxGuiFac()
            }
            return null
        }
    }
}

class LinuxGuiFac : GuiFac {
    override fun createButton(): AbstractButton {
        return LinuxButton()
    }

    override fun createTextArea(): AbstractTextArea {
        return LinuxTextArea()
    }
}

class LinuxButton : AbstractButton {
    override fun click() {
        Log.e("LinuxButton", "리눅스 버튼 클릭됨")
    }
}

class LinuxTextArea : AbstractTextArea{
    override fun getText(): String {
        return "리눅스 텍스트 에어리어"
    }
}

class MacButton : AbstractButton {
    override fun click() {
        Log.e("MacButton", "맥 버튼 클릭됨")
    }
}

class MacGuiFac : GuiFac {
    override fun createButton(): AbstractButton {
        return MacButton()
    }

    override fun createTextArea(): AbstractTextArea {
        return MacTextArea()
    }
}

class MacTextArea : AbstractTextArea{
    override fun getText(): String {
        return "맥 텍스트 에어리어"
    }
}