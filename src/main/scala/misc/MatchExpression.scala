package misc

object MatchExpression {

  def main(args: Array[String]): Unit = {

    val age = 18

    age match {
      case 20 => println(age)
      case 30 => println(age)
      case 40 => println(age)
      case 50 => println(age)
      case 60 => println(age)
      case 70 => println(age)
      case _ => println("default")

    }


    val x = "2"

    val res = x match {
      case "20" => age
      case "30" => age
      case _ => "Default string"
    }

    println(res)

    var i = 4
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }


  }

}
