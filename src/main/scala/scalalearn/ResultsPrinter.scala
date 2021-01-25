/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-21
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

class ResultsPrinter(testName: String)
{

    val results = new ListBuffer[String]

    def +=(result: String): Unit =
    {
        ResultsPrinter.this.addResult(result)
    }

    def addResult(result: String): Unit =
    {
        results.append(result)
    }

    def printDetail(result: Any): Unit =
    {
        ResultsPrinter.this.addResult(result.toString)
        ResultsPrinter.this.print()
    }

    def printDetails(results: Iterator[Any]): Unit =
    {
        results.foreach
        { i => ResultsPrinter.this.addResult("> Value = %s".format(i.toString)) }
        ResultsPrinter.this.print()
    }

    // scalastyle:off println
    def print(): Unit =
    {
        val testOutput: List[String] = ResultsPrinter.this.results.toList
        def resultsString = testOutput.mkString(sys.props("line.separator"))
        println()
        println("** TEST %s **".format(testName))
        println(resultsString)
    }
    // scalastyle:on println

}
