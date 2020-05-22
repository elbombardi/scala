package tech.datarchy.scala.lightbend

// Databricks notebook source
// MAGIC %md
// MAGIC #First Steps

// COMMAND ----------

object FirstSteps {
  def main(args: Array[String]): Unit = {
    // Immutable values
    val message = "Hello, world!"

    // mutable variables
    var message2 = "Hello, world!"

    // lightweight language :
    val message3 = if ("Scala" startsWith "S") {
      val scala = "Scala"
      val is = " Is"
      val lightweight = " Lightweight"
      scala + is + lightweight
    } else "This is not possible"
  }
}
