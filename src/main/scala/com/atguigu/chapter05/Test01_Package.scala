//用嵌套风格定义包
package com{

  import com.atguigu.chapter05.Inner

  //在外层包里定义一个单例对象
  object Outer{
    var out:String = "out"
    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package atguigu{
    package chapter05{
      //内层中定义单例对象
      object Inner{
        val in : String ="in"
        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out="outer"
          println(Outer.out)
        }
      }
    }
  }
}