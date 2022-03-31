package com.atguigu.function

object HighFunction {
  def main(args: Array[String]): Unit = {
    /*    val fun = (x: Int, y: String, z: Char) => {
        if (x==0 && y=="" && z=='0'){
          true
        }else{
          false
        }
    }
    println(fun(0,"",'1'))*/

    /*
      练习 2： 定义一个函数 func，它接收一个 Int 类型的参数，返回一个函数（记作 f1）。
      它返回的函数 f1，接收一个 String 类型的参数，同样返回一个函数（记作 f2）。函数 f2 接
      收一个 Char 类型的参数，返回一个 Boolean 的值。
      要求调用函数 func(0) (“”) (‘0’)得到返回值为 false，其它情况均返回 true。
     */
    def func(x: Int) = {
      def f1(y: String) = {
        println("我是f1！")

        def f2(z: Char): Boolean = {
          println("我是f2！")
          if (x == 0 && y == "" && z == '0') false else true
        }
        f2 _
      }

      f1 _
    }

//    func(1)("")('1')
  }

  println("```````````````````````````")

  def f1() = {
    var a: Int = 10

    def f2(b: Int) = {
      a + b
    }

    f2 _
  }

  // 在调用时，f1 函数执行完毕后，局部变量 a 应该随着栈空间释放掉
  val f = f1()
  // 但是在此处，变量 a 其实并没有释放，而是包含在了 f2 函数的内部，形成了闭合的效果
  println(f(3))
  println(f1()(3))

  //闭包
  /*
    addByFour函数：
    内部定义一个局部变量a 固定值是4
    函数的返回值是一个嵌套函数，完成a+b的操作，当外部调用时，addByFour()(2)只需要控制第二个形参的数值
    而第一个加数永远是4，相当于固定了一个参数
   */
  def addByFour(): Int => Int = {
    val a = 4
    def addB(b: Int): Int = {
      a + b
    }

    addB
  }
  println("结果是：" + addByFour()(3)) //4+3
  //简化
  def addByA(a:Int ):Int=>Int = a+ _
  //先指定a的值
  val f_a3=addByA(3)
  //再指定另一个加数的值
  println(f_a3(13))

  //函数柯里化：把一个参数列表的多个参数，变成多个参数列表 也就是fun(a,b,c) -> fun(a)(b)(c) 分层函数调用
  def addCurry(a : Int)(b:Int):Int ={
    a+b
  }
  println("柯里化："+addCurry(34)(23))
}
