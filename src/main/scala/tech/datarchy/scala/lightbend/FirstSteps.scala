package tech.datarchy.scala.lightbend

object FirstSteps {
  def main(args: Array[String]): Unit = {
    println("""************************** Immutable values **************************""")
    val message = "Hello, world!"

    println("""************************** mutable variables **************************""")
    var message2 = "Hello, world!"

    println("""************************** Lightweight language : **************************""")
    val message3 = if ("Scala" startsWith "S") {
      val scala = "Scala"
      val is = " Is"
      val lightweight = " Lightweight"
      scala + is + lightweight
    } else "This is not possible"
  }
}
