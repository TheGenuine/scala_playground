package de.reneruck.problem2

object Main {
lazy val fibs: Stream[BigInt] = BigInt(0) #::BigInt(1) #::fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  def main(args: Array[String]): Unit = {
    var sum:BigInt = 0
    for(i <- fibs take 100 if i < 4000000 && i%2==0) {println(i);sum += i}
    println("---------")
    println(sum)
  }
}