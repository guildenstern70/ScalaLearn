/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RecursionSpec extends AnyFlatSpec with should.Matchers {
  "Recursion function" should "return the correct value" in {
    Recursion.recursionApplied() should be(1665)
  }
}
