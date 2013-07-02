package net.littlelite.scalalearn.inheritance

import ShapeType._
import net.littlelite.scalalearn.LearningModule

object ShapesTest extends LearningModule {
    
    def printOutput {
        
        println("** TEST Inheritance **")
        
        val shapes: List[Shape] = List(
                ShapeFactory.create(ShapeType.Circle),
                ShapeFactory.create(ShapeType.Triangle),
                ShapeFactory.create(ShapeType.Square)
                )
                
        shapes.foreach( shape => {
            
            	println(" -> " + shape.toString)
            	println(" -> Area = " + shape.area.toString)
            	println()
            
        	})
    }
        

}