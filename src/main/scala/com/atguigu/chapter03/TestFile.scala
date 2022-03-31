package com.atguigu.chapter03

import java.io.{File, PrintWriter}
import scala.io.Source
object TestFile {
  def main(args: Array[String]): Unit = {
    //1.文件中读数据
    Source.fromFile("src/main/resources/output.txt").foreach(print)
    //2.将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("!!!")
    writer.close()

    def sayOk : Unit = {// unit 表示没有返回值，即 void
    }
    println(sayOk)
  }
}
