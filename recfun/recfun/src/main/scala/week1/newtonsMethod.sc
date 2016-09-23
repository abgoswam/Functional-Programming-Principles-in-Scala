object session {
  1 + 2

  def abs(x: Double) =
    if (x < 0) -x else x

  def sqrt(x: Double): Double = {
    
    def sqrtIter(guess: Double): Double =
      if (isgoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isgoodEnough(guess: Double): Boolean =
      if (abs(guess * guess - x) < 0.001) true else false

    def improve(guess: Double): Double =
      (guess + (x / guess)) / 2

    sqrtIter(1.0)
  }

  sqrt(2)
  sqrt(4)
  sqrt(25)
}