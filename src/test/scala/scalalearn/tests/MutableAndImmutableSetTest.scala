package scalalearn.tests

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

import scalalearn.MutableAndImmutableSet

@RunWith(classOf[JUnitRunner])
class MutableAndImmutableSetTest extends FlatSpec with Matchers {

    "The given set" should "cointain the expected number of elements" in {

        MutableAndImmutableSet.jetSet.size should be (3)

    }

    it should "only contain unique items" in {

        // We try to add an element that is already present
        MutableAndImmutableSet.jetSet += "Lear"
        MutableAndImmutableSet.jetSet.size should be (3)

    }



}
