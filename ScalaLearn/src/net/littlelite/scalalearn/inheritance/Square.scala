package net.littlelite.scalalearn.inheritance

import ShapeType._

class Square(
        override val shapeName: String,
        val shapeSide: Double
        ) extends Shape(shapeName) {
    
    override def area: Double = { this.shapeSide * this.shapeSide } 
    override def shapeType: ShapeType = ShapeType.Square

}