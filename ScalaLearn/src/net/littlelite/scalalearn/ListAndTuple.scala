package net.littlelite.scalalearn

import scala.collection.mutable.ListBuffer

object ListAndTuple {

    // List => Immutable collection of objects of the same type
    var myList1 = List(1, 2, 3)
    myList1 = 0 :: myList1 // Prepend OK
    myList1 = myList1 :+ 4 // Append Slow!
    
    //var myList2
    val myListBuilder = new ListBuffer[Int]()
    myListBuilder.append(1)
    myListBuilder.append(2)
    myListBuilder.append(3)
    myListBuilder.append(4)
    val myList2 = myListBuilder.toList
    
    // Tuple => Immutable list of objects of different types
    val myTuple = (77, "Alessio", 345.7)
    
    def test {
        
        var test = new PrintTest("LIST 1/2")
        for (oInt <- myList1) {
            test.addResult("> Value = %d".format(oInt))
        }
        test.print
        
        test = new PrintTest("LIST 2/2")
        for (oInt <- myList2) {
            test.addResult("> Value = %d".format(oInt))
        }
        test.print
        
        test = new PrintTest("TUPLE")
        myTuple.productIterator.foreach { i => test.addResult("> Value = %s".format(i.toString)) }
        test.print
        
    }


}