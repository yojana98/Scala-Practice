package programs

import scala.io.StdIn

object palindrome {

  def main(args: Array[String]): Unit = {

    //   racecar

    println("Enter a word")
    var word: String = StdIn.readLine()

    var l: Int = word.length
    var i = 0
    var j = l-1

    var flag = true

    while (i < j) {
      if (word.charAt(i) != word.charAt(j)) {
        flag = false
      }
      i += 1
      j -= 1
    }
    if (flag) {
      println("Given word is Palindrome")
    }
    else {
      println("Given word is not Palindrome")
    }

  }
}
