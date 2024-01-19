/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

class Triangle(
    override val shapeName: String,
    val shapeBase: Double,
    val shapeHeight: Double
) extends Shape(shapeName) {

  override def area: Double = {
    (this.shapeBase * this.shapeHeight) / 2.0f
  }

  override def shapeType: ShapeType = ShapeType.Triangle

}
