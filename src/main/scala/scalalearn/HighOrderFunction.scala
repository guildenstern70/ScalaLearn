/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-21
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

object HighOrderFunction extends LearningModule
{
    // Pentagon area formula: l*5* (l*0,688) / 2 = l^2 * 1,72
    val pentagonComputer: Double => Double = (side: Double) =>
    {
        side * side * 1.72f
    }

    // Hexagon area formula: l * (l * 0,866) * 3 = l^2 * 2,598
    val hexagonComputer: Double => Double = (side: Double) =>
    {
        side * side * 2.598f
    }

    // polyAreaComputer is a higher class function: a function that
    // takes in input another function
    def polyAreaComputer(side: Double,
                         areaCompute: Double => Double): Double =
    {
        areaCompute(side)
    }

    def printOutput(): Unit =
    {
        val pentagonSide: Double = 5.0f
        val hexagonSide: Double = 6.0f
        new ResultsPrinter("HighOrder 1/2").
                printDetail(polyAreaComputer(pentagonSide, pentagonComputer))
        new ResultsPrinter("HighOrder 2/2").
                printDetail(polyAreaComputer(hexagonSide, hexagonComputer))
    }

}
