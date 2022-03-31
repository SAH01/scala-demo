package com.atguigu.chapter03
object TestDataType {
  def main(args: Array[String]): Unit = {

    // 正确
    var n1: Byte = 127
    var n2: Byte = -128

    // 错误
    //    var n3:Byte = 128
    //    var n4:Byte = -129

    // Scala的整型，默认为Int型，声明Long型，然后加”i“ 或者 ”L“
    var n5 = 10
    println(n5)

    var n6 = 98989898989898989L
    println(n6)

    var n7 = 2.43434309898f
    var n8 = 2.4343662343223
    println(n7)
    println(n8)

    var God = new God()
    God = null

//    var n1 : Int = null //错误
    //println("n1:" + n1)
  }

  class God {
  }

}
