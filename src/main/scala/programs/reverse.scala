package programs

import scala.io.StdIn

object reverse {

  def main(args: Array[String]): Unit = {

//    12345 ==> 54321
//
//    res=0
//
//    12345%10 ==> 5 {rem}
//    0 * 10 + 5          ==> {res * 10 + rem}
//    res = 5
//    12345/10 ==> 1234 {loop}
//
//
//    1234%10 ==> 4
//    5 * 10 + 4 = 54
//    1234/10 ==> 123
//
//
//    123%10 ==> 3
//    54 * 10 + 3  ==> 543
//    12/10

    //read input from scala
    println("Enter a number")
    var n : Int = StdIn.readInt()

    //loop through number until 0
    var res: Int = 0
    var rem: Int = 0
    var num = n
    while (n > 0){
        rem = n%10
        res = res * 10 + rem
        n = n/10
    }

    println(s"reverse of $num is $res")


    // create res variable



  }
}
