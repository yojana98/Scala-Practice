package variables

object ValVar extends App {

  var a: Int = 20
//  print(a)
  a =a +20
  println(a)

//  var b : Int;
  val c: Int = 3
//  c=2
  println(c)

  val x= true
  var p = 12.33f

  println(x)
  println(p)


  val q = {val n: Int = 100; val m: Int = 200; n+m }
  println(q)


  val ii = {
    val n: Int = 100
    val m: Int = 200
    n+m
  }
  println(ii)


  lazy val tt = 33
  println(tt)


}
