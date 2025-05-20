/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** In computer science, currying, invented by Moses Schonfinkel and Gottlob
  * Frege, is the technique of transforming a function that takes multiple
  * arguments into a function that takes a single argument * (the other
  * arguments having been specified by the curry).
  */
object Currying extends LearningModule {

  private def formatTestMessages(
      messages: List[String]
  )(joiner: () => String): String = {
    messages.mkString(joiner())
  }

  // scalastyle:off println
  private def example(): Unit = {
    val messages = List("One", "Two", "Three")
    val dashSeparator = () => {
      " - "
    }
    val blablaSeparator = () => {
      " [$$] "
    }
    println(formatTestMessages(messages)(dashSeparator))
    println(formatTestMessages(messages)(blablaSeparator))
  }

  def printOutput(): Unit = {
    println()
    println("** TEST CURRYING **")
    this.example()
    println()
  }
  // scalastyle:on println
}
