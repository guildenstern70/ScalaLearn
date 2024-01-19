/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scala.collection.mutable.ListBuffer

object ForAndWhile extends LearningModule {

  val someNumbers: Array[Int] = Array(1, 2, 3, 4, 5)
  var results = new ListBuffer[Int]()
  var testName: String = ""

  // Normal for loop
  private val ints = List.range(0, 10)
  for i <- ints do {
    results.append(i)
  }

  // Indexed for loop - indexes are zero based
  for((x,i) <- someNumbers.view.zipWithIndex) {
    results.append(i)
  }

  // Iterate over a list
  // var j; can be omitted!
  for (j <- someNumbers) {
    results.append(j)
  }
  this.printOutput("FOR #1")

  // Indices: get item at without using a var...
  for (k <- someNumbers.indices) {
    results.append(someNumbers(k))
  }
  this.printOutput("FOR #2")

  // Classic for
  for (i <- 10 to 20 by 2) {
    results.append(i)
  }
  this.printOutput("FOR #3")

  // Yielding
  private val yieldInts: Array[Int] = for (a <- someNumbers) yield a * 2
  for i <- yieldInts do {
    results.append(i)
  }
  this.printOutput("YIELD")

  // For comprehension
  for {
    (x, i) <- ints.zipWithIndex
    if i % 2 != 0
  } yield x
  for i <- ints do {
    results.append(i)
  }
  this.printOutput("FOR COMPREHENSION")

  // Filtering
  for (i <- 1 until 20 if i % 2 == 0) {
    results.append(i)
  }
  this.printOutput("FILTER")

  // While
  var a = 150
  var b = 40
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
    results.append(b)
  }
  this.printOutput("WHILE")

  def printOutput(): Unit = {
    new ResultsPrinter(this.testName + " -> ")
      .printDetails(this.results.toList.iterator);
    this.results = new ListBuffer[Int]()
  }

  def printOutput(testName: String): Unit = {
    this.testName = testName;
    this.printOutput()
  }

}
