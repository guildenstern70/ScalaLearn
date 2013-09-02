package scalalearn.test

import org.scalatest.junit.JUnitSuite
import org.scalatest.FunSuite
import org.junit.Test
import scalalearn.ListAndTuple
import scalalearn.ClassTemplate

class CollectionsSuite extends JUnitSuite  {

    def iteratorTest(results: Iterator[Any], expectedResults: List[Any]) {
        var j = 0
        results.foreach { i =>
            assert(i === expectedResults(j))
            j += 1
        }
    }
    
    @Test 
    def ClassTemplateTest() {
        
        val cTempl = new ClassTemplate("Alessio", "Saltarin")
        assert(cTempl.name == "Alessio")
        assert(cTempl.surname == "Saltarin")
        
    }

    @Test
    def CollectionsTest() {

        val iterator1 = ListAndTuple.myList1.iterator
        iteratorTest(iterator1, List(0, 1, 2, 3, 4))

    }
}