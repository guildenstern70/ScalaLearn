/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** Functions are First Class Citizens
  */
object FirstClassFunctions extends LearningModule {

  // FIRST CLASS FUNCTIONS
  // A function is like any other value in Scala (first class).
  // It can be passed to a function as a parameter
  // circleArea and squareArea are functions that takes one parameter of type Double
  // and returns a Double
  private val circleArea: (Double) => Double = (radius: Double) => {
    radius * radius * Math.PI
  }

  private val squareArea: (Double) => Double = (side: Double) => {
    side * side
  }

  // funcRun is a Higher Order Function:
  // since it accepts a function as parameter
  private def funcRun(func: Double => Double, v: Double): String = func(v).toString

  def printOutput(): Unit = {

    val test = new ResultsPrinter("FIRST CLASS FUNCTION")
    val result1 = this.funcRun(circleArea, 10.0)
    val result2 = this.funcRun(squareArea, 10.0)
    test.addResult("> Circle area with radius = 10 => %s ".format(result1))
    test.addResult("> Square area with side = 10 => %s ".format(result2))
    test.print()

  }

}
