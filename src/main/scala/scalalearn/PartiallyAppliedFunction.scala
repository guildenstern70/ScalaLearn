/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

object PartiallyAppliedFunction extends LearningModule {
  var resultsList: List[Int] = List[Int]()

  def plus(a: Int)(b: Int)(c: Int): Int = a + b + c

  def plus2: (Int, Int) => Int = plus(2)(_)(_)

  // 'plus2' is a partially applied function
  val result: Int = plus2(4, 4) // => 10

  resultsList = result :: resultsList

  def printOutput(): Unit = {
    new ResultsPrinter("Partially Applied Function")
      .printDetails(resultsList.iterator)
  }

}
