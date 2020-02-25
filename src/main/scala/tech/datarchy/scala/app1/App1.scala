package tech.datarchy.scala.app1

object App1 {
  
  def main(args : Array[String]) : Unit = {
       sing(10)
  }
  
  def sing(bottles : Integer) : Unit = {
    
    if (bottles == 0) {
      return 
    }
    
    (1 to bottles).reverse.foreach(bottle => {
      sing_line(s"$bottle bottles of water on the wall, $bottle bottles of water\n" )      
      sing_line(s"take one down and pass it around, ${bottle - 1} bottles of water on the wall\n\n")
    })
    
    sing_line(s"no more bottle of water on the wall, no more bottles on the wall\n\n")
    
    sing_line(s"go to the store and buy some more, ${bottles - 1} bottles of water on the wall...\n\n")
    
    sing(bottles - 1)
  }
  
  def sing_line(line : String) {
     line.split(" ").foreach(word => {
         print(word + " ")
         Thread.sleep(300)
     })
     Thread.sleep(1000)
  }
}
