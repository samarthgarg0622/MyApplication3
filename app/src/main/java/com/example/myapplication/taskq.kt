package com.example.myapplication

fun solve(x:Int, y:Int, op:(Int,Int)->Int):Int{
    return op(x,y)
}
fun sum(x:Int,y:Int) = x+y

fun main() {
    println("hello world")
    val c:Calc = Calc()
    println(c.add(3,4))
    fun Calc.multiply(x:Int,y:Int):Int{
        return x*y
    }
    println(c.multiply(3,4))
    println(solve(3,4,::sum))

}
public class Calc(){
    inline fun add(x:Int, y:Int):Int{
        println("this is an inline function")
        return x+y
    }

}
