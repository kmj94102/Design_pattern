package com.example.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.designpattern.abstractFactory.bikeFactory.SamFactory
import com.example.designpattern.abstractFactory.concreate.LinuxGuiFac
import com.example.designpattern.abstractFactory.concreate.MacGuiFac
import com.example.designpattern.adapterPattern.AdapterImpl
import com.example.designpattern.bridge.DefaultMCF
import com.example.designpattern.bridge.PrintMorseCode
import com.example.designpattern.builder.ComputerBuilder
import com.example.designpattern.builder.ComputerFactory
import com.example.designpattern.builder.LgGramBluePrint
import com.example.designpattern.composite.Component
import com.example.designpattern.composite.File
import com.example.designpattern.composite.Folder
import com.example.designpattern.decorator.Base
import com.example.designpattern.decorator.Espresso
import com.example.designpattern.decorator.IBeverage
import com.example.designpattern.decorator.Milk
import com.example.designpattern.factoryMethod.concrete.HpCreator
import com.example.designpattern.factoryMethod.framework.Item
import com.example.designpattern.factoryMethod.framework.ItemCreator
import com.example.designpattern.observer.MyButton
import com.example.designpattern.observer.MyButton2
import com.example.designpattern.singleton.SystemSpeaker
import com.example.designpattern.strategy.*
import com.example.designpattern.templateMethod.AbstGameConnectHelper
import com.example.designpattern.templateMethod.DefaultGameConnectHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

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
        // 싱글톤 패턴
        printSingleTons()
        // 빌더 패턴
        printBuilder()
        // 빌더 패턴2
        printBuilder2()
        // 추상 팩토리 패턴
        printAbstractFactory()
        // 추상 팩토리 패턴2
        printAbstractFactory2()
        // 브릿지 패턴
        printBridge()
        // 컴포짓 패턴
        printComposite()
        // 데코레이터 패턴
        printDecorator()
        // 옵저버 패턴
        printObserver()
//        val builder = AlertDialog.Builder(this)
//        val dialogView = layoutInflater.inflate(R.layout.dialog_custom, null)
//        builder.setView(dialogView).show()
    }

    private fun printStrategy() {
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

    private fun printTemplate() {
        helper = DefaultGameConnectHelper()
        helper.requestConnection("아이디 암호 등 접속 정보")
    }

    private fun printAdapter() {
        var adapter = AdapterImpl()
        Log.e("Adapter ", "100 * 2 = ${adapter.twiceOf(100f)}")
        Log.e("Adapter ", "100 / 2 = ${adapter.halfOf(100f)}")
    }

    private fun printFactory() {
        var creator: ItemCreator
        var item: Item

        creator = HpCreator()
        item = creator.create()
        item.use()

        creator = HpCreator()
        item = creator.create()
        item.use()
    }

    private fun printSingleTons() {
        Log.e("SingleTon ", "스피커1 생성")
        val speaker1 = SystemSpeaker
        Log.e("SingleTon ", "스피커2 생성")
        val speaker2 = SystemSpeaker

        Log.e("SingleTon", "스피커1의 볼륨 : ${speaker1.volume} / 스피커2의 볼륨 : ${speaker2.volume}")
        speaker1.volume = 5
        Log.e("SingleTon", "스피커1의 볼륨을 5로 설정")
        Log.e("SingleTon", "스피커1의 볼륨 : ${speaker1.volume} / 스피커2의 볼륨 : ${speaker2.volume}")
        speaker2.volume = 7
        Log.e("SingleTon", "스피커1의 볼륨을 7로 설정")
        Log.e("SingleTon", "스피커1의 볼륨 : ${speaker1.volume} / 스피커2의 볼륨 : ${speaker2.volume}")
    }

    private fun printBuilder() {
        val factory = ComputerFactory()
        factory.setBluePrint(LgGramBluePrint())
        factory.make()

        val computer = factory.getComputer()
        Log.e("BuilderPattern", computer.toString())
    }

    private fun printBuilder2() {
        val computer = ComputerBuilder
            .start()
            .setCpu("i7")
            .setRam("8g")
            .setStorage("256 ssd")
            .build()

        Log.e("BuilderPattern", computer.toString())
    }

    private fun printAbstractFactory() {
        val factory = SamFactory()
        val body = factory.createBody()
        val wheel = factory.createWheel()

        Log.e("AbstractFactory", "${body.javaClass} / ${wheel.javaClass}")
    }

    private fun printAbstractFactory2() {
        val linuxFac = LinuxGuiFac()
        val macFac = MacGuiFac()
        var button = linuxFac.createButton()
        var area = linuxFac.createTextArea()

        Log.e("AbstractFactory", "추상 팩터리 2번째")
        button.click()
        Log.e("LinuxTextArea", area.getText())

        button = macFac.createButton()
        area = macFac.createTextArea()

        button.click()
        Log.e("LinuxTextArea", area.getText())
    }

    private fun printBridge(){
        val code = PrintMorseCode(DefaultMCF())

        code.name("Bridge Pattern\ntest").t().e().s().t()
    }

    private fun printComposite(){
        val root = Folder("root")
        val home = Folder("home")
        val gram = Folder("gram")
        val music = Folder("music")
        val picture = Folder("picture")
        val doc = Folder("doc")
        val user = Folder("user")

        val track1 = File("track1")
        val track2 = File("track2")
        val pic1 = File("pic1")
        val doc1 = File("doc1")
        val java = File("java")

        root.addComponent(home)
        home.addComponent(gram)
        gram.addComponent(music)
        music.addComponent(track1)
        music.addComponent(track2)
        gram.addComponent(picture)
        picture.addComponent(pic1)
        gram.addComponent(doc)
        doc.addComponent(doc1)

        root.addComponent(user)
        user.addComponent(java)

        show(root)
    }

    private fun show(component: Component){
        Log.e("Composite ", "${component.javaClass.name} | ${component.name}")
        if(component is Folder){
            show(component.getChildren(component))
        }
    }

    private fun printDecorator(){
        var beverage : IBeverage = Base()
        /**
         * 커피 제조 방법
         *
         * 에스프레소 : 커피의 기본
         * 아메리카노 : 에스프레소 + 물
         * 카페라뗴 : 에스프레소 + 스팀 밀크
         *
         * 헤이즐넛 : 아메리카노 + 헤이즐넛 시럽
         * 카페모카 : 카페라떼 + 초콜릿
         * 캬라멜 마끼아또 : 카페라떼 + 캬라멜 시럽럽
        * */
        var done = false
        while (!done){
            Log.e("Decorator", "음료 현재 가격 ${beverage.getTotalPrice()}")
            Log.e("Decorator", "선택 : 1 - 샷 추가 / 2 - 우유 추가")
            var sc = 1
            when(sc){
                1 -> beverage = Espresso(beverage)
                2 -> beverage = Milk(beverage)
            }
            done= true
        }
        Log.e("Decorator", "음료 가격 : ${beverage.getTotalPrice()}")
    }

    private fun printObserver(){
        val button = MyButton()
        button.onClick()
        button.setOnclickListener(object : MyButton.OnClickListener{
            override fun onClick(myButton: MyButton) {
                Log.e("Observe Pattern ", "1번 $myButton is clicked")
            }
        })

        val button2 = MyButton2()
        button2.addObserver { o, arg ->
            Log.e("Observe Pattern ", "2번 $o is Clicked")
        }

        button2.onClick()
        button2.onClick()
    }
}
