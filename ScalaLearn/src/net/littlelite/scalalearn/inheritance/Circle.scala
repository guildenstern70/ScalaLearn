package net.littlelite.scalalearn.inheritance

import ShapeType._

class Circle(
        override val shapeName: String,
        val shapeRadius: Double
        ) extends Shape(shapeName) {
    
    override def area: Double = { this.shapeRadius * this.shapeRadius * Math.PI }
    override def shapeType: ShapeType = ShapeType.Circle

}