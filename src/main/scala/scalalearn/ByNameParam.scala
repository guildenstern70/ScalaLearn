/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/**
 * By name parameters allows to
 * pass - instead of a function as it happens with High Order Functions -
 * a "piece of code" inside a function.
 * The syntax is:
 * def myFunction(pieceOfCode: => A)
 */
object ByNameParam extends LearningModule
{

    def functionWithParamByName(pieceOfCode: => Unit): Unit =
    {
        println("Do some stuff before calling piece of code...")
        pieceOfCode
        println("... Ok, done.")
    }

    def callByName(): Unit =
    {
        functionWithParamByName(println("Hi everybody!"))
    }

    def printOutput(): Unit =
    {
        callByName()
    }

}
