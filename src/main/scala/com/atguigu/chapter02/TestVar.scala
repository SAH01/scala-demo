package com.atguigu.chapter1

object TestVar {
  def main(args: Array[String]): Unit = {
    var age = 22
    age = 29
    //    age = "hh"  //报错

    var n1 = 1 //可变
    n1 = 2

    val n2 = 2 //不可变
    //n2 = 3

    //p1 是var修饰的，p1的属性可以变，p1本身也可以变
    var p1 = new Person()
    p1.name = "varp1"
    p1 = null

    val p2 = new Person()
    p2.name = "valp2"
    //    p2 = null //报错
  }

  class Person {
    var name: String = "who"
  }
}
