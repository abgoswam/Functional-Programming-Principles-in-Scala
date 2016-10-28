/** Calculate square root of parameter x **/

def sqrt(x:Double): Double = 10

def sqrtIter(guess:Double, x:Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)