package de.reneruck.problem1

import scala.collection.mutable.ArrayBuffer

object Main {

  def main(args: Array[String]): Unit = {
	var sum:Int = 0
    for(i <- (1 to 999)) {
       if( i%5 == 0 | i%3 == 0 ){ sum += i}
    }
	println(sum)
  }
}