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

object Closure extends LearningModule {

    var someNumbers = List(11, 10, 5, 0, 5, 10)

    // Closure: the variabile 'someNumbers' is FREE.
    // When "closure" it's called, it takes the most recent
    // value of someNumbers
    val closure = (f: Int) => { someNumbers.filter(_ > f) }

    def printOutput() {
        val test = new ResultsPrinter("CLOSURE")
        someNumbers = List(11, 10, 6, 10, 5, 10)
        val result = closure(5)
        for (oInt <- result) {
            test.addResult("Value = %d".format(oInt))
        }
        test.print
    }

}