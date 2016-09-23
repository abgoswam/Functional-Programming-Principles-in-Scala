def sum0(f:Int => Int)(a:Int, b:Int) = a + b

def sum1(f:Int => Int): (Int, Int) => Int = {
  //...
  //...
  def sumF(a:Int, b:Int):Int = {
    //f(a) + f(b)
    a+b
  }
  sumF
}

//def sum1b(f:Int => Int) = {
//  //...
//  //...
//  def sumFb(a:Int, b:Int):Int = {
//    //f(a) + f(b)
//    a+b
//  }
//  sumFb
//}

def sum2(f:Int => Int): (Int, Int) => Int = (a:Int, b:Int) => a + b

def sum2b(f:Int => Int) = (a:Int, b:Int) => a + b

def sum3 : (Int => Int) => (Int, Int) => Int = (f:Int =>Int) => (a:Int, b:Int) => a + b

sum0(x=>x+1)(2,3)

println("abhishek")
println("goswami")

sum1(x=>x+1)(2,4)
sum2(x=>x+1)(2,5)
sum2b(x=>x+1)(2,15)
sum3(x=>x+1)(2,6)
