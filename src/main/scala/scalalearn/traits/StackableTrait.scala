/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.traits

import scalalearn.ClassTemplate

/** This trait will modify any class descending from ClassTemplate with a method
  * named 'name' returning a String.
  *
  * A 'stackable' trait:
  *   1. Overrides an existing method of the extending class 2. Declares the new
  *      method as 'abstract' 3. Can call the existing method with 'super'
  */
trait AddXXXStackableTrait extends ClassTemplate {
  abstract override def name: String = super.name + " [XXX]"
}

trait AddYYYStackableTrait extends ClassTemplate {
  abstract override def name: String = super.name + " [YYY]"
}
