package de.reneruck.problem3

import scala.collection.mutable.ArrayBuffer

object Main {
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i => ps.takeWhile { j => j * j <= i }.forall { k => i % k > 0 });
  def main(args: Array[String]): Unit = {
	val input:Long = new Long(600851475143)
	for(i <- ps take 1000) {
	  println(i)
	}
  }

}