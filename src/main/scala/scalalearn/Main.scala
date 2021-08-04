/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scalalearn.inheritance.Shapes
import scalalearn.traits.TraitsTest

import scala.collection.mutable.ListBuffer


/**
 * Main application launcher
  *
  */
object Main
{

    final val VERSION = "v.0.9"

    def main(args: Array[String]): Unit =
    {

        // scalastyle:off println
        println(s"ScalaLearn $VERSION")
        println("")
        // scalastyle:off println

        val useCases = new ListBuffer[LearningModule]()

        useCases.append(ListAndTuple)
        useCases.append(MutableAndImmutableSet)
        useCases.append(FirstClassFunctions)
        useCases.append(Closure)
        useCases.append(MapForEachAndSoOn)
        useCases.append(HighOrderFunction)
        useCases.append(Currying)
        useCases.append(Shapes)
        useCases.append(TraitsTest)
        useCases.append(Arrays)
        useCases.append(ForAndWhile)
        useCases.append(PartiallyAppliedFunction)
        useCases.append(CaseClasses)
        useCases.append(new ClassTemplate("John", "Way"))
        useCases.append(Options)
        useCases.append(Collections)
        useCases.append(Implicits)
        useCases.append(MapReduce)
        useCases.append(ByNameParam)
        useCases.append(Recursion)

        useCases.foreach(_.printOutput())

        println()
        println("All done. Bye.")

    }

}
