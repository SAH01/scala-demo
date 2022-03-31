package com.atguigu.chapter03

import scala.io.StdIn

/**
  * Scala 中 if else 表达式其实是有返回值的，具体返回值取决于满足条件的
  * 代码体的最后一行内容。
  */
object TestIfElse {
  def main(args: Array[String]): Unit = {
    println("input age")
    var age = StdIn.readInt()
    val res : String = if (age >12 && age< 18){
      "少年"
    }else {
      if(age>=18 && age<50){
        "中年"
      }else{
        "老年"
      }
    }
    println("result:   "+res)
  }
}