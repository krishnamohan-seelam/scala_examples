package project01
import scala.io.StdIn
import scala.math
object Earthquake extends  App{
  
    println("Please enter a Ricther scale value:")
    val tonTNT =4.184 * (math.pow(10,9))
    val input= try
           {
              StdIn.readFloat()
           }
           catch 
           {
             case ne:NumberFormatException => 0.0F
           }
      
     val energy:Double  =math.pow(10, ((1.5 * input ) +4.8 ))
     val tntResult :Double=(energy/tonTNT)
    
     println(s"Ricther scale value : $input")
     var  nformat:String ="%-30s: %6.9f  %-30s:  %6.20f"
     println( nformat.format("Equivalence energy:",energy , "TNT value",tntResult))
    
    println("End")
    
     
  
}