package com.example.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.designpattern.adapterPattern.AdapterImpl
import com.example.designpattern.factoryMethod.concrete.HpCreator
import com.example.designpattern.factoryMethod.framework.Item
import com.example.designpattern.factoryMethod.framework.ItemCreator
import com.example.designpattern.strategy.*
import com.example.designpattern.templateMethod.AbstGameConnectHelper
import com.example.designpattern.templateMethod.DefaultGameConnectHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var helper: AbstGameConnectHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = null
        // 스트래티지 패턴
        printStrategy()
        // 탬플릿 메소드 패턴
        printTemplate()
        // 어뎁터 패턴
        printAdapter()
        // 팩토리 메소드 패턴
        printFactory()
    }

    private fun printStrategy(){
        var character = GameCharacter()
        Log.e("테스트 진행 ", "실행")
        character.attack()

        character.setWeapon(Knife())
        textView.append("\n${character.attack()}")

        character.setWeapon(Sword())
        textView.append("\n${character.attack()}")

        character.setWeapon(Ax())
        textView.append("\n${character.attack()}")
    }

    private fun printTemplate(){
        helper = DefaultGameConnectHelper()
        helper.requestConnection("아이디 암호 등 접속 정보")
    }

    private fun printAdapter(){
        var adapter = AdapterImpl()
        Log.e("Adapter ", "100 * 2 = ${adapter.twiceOf(100f)}")
        Log.e("Adapter ", "100 / 2 = ${adapter.halfOf(100f)}")
    }

    private fun printFactory(){
        var creator : ItemCreator
        var item : Item

        creator = HpCreator()
        item = creator.create()
        item.use()

        creator = HpCreator()
        item = creator.create()
        item.use()
    }
}
