type Set = Int => Boolean

def contains(s:Set, elem:Int) = s(elem)

def singletonSet(elem:Int) : Set = {
  def func(x:Int) : Boolean = {
    x == elem
  }
  func
}
def singletonSet2(elem:Int) : Set = x => (x == elem)
def singletonSet3 = (elem:Int) => (x: Int)  => (x == elem)
def negativeNumbersSet(x:Int) : Boolean =  x < 0

// the characteristic function for negative numbers : (x:Int) => x < 0
contains(x => x < 0, 7)
contains(x => x < 0, -7)
contains(x => x < 0, 7)
contains(x => x < 0, 7)

singletonSet(1)

contains(negativeNumbersSet, 1)
contains(negativeNumbersSet, -1)

contains(singletonSet(1), 1)
contains(singletonSet(1), 2)
contains(singletonSet2(1), 1)
contains(singletonSet2(1), 2)
contains(singletonSet3(1), 1)
contains(singletonSet3(1), 2)