val tolerance = 0.0001

def abs(x: Double) =
  if (x < 0) -x else x

def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    println("guess= " + next + " ")

    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

// def averageDamp(f: Double => Double)(x: Double) = (x + f(10)) / 2

def averageDamp(f: Int => Int)(x: Double) = 10.1

averageDamp(x => x / 2)_

def sqrt2(x: Double) = fixedPoint(averageDamp(y => y + 10))(1)
sqrt2(2)