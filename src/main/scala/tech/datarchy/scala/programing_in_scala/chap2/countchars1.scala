package tech.datarchy.scala.programing_in_scala.chap2

import scala.io.Source

object countchars1 {

  def main(args: Array[String]): Unit = {
    if (args.length < 1) {
      Console.err.print("Usage : countchars1 <file name>")                                                                          
      return
    }

    val lines = Source.fromFile(args(0)).getLines().toList
    val lines_length = lines.map(line => (line, line.trim().length())).toList
    val max_lol = lol(lines.map(line => (line, line.length())).reduceRight((a, b) => { if (b._2 < a._2) a else b })._2)
    
    lines_length.foreach(l => { 
      val padding = " " * (max_lol - lol(l._2))
      println(f"${padding}${l._2}|  ${l._1}") 
     })
  }
  
  /** Length of length */
  def lol(l : Int) = l.toString().length()
}