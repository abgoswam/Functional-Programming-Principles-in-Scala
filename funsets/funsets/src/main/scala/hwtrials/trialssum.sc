
def sum1(f:Int => Int, a:Int, b:Int) : Int = {
  if (a > b) 0
  else f(a) + sum1(f, a+1, b)
}
def sumInts1(a:Int, b:Int) = sum1(x => x, a, b)
sumInts1(1,10)

def sum2(f:Int => Int)(a:Int, b:Int) : Int = {
  if (a > b) 0
  else f(a) + sum2(f)(a+1, b)
}
sum2(x=>x)(1,10)

def sum3(f:Int => Int) : (Int, Int) => Int = (a:Int, b:Int) => {
  if (a > b) 0
  else f(a) + sum3(f)(a+1, b)
}

def sumInts2 = sum3(x=>x)

sumInts2(1,10)
sum3(x=>x)(1,10)

def sum4 : (Int => Int) => (Int, Int) => Int = (f:Int => Int) => (a:Int, b:Int) => {
  if (a > b) 0
  else f(a) + sum4(f)(a+1, b)
}

def dummy = sum4
