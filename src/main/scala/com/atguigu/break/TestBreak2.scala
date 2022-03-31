package com.atguigu.break
import scala.util.control.Breaks._
object TestBreak2 {
  def main(args: Array[String]): Unit = {
    breakable {
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) break
      }
    }
    println("正常结束循环")
  }
}