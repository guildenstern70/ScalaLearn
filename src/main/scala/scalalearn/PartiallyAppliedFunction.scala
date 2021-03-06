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

object PartiallyAppliedFunction extends LearningModule
{
    var resultsList: List[Int] = List[Int]()

    def plus(a: Int)(b: Int)(c: Int): Int = a + b + c

    def plus2: (Int, Int) => Int = plus(2)(_)(_)

    // 'plus2' is a partially applied function
    val result: Int = plus2(4, 4)  // => 10

    resultsList = result :: resultsList

    def printOutput(): Unit =
    {
        new ResultsPrinter("Partially Applied Function")
                .printDetails(resultsList.iterator)
    }

}
