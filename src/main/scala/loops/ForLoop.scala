package loops

object ForLoop {

  def main(args: Array[String]): Unit = {


    for (i <- 1 to 5){
      println("value of i "+i)
    }

    for (j <- 1.to(5)){
      println("value of j "+j)
    }

    for (k <- 1 until 5){
      println("value of k "+k)
    }

    for (l <- 1 to 5; m <- 1 to 3){
      println("value of l "+l+" value of m "+m)
    }

    val lst = List(1,2,3,4,4,5,6,6,8,7,2,8,5,9,9,543,9,9,9,4533,4,45,4,3,3)

    for ( i <- lst; if i < 6){
      println("Filters "+i)
    }


    val result = for {i <- lst; if i < 6} yield {
      i*i
    }

    println(result)


  }

}
