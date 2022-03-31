package com.atguigu.chapter04

object ControlAbstraction {
  def main(args: Array[String]): Unit = {
    //1. 传值参数(传递计算后的值)
    def f0(a:Int):Unit = {
      println("a:" + a)
      println("a:"+a)
    }
    f0(23)
    def f1():Int={
      println("这是一个代码块！f1()")
      12
    }
    f0(f1())

    //2. 传名参数(传递代码块) a : =>Int 代码块的返回值是Int类型的
    println("```````````````````````````")
    def f2(a : =>Int):Int={
      println("a:"+a)
      println("a:"+a)
      1
    }
    f2(f1())
  }
}
