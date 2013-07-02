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
package net.littlelite.scalalearn

object Currying extends LearningModule {
    
    def printTestMessages(testName: String, messages: List[String])(joiner: List[String] => String) {
                
        val resultsString = joiner(messages)
        
        println()
        println("** TEST %s **".format(testName))
        println(resultsString)
        println()
    }
    
    def example() {
        
        val messages = List("Ciao","Mondo")
        
        printTestMessages("Prova Test", messages) {
            (messages: List[String]) => messages.mkString(sys.props("line.separator"))
        }        
    }
    
    def printOutput {
        this.example
    }
    

}