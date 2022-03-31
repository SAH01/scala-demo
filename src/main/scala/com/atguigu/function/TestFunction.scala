package com.atguigu.function

object TestFunction {
  def main(args: Array[String]): Unit = {
    // （0）函数标准写法
    def f( s : String ): String = {
      return s + " jinlian"
    }
    println(f("Hello"))
    // 至简原则:能省则省
    //（1） return 可以省略,Scala 会使用函数体的最后一行代码作为返回值
    def f1( s : String ): String = {
      s + " jinlian"
    }
    println(f1("Hello"))
    //（2）如果函数体只有一行代码，可以省略花括号 类似数学上的f(x)=x+1
    def f2(s:String):String = s + " jinlian"
    //（3）返回值类型如果能够推断出来且省略了return，那么可以省略返回值类型的指定（:和返回值类型一起省略）
    def f3( s : String ) =
      {
       s + " jinlian"
      }
    println(f3("Hello3"))
    //（4）如果有 return，则不能省略返回值类型，必须指定。
    def f4() :String = {
      return "ximenqing4"
    }
    println(f4())
    //（5）如果函数明确声明 Unit，那么即使函数体中使用 return 关键字也不起作用
    def f5(): Unit = {
      return "dalang5"
    }
    println(f5())
    //（6）Scala 如果期望是无返回值类型,可以省略等号，将无返回值的函数称之为过程
    def f6() {
      "dalang6"
    }
    println(f6())
    //（7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7() = "dalang7"
    println(f7())
    println(f7)
    //（8）如果函数没有参数列表，那么小括号可以省略,调用时小括号必须省略
    def f8 = "dalang"
    //println(f8())
    println(f8)
    //（9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    def f9 = (x:String)=>{println(x)}
    def f10(f:String=>Unit) = {
      f("测试参数")
    }
    f10(f9)
//    println(f10((x:String)=>{println("wusong")}))
    //匿名函数 ：没有名字的函数，通过lambda表达式实现 (参数)=>{函数体}

    //f9((s:String)=>{println(s)})
    //（1）参数的类型可以省略，会根据形参进行自动的推导

    //f9((s)=>{println(s)})
    //（2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号。

    //f9(s =>{println(s)})
    //（3）匿名函数如果只有一行，则大括号也可以省略

    //f9(s =>println(s))
    //（4）如果参数只出现一次，则参数省略且后面参数可以用_代替

    //f9(println(_))
    // （5） 如果可以推断出，println是一个函数体，而不是调用语句，那么(_)可以省

    // f9(println)
    //反推导 f9((s:String)=>println(s))
    //加深大家理解

    //定义一个函数，接受一个函数类型的参数，该函数类型有两个参数

    def f11(fun:(Int,Int)=>Int):Int={

      fun(1,2)

    }
    //println(f11((x:Int,y:Int)=>{x + y}))

    //println(f11((x,y)=>x + y))

    println(f11(_ + _))
  }
}