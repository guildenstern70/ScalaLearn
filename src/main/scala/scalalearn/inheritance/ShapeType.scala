/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.inheritance

import scalalearn.inheritance

object ShapeType extends Enumeration {
  type ShapeType = Value

  val Circle: inheritance.ShapeType.Value = Value("Circle")
  val Square: inheritance.ShapeType.Value = Value("Square")
  val Triangle: inheritance.ShapeType.Value = Value("Triangle")
  val Unknown: inheritance.ShapeType.Value = Value("Unknown")
}
