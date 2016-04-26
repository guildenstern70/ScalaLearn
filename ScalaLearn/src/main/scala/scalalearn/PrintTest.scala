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

class PrintTest(testName: String) {

    val results = new ListBuffer[String]

    def +=(result: String) {
        this.addResult(result)
    }

    def addResult(result: String) {
        results.append(result)
    }

    def printSingleDetail(result: Any) {
        this.addResult(result.toString)
        this.print()
    }

    def printDetails(results: Iterator[Any]) {
        results.foreach { i => this.addResult("> Value = %s".format(i.toString)) }
        this.print()
    }

    def print() {

        val testOutput: List[String] = this.results.toList

        def resultsString = testOutput.mkString(sys.props("line.separator"))

        println()
        println("** TEST %s **".format(testName))
        println(resultsString)
    }

}