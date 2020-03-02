package tech.datarchy.scala.app1

object App1 {
  
  def main(args : Array[String]) : Unit = {
       sing(10)
  }
  
  def sing(bottles : Int) : Unit = {
    
    (1 to bottles).reverse.foreach(bottle => {
      sing_line(s"$bottle bottles of water on the wall, $bottle bottles of water\n", bottle)      
      sing_line(s"take one down and pass it around, ${bottle - 1} bottles of water on the wall\n\n", bottle)
    })
    
    sing_line(s"no more bottle of water on the wall, no more bottles on the wall\n\n", bottles)
    
    if (bottles == 1) {
      return 
    }
    
    sing_line(s"go to the store and buy some more, ${bottles - 1} bottles of water on the wall...\n\n", bottles)
    
    sing(bottles - 1)
  }
  
  def sing_line(line : String, wait : Long) {
     line.split(" ").foreach(word => {
         print(word + " ")
         Thread.sleep(10 * wait)
     })
     Thread.sleep(100 * wait)
  }
}
