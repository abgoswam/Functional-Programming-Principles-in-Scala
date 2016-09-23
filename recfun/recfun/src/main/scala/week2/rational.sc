println("welcome to the scala worksheet")

val x = new Rational(4, 12)
val y = new Rational(5, 7)
val z = new Rational(3, 2)

x.sub(y).sub(z)
x.max(y)
x max z

new Rational(2)

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a:Int, b:Int) : Int =
    if(b == 0) a else gcd(b, a % b)

  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def less(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (this.less(that)) that else this

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg =
    new Rational(-numer, denom)

  def sub(that: Rational) =
    this.add(that.neg)

  override def toString =
    numer + "/" + denom
}

// appendix -------
//val x = new Rational(1,2)
//x.numer
//x.denom
//
//val y = new Rational(2,3)
//x.add(y)

val strange = new Rational(1, 0)
strange.add(strange)

object rationals {
  println("welcome to the scala worksheet")
}

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
  }
}

def addRational(r: Rational, s: Rational): Rational = {
  new Rational(
    r.numer * s.denom + s.numer * r.denom,
    r.denom * s.denom
  )
}

def makeString(r: Rational) = r.numer + "/" + r.denom

makeString(
  addRational(new Rational(1, 2), new Rational(2, 3)))


