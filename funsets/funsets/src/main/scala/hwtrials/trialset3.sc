import funsets.FunSets._

val bound = 1000

/**
  * Returns whether all bounded integers within `s` satisfy `p`.
  */
def forall(s: Set, p: Int => Boolean): Boolean = {
  def iter(a: Int): Boolean = {
    if (a > bound) true
    else if (contains(s, a) & !p(a)) false
    else iter(a+1)
  }
  iter(-bound)
}

forall(x => x < 0, x => x < 0)

val s12 = union(singletonSet(1), singletonSet(2))
contains(s12, 1)

forall(s12, x => x < 0)

def exists(s: Set, p: Int => Boolean): Boolean = !forall(s, x => !p(x))

forall(s12, x => x == 1 | x == 2)
exists(s12, x => x == 3)

/**
  * Returns a set transformed by applying `f` to each element of `s`.
  */
def map(s: Set, f: Int => Int): Set = {
  def iter(a:Int) : Set = {
      if(a > bound) x => false
      else if (contains(s,a)) union(singletonSet(f(a)), iter(a+1))
      else iter(a+1)
  }
  iter(-bound)
}

contains(map(s12, x => x + 1), 2)