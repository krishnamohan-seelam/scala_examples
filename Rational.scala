import scala.Predef

class Rational (x:Int,y:Int) {
  
  require( y !=0 ,  "denominator must be non zero value")
  
  private def gcd(a:Int,b:Int):Int  =   { if (b==0)  a  else  gcd(b,a%b)  }
  
  def numerator = x
  def denominator =y
  override  def toString = numerator/gcd(x,y) +"/" + denominator/gcd(x,y)
  
  def +(that :Rational)  = new Rational(numerator * that.denominator + that.numerator* denominator, 
                   denominator*that.denominator)
  def unary_- :Rational= new Rational(-numerator, denominator)
  
  def -(that :Rational)  =this + (-that )
  
  def *(that: Rational): Rational = new Rational( numerator * that.numerator, denominator * that.denominator )
  
  def inverse():Rational = new Rational(denominator,numerator)
  
  def /(that:Rational) :Rational =   this *   that.inverse
  
  def < ( that :Rational)  = this.numerator * that.denominator <   this.denominator * that.numerator
  
  def max(that:Rational)  =  if (this <  that )  that else that
}