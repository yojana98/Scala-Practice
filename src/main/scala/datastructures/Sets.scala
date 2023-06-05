package datastructures

object Sets {

  val myset: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 9)
  val myset2: Set[Int] = Set(4, 2, 11, 12, 13, 14, 15, 16, 17)

  def main(args: Array[String]): Unit = {

    println(myset + 10)
    println(myset(8))
    println(myset.head)
    println(myset.tail)
    println(myset.isEmpty)

    println(myset ++ myset2)
    println(myset.&(myset2))
    println(myset.intersect(myset2))

    println(myset.min)
    println(myset.max)

    myset.foreach(println)

    for (i <- myset) {
      println(i)
    }


  }
}
