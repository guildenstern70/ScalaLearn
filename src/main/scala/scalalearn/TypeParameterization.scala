/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */

package scalalearn


object TypeParameterization extends LearningModule {

  val message = "message"
  val list = List(1, 2, 3)

  def elemType[T](elem: T) = elem.getClass()

  override def printOutput(): Unit = {

    val printer = new ResultsPrinter("Type Parameterization")
    printer.printDetail(this.elemType(message))
    printer.printDetail(this.elemType(list))

  }

}
