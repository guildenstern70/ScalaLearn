package net.littlelite.scalalearn.inheritance

import ShapeType._

// Notice how we use 'parametric fields' instead of parameters
class Shape(
        val shapeName: String
        ) extends AbstractClass {
    
    override def name: String = this.shapeName 
    override def area: Double = -1.0f
    
    override def toString: String = this.shapeName
    
    def shapeType: ShapeType = ShapeType.Unknown

}