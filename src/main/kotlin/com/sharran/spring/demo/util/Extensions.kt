package com.sharran.spring.demo.util

fun Any?.log(){
    this?.let {
        println("LOG ===========> $this")
    }
}

fun Collection<Any>.log(){
    if (this.isEmpty()){
        println("LOG =========> Collection is Empty")
        return
    }
    this.forEach { println("LOG =========>$it") }
}