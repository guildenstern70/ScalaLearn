/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MutableAndImmutableSetSpec extends AnyFlatSpec with should.Matchers
{

    "The given set" should "cointain the expected number of elements" in
            {

                MutableAndImmutableSet.jetSet.size should be(3)

            }

    it should "only contain unique items" in
            {

                // We try to add an element that is already present
                MutableAndImmutableSet.jetSet += "Lear"
                MutableAndImmutableSet.jetSet.size should be(3)

            }


}
