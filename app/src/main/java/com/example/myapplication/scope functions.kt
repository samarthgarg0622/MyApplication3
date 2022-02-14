package com.example.myapplication
class Person{
    lateinit var name :String
    var age:Int = 0
}

fun main(){
    var person : Person? = null
//    person.apply {
//        name = "Samarth"
//        age = 21
//    }
    var bio = person?.run {
        "$name is $age"
    }
    println(bio)
//    person.also {
//        it.age = 22
//    }
//    println(person.age)

    var x:String? = null
    var str = x?.let {
        println("hello")
        println(it.length)
        "world"
    }
    println(str)


}