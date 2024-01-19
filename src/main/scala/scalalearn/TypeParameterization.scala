/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */

package scalalearn


object TypeParameterization extends LearningModule {

  private val message = "message"
  private val list = List(1, 2, 3)

  private def elemType[T](elem: T): String = elem.getClass().toString

  override def printOutput(): Unit = {

    val printer = new ResultsPrinter("Type Parameterization")
    printer.addResult(this.elemType(message))
    printer.addResult(this.elemType(list))
    printer.print()

  }

}
