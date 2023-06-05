package misc

object HigherOrderMethods {

  val lst = List(1,2,3)

  val lst2 = List("Yojana","Ameya","Ekata")

  val lst3 = List(List(1,2,3),List(4,5,6),List(7,8,9))

  def main(args: Array[String]): Unit = {


    println(lst.map( _ * 2))

    println(lst.map(x => x * 2))
//    println(mymap.mapValues( x=> "hi" + x))

    println(lst2.map(_.toUpperCase()))

    println(lst3.flatten)
    println(lst.flatMap(x => List(x,2)))

    println(lst.filter(x => x%2==0))



  }
}
