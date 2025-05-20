/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

object ShapeFactory {

  def create(shapeType: ShapeType): Option[Shape] = {
    shapeType match {
      case ShapeType.Circle => Some(new Circle("Circle", this.randomDouble))
      case ShapeType.Triangle =>
        Some(new Triangle("Triangle", this.randomDouble, this.randomDouble))
      case ShapeType.Square => Some(new Square("Square", this.randomDouble))
      case _                => None
    }
  }

  def randomDouble: Double = {
    Math.random() * 10
  }

}
