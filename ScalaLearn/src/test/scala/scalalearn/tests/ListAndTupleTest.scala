package scalalearn.tests

import org.junit.Test
import org.scalatest.junit.JUnitSuite
import scalalearn.ListAndTuple
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._


class ListAndTupleTest extends JUnitSuite {
    
    @Test
    def testList1() {

        TestUtils.iteratorTest(ListAndTuple.myList1, List(0, 1, 2, 3, 4))

    }
    
    @Test
    def testList2() {

        TestUtils.iteratorTest(ListAndTuple.myList2, List(1, 2, 3, 4))

    }
    
    @Test
    def testTuple() {

        val oneT = ListAndTuple.myTuple._1
        val twoT = ListAndTuple.myTuple._2
        val threeT = ListAndTuple.myTuple._3
        
        val oneE: Int = 77
        val twoE: String = "Alessio"
        val threeE: Double = 345.7
        
        val oneMsg = "%s should be equal to %s".format(oneT.toString, oneE.toString)
        val twoMsg = "%s should be equal to %s".format(twoT.toString, twoE.toString)
        val threeMsg = "%s should be equal to %s".format(threeT.toString, threeE.toString)
        
        assertEquals(oneMsg, oneT, oneE)
        assertEquals(twoMsg, twoT, twoE)
        assertEquals(threeMsg, threeT, threeE, 0.01)
        

    }
    

}