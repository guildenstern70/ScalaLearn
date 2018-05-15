/**
  * Scala Learn
  * Copyright (C) Alessio Saltarin - 2013-18
  *
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  *
  */
package scalalearn

import scala.collection.mutable.ListBuffer

import scalalearn.inheritance.Shapes
import scalalearn.traits.TraitsTest


/**
  * Main application launcher
  *
  */
object Main
{

    final val VERSION = "v.0.3.1025"

    def main(args: Array[String])
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

        useCases.foreach(_.printOutput)

        println()
        println("All done. Bye.")

    }

}
