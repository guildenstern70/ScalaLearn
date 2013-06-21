package net.littlelite.scalalearn.traits

import net.littlelite.scalalearn.ClassTemplate

/**
 * This trait will modify any class descending from ClassTemplate
 * with a method named 'nameOfClass' returning a String.
 */
trait StackableTrait extends ClassTemplate {
    
    abstract override def nameOfClass: String = {
        return "NewName (was: " + this.className + ")"
    }

}