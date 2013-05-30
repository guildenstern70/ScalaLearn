package net.littlelite.scalalearn

import scala.collection.mutable.ListBuffer

class PrintTest(testName: String) {
    
    val results = new ListBuffer[String]
    
    def addResult(result: String) {
        results.append(result)
    }
    
    def printDetail(result: Any) {
        this.addResult(result.toString)
        this.print
    }
    
    def printDetails(results: Iterator[Any]) {
    		results.foreach { i => this.addResult("> Value = %s".format(i.toString)) }
    		this.print
    }
   
    def print() {
        
        val testOutput: List[String] = this.results.toList
        
        def resultsString = testOutput.mkString(sys.props("line.separator"))
        
        println()
        println("** TEST %s **".format(testName))
        println(resultsString)
    }

}