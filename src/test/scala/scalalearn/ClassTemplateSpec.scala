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

/** Class Template Tests
  */
class ClassTemplateSpec extends AnyFlatSpec with should.Matchers {

  "Class Attributes" should "contain expected values" in {

    val cTempl = new ClassTemplate("Alessio", "Saltarin")

    cTempl.name should be("Alessio")
    cTempl.surname should be("Saltarin")

  }

}
