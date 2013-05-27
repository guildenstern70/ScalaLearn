package net.littlelite.scalalearn

object FirstClassFunctions {
    
    val areaDelCerchio = (raggio: Double) => { raggio*raggio*Math.PI }
    
    def test() {
        
        val test = new PrintTest("FIRST CLASS FUNCTION")
        val result = areaDelCerchio(10).toString
        test.addResult(" Area del cerchio di raggio 10 => %s ".format(result))      
        test.print

    }

}