package loops

object WhileLoop {

  def main(args: Array[String]): Unit = {

    var x = 0

    while (x < 10 ){
      println("x= "+x)
      x+=1
      //x++
    }


    var y = 0
    do {
      println("y= "+y)
      y+=1
    }while(y<10)
  }
}
