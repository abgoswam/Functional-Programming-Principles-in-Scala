val tolerance = 0.0001

def abs(x: Double) =
  if (x < 0) -x else x

def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {

  def iterate(guess: Double): Double = {
    val next = f(guess)
    println("guess = " + next + " ")

    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

def sqrt(x: Double) = fixedPoint(y => (y + (x / y)) / 2)(1)

sqrt(2)
sqrt(5)

def fixedPoint2(f: Double => Double): Double => Double = {
  def funcX(firstGuess: Double): Double = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println("guess = " + next + " ")

      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }
  funcX
}

def fixedPoint3(f: Double => Double) = (firstGuess: Double) => {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    println("guess = " + next + " ")

    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

def fixedPoint4 = (f: Double => Double) => (firstGuess: Double) => {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    println("guess = " + next + " ")

    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

fixedPoint2(y => (y + (5 / y)) / 2)(1)
fixedPoint3(y => (y + (5 / y)) / 2)(1)
fixedPoint4(y => (y + (5 / y)) / 2)(1)