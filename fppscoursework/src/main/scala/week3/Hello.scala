package week3

import week2.Rational

/**
  * Created by agoswami on 12/19/2016.
  */
object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val r = new Rational(1, 12)
    println(r.denom)
  }
}
