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

class ClosureSpec extends AnyFlatSpec with should.Matchers {

  "Closure" should "contain expected values" in {

    // The list 'someNumbers' exists even if
    // we did not instantiate the Closure object
    val closure = Closure.closure(4)

    closure.sum should be(41)
  }

}
