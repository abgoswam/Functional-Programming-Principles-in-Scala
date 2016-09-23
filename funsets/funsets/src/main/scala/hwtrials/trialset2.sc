import funsets.FunSets._

type Set = Int => Boolean

def contains(s:Set, elem:Int) = s(elem)

def singletonSet(elem:Int) : Set = x => (x == elem)

//--- verify----
val s10 = singletonSet(10)
val s11 = singletonSet(11)
contains(s10, 10)
contains(s10, 11)

def union(s1:Set, s2:Set) : Set = x => contains(s1, x) | contains(s2, x)
def intersect(s1:Set, s2:Set) : Set = x => contains(s1, x) & contains(s2, x)
def diff(s1:Set, s2:Set) : Set = x => contains(s1, x) & !contains(s2, x)

//--- verify----
contains(union(s10, s11), 11)
contains(union(s10, s11), 12)

val u12 = union(singletonSet(1), singletonSet(2))
val u23 = union(singletonSet(2), singletonSet(3))
val si = intersect(u12, u23)

contains(intersect(u12, u23), 2)
contains(intersect(u12, u23), 3)
contains(diff(u12, u23), 1)
contains(diff(u12, u23), 2)

def filter(s: Set, p: Int => Boolean): Set = x => contains(s, x) & p(x)

//--- verify----
val s12 = union(singletonSet(1), singletonSet(2))

def isEven(x:Int) = if ((x % 2) == 0) true else false

contains(s12, 1)
contains(filter(s12, isEven),1)
contains(filter(s12, isEven),2)