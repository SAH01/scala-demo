package com.atguigu.break

object TestBreak {
  import scala.util.control.Breaks
  def main(args: Array[String]): Unit = {
    Breaks.breakable(
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) Breaks.break()
      }
    )
    println("正常结束循环")
  }
}
