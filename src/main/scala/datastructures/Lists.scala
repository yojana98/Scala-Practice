package datastructures

object Lists {

  val mylist: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val names: List[String] = List("Max", "Tom", "John")


  def main(args: Array[String]): Unit = {

    println(mylist)
    println(names)

    //    mylist(0) = 5

    println(0 :: mylist)

    println(1 :: 5 :: 9 :: Nil)
    println(names.head)
    println(names.tail)
    println(names.isEmpty)
    println(names.reverse)
    println(mylist.reverse)
    println(List.fill(5)(2))


    mylist.foreach(println)

    var sum = 0
    mylist.foreach(sum += _)
    println(sum)

    for (name <- names) {
      println(name)
    }

  }

}
