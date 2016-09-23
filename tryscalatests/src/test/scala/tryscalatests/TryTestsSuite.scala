package tryscalatests

/**
  * Created by agoswami on 9/12/2016.
  */

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
//import org.junit.runner.RunWith
//
//
//@RunWith(classOf[JUnitRunner])
class TryTestsSuite extends FunSuite{

  test("adding ints A") {
    assert(1 + 2 == 3)
  }

  test("adding ints B") {
    assert(1 + 2 === 3)
  }

  test("adding ints C") {
    assert(1 + 2 === 3)
  }
}
