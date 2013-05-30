/**
 * Scala Learn
 * Alessio Saltarin - 2013 
 */
package net.littlelite.scalalearn

/**
 * Main launcher
 *
 */
object Main {
  
	final val VERSION = "v.0.1.1048" 
    
    def main(args: Array[String]) {
    	println("ScalaLearn %s".format(VERSION))
    	
    	ListAndTuple.test
    	MutableAndImmutableSet.test
    	FirstClassFunctions.test
    	Closure.test
    	MapForEachAndSoOn.test
    	HighOrderFunction.test
    }

}