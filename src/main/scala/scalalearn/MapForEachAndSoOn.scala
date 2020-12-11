/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-20
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

/**
  * Basic list handlers in functional style
  */
object MapForEachAndSoOn extends LearningModule
{

    val someNumbers: List[Int] = List(1, 2, 3, 4, 5, 6)

    def numbersMap(): List[Int] = someNumbers.map(x => x * 2)

    def numbersMapShortcut(): List[Int] = someNumbers.map(_ * 2)

    def numbersSum(): Int = someNumbers.sum

    def eachNumber(): Int =
    {
        var sum = 0
        someNumbers.foreach(x => sum += x)
        sum
    }

    def printOutput(): Unit =
    {
        new ResultsPrinter("List Map").printDetails(numbersMap().iterator)
        new ResultsPrinter("List Sum").printDetail(numbersSum())
        new ResultsPrinter("List ForEach").printDetail(eachNumber())
    }

}
