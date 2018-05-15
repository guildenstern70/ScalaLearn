/**
  * Scala Learn
  *
  * Copyright (C) Alessio Saltarin - 2013-18
  *
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  *
  */

package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

// Notice how we use 'parametric fields' instead of parameters
class Shape(val shapeName: String) extends AbstractClass
{
    override def name: String = this.shapeName
    override def area: Double = -1.0f
    override def toString: String = this.shapeName
    def shapeType: ShapeType = ShapeType.Unknown
}
