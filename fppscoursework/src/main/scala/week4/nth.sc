import week4._

object nth {
  def nth[T](n:Int, xs:List[T]): T = {
    if (n == 0) xs.head
    else nth(n-1, xs.tail)
  }

  println("abhishek")
  val list = new Cons(11, new Cons(12, new Cons(13, new Nil)))

  nth(1,list)
  nth(2, list)
}