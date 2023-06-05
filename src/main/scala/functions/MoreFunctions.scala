package functions

object MoreFunctions {

  //default
  def add(x: Int = 55, y: Int = 12): Int = {
    return x + y
  }

  object Math {
    def +(x: Int = 55, y: Int = 12): Int = {
      return x + y
    }
  }


  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }


  def main(args: Array[String]): Unit = {

    println(add())
    println(add(34, 77))
    println(add(60))

    print(22, 55)

    println(Math.+(34, 77))
    println(Math + (34, 77)) //+ is function in scala, not an operator

    val a = 56 + 199

    //function is treated as first class citizens, meaning assigning function to a variable

    //anonymous functions
    var add2 = (x: Int, y: Int) => x + y
    println(add2(10, 20))


  }

}
