package datastructures

import scala.Array.concat

object Arrays {

  //1st way
  val myArray: Array[Int] = new Array[Int](4)

  val myArray2 = new Array[Int](5)

  val myArray3 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


  def main(args: Array[String]): Unit = {

    myArray(0) = 20
    myArray(1) = 50
    println(myArray)

    for (x <- myArray) {
      println(x)
    }

    for (x <- 0 to (myArray2.length - 1)) {
      println(myArray2(x))
    }

    println(myArray3.length)
  }

  println(concat(myArray, myArray3))

}
