package net.littlelite.scalalearn.inheritance

object ShapeType extends Enumeration {
    
    type ShapeType = Value

	val Circle = Value("Circle")
	val Square = Value("Square")
	val Triangle = Value("Triangle")
	val Unknown = Value("Unknown")
	
}