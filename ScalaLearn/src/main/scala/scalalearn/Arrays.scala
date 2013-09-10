package scalalearn

object Arrays extends LearningModule {
    
    // Arrays map one-to-one with Java arrays (ie.: int[])
    var myArray1 = Array(1,2,3,4)
    
    // Read item
    val item2 = myArray1(2)
    
    // Write item
    myArray1(2) = 18
    
    // Arrays can be generic
    // Initialization
    var myArray2: Array[String] = Array.fill[String](2)("")
    myArray2(0) = "Alessio"
    myArray2(1) = "Saltarin"
        
    
    
    def printOutput() {
        new ResultsPrinter("ARRAY 1/2").printDetails(myArray1.iterator)
        new ResultsPrinter("ARRAY 2/2").printDetails(myArray2.iterator)
    }

}