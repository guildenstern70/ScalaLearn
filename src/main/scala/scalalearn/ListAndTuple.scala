/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scala.collection.mutable.ListBuffer

/** List and Tuples. Object collections.
  */
object ListAndTuple extends LearningModule {

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
  myListBuilder += 3
  myListBuilder += 4
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

  def printOutput(): Unit = {
    new ResultsPrinter("LIST 1/2").printDetails(myList1.iterator)
    new ResultsPrinter("LIST 2/2").printDetails(myList2.iterator)
    new ResultsPrinter("TUPLE").printDetails(myTuple.productIterator)
  }

}
