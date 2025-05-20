/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

class Square(override val shapeName: String, val shapeSide: Double)
    extends Shape(shapeName) {

  override def area: Double = {
    this.shapeSide * this.shapeSide
  }

  override def shapeType: ShapeType = ShapeType.Square

}
