package com.example.myapplication

import kotlin.properties.Delegates

class StudentHeavy{
    init {
        println("Student Heavy Initialised")
    }
}

class Student {
    val heavy by lazy {
        StudentHeavy()
    }
//    val heavy = StudentHeavy()
}
val pi by lazy{
    3.14
}
var marks: Int by Delegates.observable(50) {
        prop, old, new ->
        println("$old->$new")
}
var KmsDriven : Int by Delegates.vetoable(1000){
    prop,old,new ->
    new>old
}
fun main(){
    val s = Student()
    s.heavy
    println(pi)
    marks  = 60
    KmsDriven = 900
    println(KmsDriven)
    KmsDriven = 1100
    println(KmsDriven)
}

