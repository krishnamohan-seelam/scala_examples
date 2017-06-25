
import scala.io.StdIn
import scala.math
object NSquareroot extends App {

  println("Enter input:")
  val input = try { StdIn.readDouble() }
  catch {
    case ne: NumberFormatException => 0.0D
  }

  println("Received input :" + input.formatted("%6.4f"))

  var nformat: String = "%15s %6.4f  %-20s  %6.4f"

  println(nformat.format("Squareroot of ", input, "from newton's method is", squareroot(input)))

  def squareroot(input: Double) = {

    def newtonSqrRt(estimatedRoot: Double ): Double = {
      if (isNearToReal(estimatedRoot )) estimatedRoot
      else newtonSqrRt(getCalculatedMean(estimatedRoot ))
    }

    def isNearToReal(estimatedRoot: Double ): Boolean = math.abs(estimatedRoot * estimatedRoot - input) / input < 0.00001

    def getCalculatedMean(estimatedRoot: Double ): Double = (estimatedRoot + input / estimatedRoot) / 2

    newtonSqrRt(1)
  }

}