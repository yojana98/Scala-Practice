package oop


//class User(val name:String,var age:Int)

//var getter setter
//val getter X
//default X X


class User(private val name:String,age:Int){
  //constructor

  def printName: Unit ={
    println(name)
  }

  def printAge: Unit ={
    println(age)
  }



}


object Classes {

  def main(args: Array[String]): Unit = {
    var user = new User("Yojana",24)

//    println(user.name)
println(user.printName)
    println(user.printAge)

//    user.name="Ekata"
//    println(user.name)


  }
}
