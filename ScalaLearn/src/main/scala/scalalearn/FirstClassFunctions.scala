/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013
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

    // AreaDelCerchio is a function that takes one parameter of type Double
    // and returns a Double
    val areaDelCerchio = (raggio: Double) => { raggio * raggio * Math.PI }
    
    // RemString is a function that takes no parameters and returns a String
    val remString = () => { "REM" }
    

    def printOutput() {

        val test = new ResultsPrinter("FIRST CLASS FUNCTION")
        val result = areaDelCerchio(10).toString
        test.addResult("> Circle area with radius = 10 => %s ".format(result))
        test.addResult(remString + ": trial")
        test.print

    }

}