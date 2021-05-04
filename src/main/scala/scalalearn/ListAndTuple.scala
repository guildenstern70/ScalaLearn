/**
 * ScalaLearn
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

/**
  * List and Tuples.
  * Object collections.
  */
object ListAndTuple extends LearningModule
{

    // List => Immutable collection of objects of the same type
    var myList1 = List(1, 2, 3)

    // Building List => First way: prepend / append directly
    myList1 = 0 :: myList1 // Prepend OK
    myList1 = myList1 :+ 4 // Append Slow!

    // Number of elements
    val len: Int = myList1.length

    // Building List => Second way: using ListBuffer
    val myListBuilder = new ListBuffer[Int]()
    myListBuilder.append(1)
    myListBuilder.append(2)
    myListBuilder.append(3)
    myListBuilder.append(4)
    val myList2: List[Int] = myListBuilder.toList

    /* Iterating lists
        myList1.foreach( aNum =>
            println(aNum)
        )
    */

    // Tuple => Immutable list of objects of different types
    val myTuple: (Int, String, Double) = (77, "Alessio", 345.7)
    // You may access elements with myTuple._1
    // Attention: tuple is one-based (myTuple._2 == "Alessio")

    // Iterating tuples
    // iterator => myTuple.productIterator
    // List[Any] => myTuple.productIterator.toList


    def printOutput(): Unit =
    {
        new ResultsPrinter("LIST 1/2").printDetails(myList1.iterator)
        new ResultsPrinter("LIST 2/2").printDetails(myList2.iterator)
        new ResultsPrinter("TUPLE").printDetails(myTuple.productIterator)
    }

}
