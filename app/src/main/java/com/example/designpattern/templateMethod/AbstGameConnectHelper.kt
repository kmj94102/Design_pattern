package com.example.designpattern.templateMethod

import android.util.Log

abstract class AbstGameConnectHelper {
    protected abstract fun doSecurity(string : String) : String
    protected abstract fun authentication(id : String, password : String) : Boolean
    protected abstract fun authorization(userName : String) : Int
    protected abstract fun connection(info : String) : String

    // 템플릿 메소드
    fun requestConnection(encodedInfo : String) : String {
        // 보안 작업 > 암호화 된 문자열을 복호화
        var decodedInfo = doSecurity(encodedInfo)
        // 반환된 것을 가지고 아이디, 함호를 할당한다.
        val id = "aaa"
        val password = "bbb"
        // 인증 과정
        if(!authentication(id, password)){
            throw Error("아이디 암호 불일치")
        }

        var userName = "userName"
        var i = authorization(userName)

        when(i){
            0 -> Log.e("Template Method ", "게임 매니저")
            1 -> Log.e("Template Method ", "유료 회원")
            2 -> Log.e("Template Method ", "무료 회원")
            3 -> Log.e("Template Method ", "권한 없음")
            else -> Log.e("Template Method ", "기타 회원")
        }

        return connection(decodedInfo)
    }
}