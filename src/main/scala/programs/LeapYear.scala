package programs

import scala.io.StdIn

object LeapYear {

  def main(args: Array[String]): Unit = {
    println("Enter a number")
    var year: Int = StdIn.readInt

    if (year % 400 == 0) println("Leap Year")
    else if (year % 4 == 0 && year % 100 !=0) println("Leap Year")
    else println("Not a Leap Year")
  }


}
