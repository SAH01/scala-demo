package com.atguigu.chapter05

import scala.beans.BeanProperty

class Person {
  var name: String = "bobo" //定义属性
  var age: Int = _ // _表示给属性一个默认值
  //Bean 属性（@BeanProperty）
  @BeanProperty var sex: String = "男"
  //val 修饰的属性不能赋默认值，必须显示指定
}
object Person {
  def main(args: Array[String]): Unit = {
    var person = new Person()
    println(person.name)
//    person.setSex("女")
    println(person.getSex())
    println(person.age)
  }
}