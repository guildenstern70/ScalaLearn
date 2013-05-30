package net.littlelite.scalalearn.inheritance

import ShapeType._

object ShapeFactory {
    
    def create(shapeType: ShapeType): Shape = {
        
        shapeType match {
			case ShapeType.Circle => new Circle("Circle", this.randomDouble)
			case ShapeType.Triangle => new Triangle("Triangle", this.randomDouble, this.randomDouble)
			case ShapeType.Square => new Square("Square", this.randomDouble)
			case _ => null
        }
        
    }
    
    def randomDouble: Double = { Math.random() * 10 }

}