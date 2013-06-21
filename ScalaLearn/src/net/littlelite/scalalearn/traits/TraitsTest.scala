package net.littlelite.scalalearn.traits

import net.littlelite.scalalearn.ClassTemplate
import net.littlelite.scalalearn.PrintTest

object TraitsTest {
    
    class ClassWithTraits extends Speaking with Dancing {
        
	    def test() {
	        this.speak;
	        this.dance;
	    }
	    
    }
    
    class StackedModifications(smName: String, smSurname: String) 
    	extends ClassTemplate(smName, smSurname) with StackableTrait
    
    val classWTraits = new TraitsTest.ClassWithTraits
    val classWStackableTrait = new TraitsTest.StackedModifications("Pippo", "Rossi")
    
    def test() {
        
        val test = new PrintTest("Traits")  
        
        test += "This object speaks and dance:"
        test += classWTraits.speak
        test += classWTraits.dance
        test += "This one has a stackable (added, mixed) trait:"
        test += classWStackableTrait.nameOfClass
        
        test.print
    }
    
}