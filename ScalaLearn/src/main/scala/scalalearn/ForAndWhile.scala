package scalalearn

import scala.collection.mutable.ListBuffer

object ForAndWhile extends LearningModule {
     
    val someNumbers = Array(1,2,3,4,5)
    val results1 = new ListBuffer[Int]()
    val results2 = new ListBuffer[Int]()
    val results3 = new ListBuffer[Int]()
    val results4 = new ListBuffer[Int]()
    
    // Iterate over a list
    for (j <- someNumbers) {
        results1.append(j)
    }
    
    // Classic for
    for (i <- 1 to 4) {
    	results2.append(i)
    }
    
    // Filtering
    for (
            i <- 1 until 20
            if (i % 2 == 0)
    ) {
        results3.append(i)
    }
    
    // While
    var a = 150
    var b = 40
    while (a != 0) {
    	val temp = a
    	a = b % a
    	b = temp
    	results4.append(b)
    }
            
    def printOutput() {
        new ResultsPrinter("FOR 1/3").printDetails(results1.toList.iterator)
        new ResultsPrinter("FOR 2/3").printDetails(results2.toList.iterator)
        new ResultsPrinter("FOR 3/3").printDetails(results3.toList.iterator)
        new ResultsPrinter("WHILE").printDetails(results4.toList.iterator)
    }

}