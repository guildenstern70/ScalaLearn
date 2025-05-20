/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

class Circle(override val shapeName: String, val shapeRadius: Double)
    extends Shape(shapeName) {
  override def area: Double = {
    this.shapeRadius * this.shapeRadius * Math.PI
  }
  override def shapeType: ShapeType = ShapeType.Circle
}
