/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** Option is the preferred way to handle nullable types
  */
object Options extends LearningModule {

  def removeExcept(someString: String): Option[String] = {
    if (someString.startsWith("!")) {
      return None
    }

    Some(someString.substring(1))
  }

  def printOutput(): Unit = {

    val test = new ResultsPrinter("OPTIONS")

    val first = "-This is OK"
    val second = "!This is KO"

    val removeOne: Option[String] = removeExcept(first)
    val removeTwo: Option[String] = removeExcept(second)

    var removeOneResult: String = "This is not defined (None)"
    var removeTwoResult: String = "This is not defined (None)"

    removeOneResult = removeOne.getOrElse("Unknown")
    removeTwoResult = removeTwo.getOrElse("Unknown")

    test.addResult(removeOneResult)
    test.addResult(removeTwoResult)

    test.print()
  }

}
