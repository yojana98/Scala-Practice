package loops

object IfElse {

  def main(args: Array[String]): Unit = {


    val x = 20
    val y = 30
    var res = ""

    if (x == 20 && y==30) {
      res = "x==20 && y==30"
    } else {
      res = "x!=20"
    }

    println(res)

    //if expression

    val res2 = if (x == 20) "x == 20" else "x!=20"
    println(res2)


  }
}
