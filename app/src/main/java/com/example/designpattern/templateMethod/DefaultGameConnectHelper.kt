package com.example.designpattern.templateMethod

import android.util.Log

class DefaultGameConnectHelper : AbstGameConnectHelper(){
    override fun doSecurity(string: String): String {
        Log.e("Temple Method ", "디코드")
        return string
    }

    override fun authentication(id: String, password: String): Boolean {
        Log.e("Temple Method ", "아이디/암호 확인 과정")
        return true
    }

    override fun authorization(userName: String): Int {
        Log.e("Temple Method ", "권한 확인")
        return 0
    }

    override fun connection(info: String): String {
        Log.e("Temple Method ", "마지막 접속 단계!")
        return info
    }

}