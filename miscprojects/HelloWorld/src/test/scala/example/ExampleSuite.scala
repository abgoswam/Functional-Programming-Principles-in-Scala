package example

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
  * Created by agoswami on 8/23/2016.
  */

@RunWith(classOf[JUnitRunner])
class ExampleSuite extends FunSuite {
  test("one plus one is two")(assert(1 + 2 === 2))

  test("one plus one is three?") {
    assert(1 + 2 == 3) // This assertion fails! Go ahead and fix it.
  }

}

