package oop

//aux constructor

class User1(private val name:String,age:Int) {
  //  aux constructor

  def this(){

    this("Tom",32)
  }

  def this(name:String){
    this(name,32)
  }

}


  object Auxilaryconstructor {

    var user1 = new User1("Max",22)
    var user2 = new User1();
    var user3 =  new User1("Max");

}
