/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** Basic list handlers in functional style
  */
object MapForEachAndSoOn extends LearningModule {

  val someNumbers: List[Int] = List(1, 2, 3, 4, 5, 6)

  def numbersMap(): List[Int] = someNumbers.map(x => x * 2)

  def numbersMapShortcut(): List[Int] = someNumbers.map(_ * 2)

  def numbersSum(): Int = someNumbers.sum

  def eachNumber(): Int = {
    var sum = 0
    someNumbers.foreach(x => sum += x)
    sum
  }

  def printOutput(): Unit = {
    new ResultsPrinter("List Map").printDetails(numbersMap().iterator)
    new ResultsPrinter("List Sum").printDetail(numbersSum())
    new ResultsPrinter("List ForEach").printDetail(eachNumber())
  }

}
