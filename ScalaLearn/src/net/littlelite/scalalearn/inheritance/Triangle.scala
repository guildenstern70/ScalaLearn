package net.littlelite.scalalearn.inheritance

import ShapeType._

class Triangle(
        override val shapeName: String,
        val shapeBase: Double,
        val shapeHeight: Double
        ) extends Shape(shapeName) {
    
    override def area: Double = { (this.shapeBase * this.shapeHeight) / 2.0f  } 
    override def shapeType: ShapeType = ShapeType.Triangle

}