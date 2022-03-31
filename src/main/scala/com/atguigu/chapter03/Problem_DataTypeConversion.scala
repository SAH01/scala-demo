package com.atguigu.chapter03
/*
byte：-128~127
128 : Int类型，占4个字节，32位
计算机中的整型数据都以补码的形式存储，正数的补码是其本身，负数的补码除符号位外取反+1
负数补码求原码，符号位为1不变，其余取反+1
128原码：0000 0000 0000 0000 0000 0000 1000 0000
128补码：0000 0000 0000 0000 0000 0000 1000 0000

截取补码最后一个字节：Byte
得到结果的新补码：1000 0000 表示最大的负数为-128
所以128结果溢出得-128
那么可以推出：如果溢出为130，那么得到结果为-126
 */
object Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    val n:Int =130
    val b:Byte=n.toByte
    println(b)
  }
}
