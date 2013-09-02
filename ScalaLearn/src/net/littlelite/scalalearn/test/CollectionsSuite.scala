package net.littlelite.scalalearn.test

/**
import org.scalatest.Suite
import net.littlelite.scalalearn.ListAndTuple

class CollectionsSuite extends Suite {

    def iteratorTest(results: Iterator[Any], expectedResults: List[Any]) {
        var j = 0
        results.foreach { i =>
            assert(i === expectedResults(j))
            j += 1
        }
    }

    def testCollections() {

        val iterator1 = ListAndTuple.myList1.iterator
        iteratorTest(iterator1, List(0, 1, 2, 3, 4))

    }
}
*/