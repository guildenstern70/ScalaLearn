/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
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

  implicit def numberStringToInt(d: NumberString): Int =
    d.number.toInt

  override def printOutput(): Unit = {

    val test = new ResultsPrinter("IMPLICIT CONVERSIONS")
    val impl = NumberString("23")

    // This should be 46
    val result = 2 * impl
    test.addResult(s"${result.toString} should be 46")
    test.print()
  }
}
