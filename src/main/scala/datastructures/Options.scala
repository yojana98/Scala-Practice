package datastructures

object Options {
val lst = List(1,2,3)

//  val mymap = Map(801 -> "Yojana", 802 -> "Ameya", 803 -> "Ekata")

  val opt : Option[Int] = Some(1)


  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 6)) //None if no value matches
    println(lst.find(_ > 2).get)// returns Some(3)
    println(lst.find(_ > 6).getOrElse("does not exist"))

    //println(map.get(2)) Some()
    //println(map.get(2).get)
    //println(map.get(2).getOrElse("no name"))


    println(opt.isEmpty)
    println(opt.getOrElse("empty"))

  }

}
