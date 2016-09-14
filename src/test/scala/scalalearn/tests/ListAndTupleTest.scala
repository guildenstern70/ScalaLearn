package scalalearn.tests

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

import scalalearn.ListAndTuple


@RunWith(classOf[JUnitRunner])
class ListAndTupleTest extends FlatSpec with Matchers {


    "The #1 list" should "contain expected values" in {

        ListAndTuple.myList1 should be (List(0, 1, 2, 3, 4))

    }

    "The #2 list" should "contain expected values" in {

        ListAndTuple.myList2 should be (List(1, 2, 3, 4))

    }

    "The tuple" should "contain expected values" in {

        ListAndTuple.myTuple._1 should be (77)
        ListAndTuple.myTuple._2 should be ("Alessio")
        ListAndTuple.myTuple._3 should be (345.7)

    }
    

}