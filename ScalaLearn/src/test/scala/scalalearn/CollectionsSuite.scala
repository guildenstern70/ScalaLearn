/**
 * Scala Learn Tests
 *
 * Copyright (C) Alessio Saltarin - 2013
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package scalalearn.test

import org.scalatest.junit.JUnitSuite
import org.scalatest.FunSuite
import org.junit.Test
import scalalearn.ListAndTuple
import scalalearn.ClassTemplate

/**
 * A simple JUnit-style test class
 */
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