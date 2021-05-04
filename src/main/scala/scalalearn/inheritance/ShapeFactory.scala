// ScalaLearn
//
// Copyright (C) Alessio Saltarin - 2013-21
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
package scalalearn.inheritance

import scalalearn.inheritance.ShapeType.ShapeType

object ShapeFactory
{

    def create(shapeType: ShapeType): Option[Shape] =
    {
        shapeType match
        {
            case ShapeType.Circle => Some(
                new Circle("Circle", this.randomDouble))
            case ShapeType.Triangle => Some(
                new Triangle("Triangle",
                                                    this.randomDouble,
                                                    this.randomDouble))
            case ShapeType.Square => Some(
                new Square("Square", this.randomDouble))
            case _ => None
        }
    }

    def randomDouble: Double =
    {
        Math.random() * 10
    }

}
