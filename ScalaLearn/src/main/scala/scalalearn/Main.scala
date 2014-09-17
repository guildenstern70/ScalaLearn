/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-14
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

import scalalearn.inheritance.ShapesTest
import scalalearn.traits.TraitsTest
import scala.collection.mutable.ListBuffer

/**
 * Main application launcher
 *
 */
object Main {

    final val VERSION = "v.0.2.1024"

    def main(args: Array[String]) {
        
        println("ScalaLearn %s".format(VERSION))
        
        val tests = new ListBuffer[LearningModule]()
        
        tests.append(ListAndTuple)
        tests.append(MutableAndImmutableSet)
        tests.append(FirstClassFunctions)
        tests.append(Closure)
        tests.append(MapForEachAndSoOn)
        tests.append(HighOrderFunction)
        tests.append(Currying)
        tests.append(ShapesTest)
        tests.append(TraitsTest)
        tests.append(Arrays)
        tests.append(ForAndWhile)
        tests.append(PartiallyAppliedFunction)
        tests.append(new ClassTemplate("John", "Way"))
                
        tests.foreach( test => test.printOutput );
        
        println()
        println("All done. Bye.")
        
    }

}
