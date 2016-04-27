package scalalearn.tests

import org.junit.Assert._

object TestUtils {
    
    def iteratorTest(results: Seq[Any], expectedResults: Seq[Any]) {
        
        for (j <- expectedResults.indices) {
            
            val one = results(j)
            val two = expectedResults(j)
            val msg = "%s should be equal to %s".format(one.toString, two.toString)
            assertEquals(msg, results(j), expectedResults(j))
   
        }
        
    }
    
}