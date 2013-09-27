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

object Arrays extends LearningModule {
    
    // Arrays map one-to-one with Java arrays (ie.: int[])
    var myArray1 = Array(1,2,3,4)
    
    // Read item
    val item2 = myArray1(2)
    
    // Write item
    myArray1(2) = 18
    
    // Arrays can be generic
    // Initialization
    var myArray2: Array[String] = Array.fill[String](2)("")
    myArray2(0) = "Alessio"
    myArray2(1) = "Saltarin"
        
    def printOutput() {
        new ResultsPrinter("ARRAY 1/2").printDetails(myArray1.iterator)
        new ResultsPrinter("ARRAY 2/2").printDetails(myArray2.iterator)
    }

}