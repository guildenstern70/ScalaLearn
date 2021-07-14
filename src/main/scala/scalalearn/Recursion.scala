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

object Recursion extends LearningModule
{

    def recursiveSum(intList: List[Int], sum: Int, index: Int): Int =
    {
        if (intList.length == index)
        {
            return sum
        }
        recursiveSum(intList, sum + intList(index), index + 1)
    }

    def recursionApplied(): Int =
    {
        val someNumbers = List(111, 222, 333, 444, 555)
        this.recursiveSum(someNumbers, 0, 0)
    }

    override def printOutput(): Unit =
        new ResultsPrinter("Recursion").printDetail(this.recursionApplied())
}
