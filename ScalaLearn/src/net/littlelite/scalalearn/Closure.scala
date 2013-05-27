package net.littlelite.scalalearn

object Closure {
    
    var someNumbers = List(11, 10, 5, 0, 5, 10)
    
    // Closure: the variabile 'someNumbers' is FREE.
    // When "closure" it's called, it takes the most recent
    // value of someNumbers
    val closure = (f: Int) => { someNumbers.filter( _ > f) }
    
    def test() {
        val test = new PrintTest("CLOSURE")
        someNumbers = List(11, 10, 6, 10, 5, 10)
        val result = closure(5)
        for (oInt <- result) {
            test.addResult("Value = %d".format(oInt))
        }
        test.print
    }

}