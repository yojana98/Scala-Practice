package oop

//class Polygon {
//
//  def area: Double = 0.0
//
//}
//
//object  Polygon{
//  def main(args: Array[String]): Unit = {
//
//    var poly = new Polygon
////    printArea(poly)
//
//    var rect = new Rectangle(10,20)
////    printArea(rect)
//
//    var tri = new Triangle(10,20)
//    printArea(tri)
//
//    def printArea(p:Polygon): Unit ={
//      println(p.area)
//    }
//  }
//}


//abstract


abstract class Polygon {

  def area: Double

}

object  Polygon{
  def main(args: Array[String]): Unit = {

    var rect = new Rectangle(10,20)
    //printArea(rect)

    var tri = new Triangle(10,20)
    printArea(tri)

    def printArea(p:Polygon): Unit ={
      println(p.area)
    }
  }
}