package net.littlelite.scalalearn

import scala.collection.mutable.ListBuffer

object ListAndTuple {

    // List => Immutable collection of objects of the same type
    var myList1 = List(1, 2, 3)
    
    // Building List => First way: prepend / append directly
    myList1 = 0 :: myList1 // Prepend OK
    myList1 = myList1 :+ 4 // Append Slow!
    
    // Building List => Second way: using ListBuffer
    val myListBuilder = new ListBuffer[Int]()
    myListBuilder.append(1)
    myListBuilder.append(2)
    myListBuilder.append(3)
    myListBuilder.append(4)
    val myList2 = myListBuilder.toList
    
    // Tuple => Immutable list of objects of different types
    val myTuple = (77, "Alessio", 345.7)
    // You may access elements with myTuple._1. Attention: tuple is one-based (myTuple._2 == "Alessio")
    
    def test {
    	      
    	def printDetails(test: PrintTest, results: Iterator[Any]) {
    		results.foreach { i => test.addResult("> Value = %s".format(i.toString)) }
    		test.print
    	}
        
        printDetails( new PrintTest("LIST 1/2"), myList1.iterator );
        printDetails( new PrintTest("LIST 2/2"), myList2.iterator );
        printDetails( new PrintTest("TUPLE"), myTuple.productIterator );
        
    }


}