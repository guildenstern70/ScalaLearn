/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
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
