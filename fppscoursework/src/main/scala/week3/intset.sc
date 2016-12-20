if (true) 1 else false

object intset {
  println("Abhishek Goswami")
  val t1 = new NonEmpty(3, new Empty, new Empty)
  val t2 = t1 incl 4
  println("Abhishek Goswami")
  println("-----------------")
  val x1 = new NonEmpty(3, new Empty, new Empty)
  val x2 = x1 incl 2
  x2.union(t2)

  if (true) 1 else false
}

abstract class IntSet {
  def incl(x:Int) : IntSet
  def contains(x:Int): Boolean
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {
  def contains(x:Int): Boolean = false
  def incl(x:Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  def union(other:IntSet): IntSet = other
  override def toString = "."
}

class NonEmpty(elem:Int, left:IntSet, right: IntSet) extends IntSet {
  def contains(x:Int): Boolean = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }

  def incl(x:Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }

  def union(other:IntSet): IntSet = {
//    if (other.contains(elem) == false) {
//      other.incl(elem).union(left).union(right)
//    }
//    else {
//      other.union(left).union(right)
//    }

    ((left union right) union other) incl elem

//    other.incl(elem).union(left).union(right)
  }

  override def toString = "{" + left + elem + right + "}"
}