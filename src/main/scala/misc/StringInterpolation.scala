package misc

object StringInterpolation {

  def main(args: Array[String]): Unit = {
    val name = "Yojana"
    val age = 24

    // first way
    println(name + " is " + age + " years old")

    // second way
    println(s"$name is $age years old")

    // third way

    println(f"$name%s is $age%d years old")

    // fourth way
    println(s"Hello \nworld")

    //fifth way
    println(raw"Hello \nworld")

  }
}
