package functions

object Currying {

  // technique to transform function which takes multiple argument to single argument

  //normal
  def add(x: Int, y: Int) = x + y


  //syntax1
  def add2(x: Int) = (y: Int) => x + y


  //syntax2
  def add3(x: Int)(y: Int) = x + y

  def main(args: Array[String]): Unit = {

    println(add(1, 2))
    println(add2(20)(10))

    val sum40 = add2(40) //partially applied
    println(sum40(80))

    println(add3(20)(66))

    val sum55 = add3(55) _

    println(sum55(44))

  }

}
