package com.atguigu.chapter03

object TestSpecialType {
  def main(args: Array[String]): Unit = {
    def sayOk : Unit = {// unit 表示没有返回值，即 void
    }
    println(sayOk)
  }
//  def test() : Nothing={
//    throw new Exception()
//  }
//  test()
}