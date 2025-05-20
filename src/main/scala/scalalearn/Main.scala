/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scalalearn.inheritance.Shapes
import scalalearn.traits.TraitsTest

import scala.collection.mutable.ListBuffer

/** Main application launcher
  */
object Main {

  private final val VERSION = "v.0.14"

  def main(args: Array[String]): Unit = {

    // scalastyle:off println
    println(s"ScalaLearn $VERSION")
    println("")
    // scalastyle:off println

    val useCases = new ListBuffer[LearningModule]()

    useCases.appendAll(Seq(
      ListAndTuple,
      MutableAndImmutableSet,
      FirstClassFunctions,
      Closure,
      MapForEachAndSoOn,
      HighOrderFunction,
      Currying,
      Shapes,
      TraitsTest,
      Arrays,
      ForAndWhile,
      PartiallyAppliedFunction,
      CaseClasses,
      new ClassTemplate("John", "Way"),
      Options,
      Collections,
      Implicits,
      MapReduce,
      ByNameParam,
      Recursion,
      TypeParameterization
    ))

    useCases.foreach(_.printOutput())

    println()
    println("All done. Bye.")

  }

}
