package com.atguigu.function

object Recursion {
  def main(args: Array[String]): Unit = {
    // 阶乘
    // 递归算法
    // 1) 方法调用自身
    // 2) 方法必须要有跳出的逻辑
    // 3) 方法调用自身时，传递的参数应该有规律
    // 4) scala 中的递归必须声明函数返回值类型
    println("递归 ："+test(5))
    println("尾递归："+tailFact(5))
  }
  //
  def test(i : Int) : Int = {
    if (i == 1) {
      1     //退出基准
    } else {
      i * test(i - 1)
    }
  }

  //尾递归调用
  def tailFact(n:Int ):Int = {
    def loop(n: Int, currRes: Int): Int = {
      if (n == 0) {
        return currRes
      }
      loop(n - 1, currRes * n)
    }
    loop(n, 1)
  }

}
