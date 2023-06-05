package functions

object Closures {

  // closures uses one or more variables declared outside functions

  var i = 10; //free variable, impure closure
  val j = 22; //pure closure, as value wont change

  val add = (x: Int) => {
    i = x + i
    i
  }

  def main(args: Array[String]): Unit = {
    i = 99 //most recent state
    println(add(20))
    println(i)

  }
}
