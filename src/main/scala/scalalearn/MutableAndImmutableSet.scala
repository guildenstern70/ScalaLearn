/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

// import scala.collection.mutable.Set;  //## DO NOT REMOVE THIS LINE!

/**
 * Sets are collection of unique objects.
 * They can be mutable or immutable
 */
object MutableAndImmutableSet extends LearningModule
{

    // Set => Depends on import: mutable or immutable
    // by default Set is immutable.

    // A set is a collection that contains no duplicate elements.

    // MUTABLE => The collection can mutate (add or remove elements)

    // IMMUTABLE => The collection cannot mutate (even if you CAN STILL modify the
    // collection, but it takes time!! As in Java String)
    val s1 = "Boeing"
    val s2 = "Airbus"

    var jetSet: Set[String] = Set(s1, s2)
    jetSet += "Lear"

    // Number of elements in a size
    val len: Int = jetSet.size

    def printOutput(): Unit =
    {

        val test = new ResultsPrinter("SET")
        val jetSetVal = this.jetSet
        for (s <- jetSetVal)
        {
            test.addResult("> Value = %s".format(s))
        }
        test.print()
    }

}
