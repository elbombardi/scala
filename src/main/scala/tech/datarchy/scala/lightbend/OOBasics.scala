package tech.datarchy.scala.lightbend

object OOBasics {
  def main(args: Array[String]): Unit = {
    // The simplest class ------------------------------------
    class Hello
    val hello = new Hello
    println(hello.toString)

    // The primary constructor ------------------------------------
    class Hello2 {
      println("Hello2")
    }

    val hello2 = new Hello2

    // Class paramters ------------------------------------
    class Hello3(message: String) {
      println(message)
    }

    val hello3 = new Hello3("Hello3, world!")

    //Exercise : create a class with parameters ------------------------------------
    class Train1(number: Int) {
      println(number)
    }
    //val train1_1 = new Train1 ==> you cannot instanciate Train without the parameter
    val train1_2 = new Train1(2)

    //Additional constructors  ------------------------------------
    class Hello4(message: String) {
      def this() = this("Hello4 additional constructor")
      def this(number: Int) = this("Hello4 " * number)
      println(message)
    }
    val hello4 = new Hello4
    val hello4_5times = new Hello4(5)

    // Immutable fields  ------------------------------------
    class Hello5 {
      val message: String = "Hello5"
    }
    val hello5 = new Hello5
    println(hello5.message)

    // Mutable fields ------------------------------------
    class Hello6 {
      var message: String = "Hello6"
    }
    val hello6 = new Hello6
    hello6.message = "Hello6_updated"
    println(hello6.message)

    //  Promote class parameter to field by adding the keyword val ------------------------------------
    class Hello7(val message: String)
    val hello7 = new Hello7("Hello7")
    println(hello7.message)

    //Exercise : promote class paramters 1 ------------------------------------
    class Train2(val number: Int, val kind: String)
    val train2_1 = new Train2(2, "some kind")
    println("Train2 : number = %s, kind = %s".format(train2_1.number, train2_1.kind))

    //Exercise : promote class paramters 2 ------------------------------------
    class Time1(val hours: Int, val minutes: Int) {
      // TODO verify that hours is within 0-23
      // TODO verify that minutes is within 0-59
    }
    val time1 = new Time1(7, 55)
    println("time1.hours = %s, time1.minutes = %s ".format(time1.hours, time1.minutes))
    
    //Exercise Define a Field ------------------------------------
    class Time2(val hours: Int, val minutes : Int) {
      // TODO verify that hours is within 0-23
      // TODO verify that minutes is within 0-59
      val asMinutes : Int = hours * 60 + minutes
    }
    val time2 = new Time2(7,55)
    println(f"time2.hours = ${time2.hours}, time2.minutes = ${time2.minutes}, time2.asMinutes = ${time2.asMinutes}")
   
    //Methods  ------------------------------------
    def echo(message : String) : String = message
    println(f"""echo("something") = ${echo("something")}""")
    
    // Exercise define a Method --------------------------------------
    class Time3(val hours : Int, val minutes : Int) {
      // TODO verify that hours is within 0-23
      // TODO verify that minutes is within 0-59
      val asMinutes : Int = hours * 60 + minutes
      def -(time : Time3) : Int = {
        asMinutes - time.asMinutes
      }
      def minus(time : Time3) : Int = {
        this - time
      }
    }
    println(f"Diffrence beteen 07:55 and 08:00 is ${ (new Time3(7,55) - new Time3(8,0)) } minutes")
    println(f"Diffrence beteen 08:00 and 07:30 is ${ (new Time3(8,0) minus new Time3(7,30)) } minutes")

    
  }
}