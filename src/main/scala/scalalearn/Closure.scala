/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/**
 * A closure is a persistent scope which holds on
 * to local variables even after the code execution
 * has moved out of that block.
 */
object Closure extends LearningModule
{

    var someNumbers = List(11, 10, 5, 0, 5, 10)

    // Closure: the variable 'someNumbers' is FREE.
    // When "closure" it's called, it takes the most recent
    // value of someNumbers
    val closure: (Int) => List[Int] = (f: Int) =>
    {
        someNumbers.filter(_ > f)
    }

    def printOutput(): Unit =
    {

        val test = new ResultsPrinter("CLOSURE")
        val result = closure(5)
        for (oInt <- result)
        {
            test.addResult("Value = %d".format(oInt))
        }
        test.print()

    }

}
