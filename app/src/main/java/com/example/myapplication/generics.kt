package com.example.myapplication

class Container<T>(var data : T){
    fun setValue(value:T){
        data = value

    }
    fun getValue(){
        println(data)
    }
}
fun add(vararg nums:Int):Int{
    var sum = 0
    for (i in nums){
        sum += i
    }
    return sum
}
fun main(){
    val iContainer = Container<Int>(3)
    iContainer.getValue()
    val sContainer = Container("Hello")
    sContainer.getValue()

    println(add(1,2,3,4,5))
}
