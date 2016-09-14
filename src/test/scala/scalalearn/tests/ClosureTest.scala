package scalalearn.tests

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

import scalalearn.Closure

@RunWith(classOf[JUnitRunner])
class ClosureTest extends FlatSpec with Matchers {

    "Closure" should "contain expected values" in {

        // The list 'someNumbers' exists even if
        // we did not instantiate the Closure object
        val closure = Closure.closure(4)

        closure.sum should be (41)

    }

}
