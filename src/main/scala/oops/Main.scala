package oops

object Main {

  def main(args: Array[String]): Unit =
  {

    val Person1=new Person(24,"test")
    val Person2=new Person(25,"test")


    if ((Person1.Name).equals(Person2.Name))
    {
      if((Person1.Age)equals(Person2.Age))
      {
        println("true")
      }
      else
      {
        println("true")
      }

    }
    else if ((Person2.Name.length()) equals (Person1.Name.length()))
    {
      println("true")
    }
    else
    {
      println("false")
    }

  }

}