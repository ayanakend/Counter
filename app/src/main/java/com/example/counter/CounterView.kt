package com.example.counter

interface CounterView {
    fun showNewCount(count:Int)

    fun showToast(msg:String)

    fun textColor(color:Int)
}