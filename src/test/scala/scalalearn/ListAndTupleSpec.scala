/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ListAndTupleSpec extends AnyFlatSpec with should.Matchers {

  "The #1 list" should "contain 0,1,2,3,4" in {

    ListAndTuple.myList1 should be(List(0, 1, 2, 3, 4))

  }

  "The #2 list" should "contain 1,2,3,4" in {
    val resultingList = List(1, 2, 3, 4)
    ListAndTuple.myList2 should be(resultingList)
  }

  "The tuple" should "contain expected values" in {
    val myTuple = ListAndTuple.myTuple
    myTuple._1 should be(77)
    myTuple._2 should be("Alessio")
    myTuple._3 should be(345.7)
  }

}
