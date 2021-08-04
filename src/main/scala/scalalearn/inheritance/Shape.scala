/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

// Notice how we use 'parametric fields' instead of parameters
class Shape(val shapeName: String) extends AbstractClass {
  override def name: String = this.shapeName

  override def area: Double = -1.0f
  override def toString: String = this.shapeName
  def shapeType: ShapeType = ShapeType.Unknown
}
