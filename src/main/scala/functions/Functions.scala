package functions

object Functions {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y
    }

    def square(z: Int) = z * z
  }


  def subtract(x: Int, y: Int): Int = {
    x - y
  }

  def multiply(x: Int, y: Int): Int = x * y

  def divide(x: Int, y: Int) = x / y


  def main(args: Array[String]): Unit = {

    println(Math.add(4, 5))
    println(Math.square(4))
    println(Math square (4))
    println(Math square 4) //works for single argument

    println(multiply(6, 9))

  }

}
