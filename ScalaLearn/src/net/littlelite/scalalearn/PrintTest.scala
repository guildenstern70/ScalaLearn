package net.littlelite.scalalearn

import scala.collection.mutable.ListBuffer

class PrintTest(testName: String) {
    
    val results = new ListBuffer[String]
    
    def addResult(result: String) {
        results.append(result)
    }
   
    def print() {
        
        val testOutput : List[String] = this.results.toList
        
        println()
        println("** TEST %s **".format(testName))

        for (result <- testOutput) {
            println(result)
        }
        println()
    }

}