package functions

object HigherOrderFunctions {

  // higher order functions meaning ->> pass functions as arguments and return functions as results

  def math(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)


  def main(args: Array[String]): Unit = {


    val result = math(20, 30, 40, (x, y) => x + y)
    println(result)

    var res = math(20, 30, 40, (x, y) => x min y)
    println(res)


    res = math(20, 30, 80, _ + _)
    println(res)


    res = math(20, 30, 40, _ min _)
    println(res)

  }

}
