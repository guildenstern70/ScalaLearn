/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scala.annotation.targetName
import scala.collection.mutable.ListBuffer

class ResultsPrinter(testName: String) {

  val results = new ListBuffer[String]

  @targetName("addResultToString")
  def +=(result: String): Unit = { // scalastyle:ignore
    this.addResult(result)
  }

  def addResult(result: String): Unit = {
    results.append(result)
  }

  def printDetail(result: Any): Unit = {
    this.addResult(result.toString)
    this.print()
  }

  def printDetails(results: Iterator[Any]): Unit = {
    results.foreach { (i: Any) =>
      this.addResult("> Value = %s".format(i.toString))
    }
    this.print()
  }

  // scalastyle:off println
  def print(): Unit = {
    val testOutput: List[String] = ResultsPrinter.this.results.toList
    def resultsString = testOutput.mkString(sys.props("line.separator"))
    println()
    println("** TEST %s **".format(testName))
    println(resultsString)
  }
  // scalastyle:on println

}
