package programs

import scala.io.StdIn

object fibonacci {

  def main(args: Array[String]): Unit = {

//    n ==> 5
//
//    0,1,1,2,3
//
//    n1 = 0
//    n2 = 1
//    n3 = n1+n2 = 1
//
//    n1 = n2  1
//    n2 = n3 1
//    n3 = n1+n2 2
//
//    n1 = n2  1
//    n2 = n3  2
//    n3 = n1+n2 3


    println("enter first number")
    var n1:Int = StdIn.readInt()

    println("enter second number")
    var n2:Int = StdIn.readInt()

    println("Fibonacci series upto?")
    var n:Int = StdIn.readInt()

    var n3:Int = 0

    for( i <- 1 to n-2){
      n3 = n1 + n2
      println(n3)
      n1 = n2
      n2 = n3
    }






  }
}
