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
    /**
     * This function is recursive.
     * It iteratively take out the head of the list and adds up it with the tail
     *   List :: List => Prepend, see ListAndTuple
     *   This can be read as:
     *   if (intList == intList.head :: intList.tail) { head = intList.head; tail = intList.tail }
     * @param intList List to be added up
     * @return Sum of the list items
     */
    def recursiveSum1(intList: List[Int]): Int = intList match {
        case Nil => 0
        case head :: tail => head + recursiveSum1(tail)
    }

    /**
     * This function is tail recursive.
     * It iteratively sum the items and returns the sum each iteration
     * @param intList List to be added up
     * @return Sum of the list items
     */
    def recursiveSum2(intList: List[Int], sum: Int, index: Int): Int =
    {
        if (intList.length == index)
        {
            return sum
        }
        recursiveSum2(intList, sum + intList(index), index + 1)
    }

    /**
     * This function is recursive.
     * It iteratively take out the head of the list and adds up it with the tail
     * @param intList List to be added up
     * @return Sum of the list items
     */
    def recursiveSum3(intList: List[Int]): Int =
    {
        if (intList == List()) return 0
        intList.head + recursiveSum3(intList.tail)
    }

    def recursionApplied(): Int =
    {
        val someNumbers = List(111, 222, 333, 444, 555)
        this.recursiveSum3(someNumbers)
    }

    override def printOutput(): Unit =
        new ResultsPrinter("Recursion").printDetail(this.recursionApplied())
}
