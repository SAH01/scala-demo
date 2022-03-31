package com.atguigu.chapter01

//定义一个类
class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

/*
  引入伴生对象Student
 */
object Student {
  val school: String = "atguigu"
  def main(args: Array[String]): Unit = {
    val alice =new Student("alice", 20)
    val bob=new Student("bob",19)
    alice.printInfo()
    bob.printInfo()
  }
}