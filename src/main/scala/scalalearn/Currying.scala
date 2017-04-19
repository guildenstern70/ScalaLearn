/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-17
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

/**
 * In computer science, currying, invented by Moses Schonfinkel and Gottlob Frege, 
 * is the technique of transforming a function that takes multiple arguments into a 
 * function that takes a single argument  * (the other arguments having been 
 * specified by the curry).
 */
object Currying extends LearningModule {

    def formatTestMessages(messages: List[String])
                          (joiner: () => String) : String = {

        val strBuilder = new StringBuilder()
        
        for (message <- messages) {
        	strBuilder.append(message)
        	strBuilder.append(joiner())
        }
        	
        strBuilder.toString
        
    }

    def example() {

        val messages = List("One", "Two", "Three")
        
        val dashSeparator = () => { " - " }
        val blablaSeparator = () => { " [$$] " }

        println( formatTestMessages(messages) (dashSeparator) )
        println( formatTestMessages(messages) (blablaSeparator) )
     
    }

    def printOutput {
        println
        println("** TEST CURRYING **")
        this.example()
        println
    }

}