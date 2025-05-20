/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scala.language.implicitConversions

/** Implicit conversions do not need to be explicitly called.
  */
object Implicits extends LearningModule {

  case class NumberString(number: String)

  // Implicit conversions
  implicit def numberStringToInt(d: NumberString): Int =
    d.number.toInt

  // Implicit parameter. See also 'Currying'
  def addTwo(a: Int)(implicit b: Int = 2): Int =
    (a + b)

  override def printOutput(): Unit = {

    val test = new ResultsPrinter("IMPLICIT CONVERSIONS")
    val impl = NumberString("23")

    // This should be 46
    val result = 2 * impl
    // This should be 34
    var result2 = addTwo(32)
    test.addResult(s"${result.toString} should be 46")
    test.addResult(s"${result2.toString} should be 34")
    test.print()
  }
}
