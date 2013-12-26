/**
 * Scala Learn
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
package scalalearn

import scala.collection.mutable.ListBuffer

object ForAndWhile extends LearningModule {
     
    val someNumbers = Array(1,2,3,4,5)
    val results1 = new ListBuffer[Int]()
    val results2 = new ListBuffer[Int]()
    val results3 = new ListBuffer[Int]()
    val results4 = new ListBuffer[Int]()
    val results5 = new ListBuffer[Int]()
    
    // Iterate over a list
    for (j <- someNumbers) {
        results1.append(j)
    }
    
    // Indices: get item at without using a var...
    for (k <- someNumbers.indices) {
        results2.append(someNumbers(k))
    }
    
    // Classic for
    for (i <- 1 to 4) {
    	results3.append(i)
    }
    
    // Filtering
    for (
            i <- 1 until 20
            if (i % 2 == 0)
    	) {
        results4.append(i)
    }
    
    // While
    var a = 150
    var b = 40
    while (a != 0) {
    	val temp = a
    	a = b % a
    	b = temp
    	results5.append(b)
    }
            
    def printOutput() {
        new ResultsPrinter("FOR 1/3").printDetails(results1.toList.iterator)
        new ResultsPrinter("FOR 2/3").printDetails(results2.toList.iterator)
        new ResultsPrinter("FOR 3/3").printDetails(results3.toList.iterator)
        new ResultsPrinter("FOR 3/3").printDetails(results4.toList.iterator)
        new ResultsPrinter("WHILE").printDetails(results5.toList.iterator)
    }

}