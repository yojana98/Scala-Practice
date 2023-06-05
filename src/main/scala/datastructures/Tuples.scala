package datastructures

object Tuples {

  val mytuple = (1,2,"Hello",true) //immutable, max 20 elements can be added

  val mytuple2 = new Tuple2(1,2) // 2 signifies 2 elements

  val mytuple3 = new Tuple3(1,2,"hello")

  val mytuple4 = new Tuple3(1,"hello",(4,5))

  def main(args: Array[String]): Unit = {

    println(mytuple)

    println(mytuple._2)

    mytuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "Tom" -> true)
    println(1 -> "Yojana")

    println(mytuple4._3._2)

  }
}
