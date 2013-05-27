package net.littlelite.scalalearn

object FirstClassFunctions {
    
    val areaDelCerchio = (raggio: Double) => { raggio*raggio*Math.PI }
    
    def test() {
        
        val test = new PrintTest("FIRST CLASS FUNCTION")
        val result = areaDelCerchio(10).toString
        test.addResult("> Circle area with radius = 10 => %s ".format(result))      
        test.print

    }

}