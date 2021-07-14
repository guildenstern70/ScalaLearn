// ScalaLearn
//
// Copyright (C) Alessio Saltarin - 2013-21
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
package scalalearn

import scala.collection.mutable.ListBuffer

object ForAndWhile extends LearningModule
{

    val someNumbers: Array[Int] = Array(1, 2, 3, 4, 5)
    var results = new ListBuffer[Int]()
    var testName: String = ""

    // Best compromise between functional and imperative
    List.range(0, 10).foreach
    { i =>
        results.append(i)
    }

    // Iterate over a list
    // var j; can be omitted!
    for (j <- someNumbers)
    {
        results.append(j)
    }
    this.printOutput("FOR #1")

    // Indices: get item at without using a var...
    for (k <- someNumbers.indices)
    {
        results.append(someNumbers(k))
    }
    this.printOutput("FOR #2")

    // Classic for
    for (i <- 10 to 20 by 2)
    {
        results.append(i)
    }
    this.printOutput("FOR #3")

    // Yielding
    val ints: Array[Int] = for (a <- someNumbers) yield a * 2
    ints.foreach
    {
        this.results += _
    }
    this.printOutput("YIELD")

    // For comprehension
    for
    {
        (x, i) <- ints.zipWithIndex
        if i % 2 != 0
    } yield x
    ints.foreach
    {
        this.results += _
    }
    this.printOutput("FOR COMPREHENSION")

    // Filtering
    for (
        i <- 1 until 20 if i % 2 == 0
    )
    {
        results.append(i)
    }
    this.printOutput("FILTER")

    // While
    var a = 150
    var b = 40
    while (a != 0)
    {
        val temp = a
        a = b % a
        b = temp
        results.append(b)
    }
    this.printOutput("WHILE")

    def printOutput(): Unit =
    {
        new ResultsPrinter(this.testName + " -> ").printDetails(this.results.toList.iterator);
        this.results = new ListBuffer[Int]()
    }

    def printOutput(testName: String): Unit =
    {
        this.testName = testName;
        this.printOutput()
    }

}
