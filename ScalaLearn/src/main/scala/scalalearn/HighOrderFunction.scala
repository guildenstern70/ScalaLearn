/**
 * Scala Learn
 *
  * Copyright (C) Alessio Saltarin - 2013-16
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

object HighOrderFunction extends LearningModule {
    
    // Area pentagono: l*5* (l*0,688) / 2 = l^2 * 1,72
    // Area esagono: l * (l * 0,866) * 3 = l^2 * 2,598
    
    val pentagonoComputer = (lato: Double) => { lato * lato * 1.72f }
    val esagonoComputer = (lato: Double) => { lato * lato * 2.598f }
    
     // polyAreaComputer is a higher class function: a function that takes in input another function
    def polyAreaComputer(lato: Double, 
            	         areaCompute: (Double => Double)): Double = {
        areaCompute(lato)        
    }

    def printOutput {
        
        val latoPentagono: Double = 5.0f
        val latoEsagono: Double = 6.0f
        
        new ResultsPrinter("HighOrder 1/2").printDetail(polyAreaComputer(latoPentagono, pentagonoComputer))
        new ResultsPrinter("HighOrder 2/2").printDetail(polyAreaComputer(latoEsagono, esagonoComputer))
        
    }

}