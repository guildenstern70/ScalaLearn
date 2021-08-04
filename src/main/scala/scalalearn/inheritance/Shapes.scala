/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.LearningModule

object Shapes extends LearningModule {
  // scalastyle:off println
  def printOutput(): Unit = {
    println("** TEST Inheritance **")

    val shapes: List[Option[Shape]] = List(
      ShapeFactory.create(ShapeType.Circle),
      ShapeFactory.create(ShapeType.Triangle),
      ShapeFactory.create(ShapeType.Square)
    )

    shapes.foreach(shape => {
      shape match {
        case Some(shape) => {
          println(" -> " + shape.toString)
          println(" -> Area = " + shape.area.toString)
          println()
        }
        case None => println("Unknown shape")
      }
    })
  }
  // scalastyle:on println

}
