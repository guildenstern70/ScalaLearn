/**
 * Scala Learn
 *
  * Copyright (C) Alessio Saltarin - 2013-16
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

object FirstClassFunctions extends LearningModule {

    // FIRST CLASS FUNCTIONS
    // A function is like any other value in Scala (first class).
    // It can be passed to a function as a parameter
    // circleArea and squareArea are functions that takes one parameter of type Double
    // and returns a Double
    val circleArea = (radius: Double) => { radius * radius * Math.PI }
    val squareArea = (side: Double) => { side * side } 
    
    
   
    // funcRun is a Higher Order Function
    def funcRun( func: Double => Double, v: Double ) : String = {
        val result = func(v)
        result.toString

    }


    def printOutput {

        val test = new ResultsPrinter("FIRST CLASS FUNCTION")
        val result1 = this.funcRun(circleArea, 10.0)
        val result2 = this.funcRun(squareArea, 10.0)
        test.addResult("> Circle area with radius = 10 => %s ".format(result1))
        test.addResult("> Square area with side = 10 => %s ".format(result2))
        test.print()

    }

}