package net.littlelite.scalalearn

object HighOrderFunction {
    
    // Area pentagono: l*5* (l*0,688) / 2 = l^2 * 1,72
    // Area esagono: l * (l * 0,866) * 3 = l^2 * 2,598
    
    val pentagonoComputer = (lato: Double) => { lato * lato * 1.72f }
    val esagonoComputer = (lato: Double) => { lato * lato * 2.598f }
    
    def polyAreaComputer(lato: Double, 
            	         areaCompute: (Double => Double)): Double = {
        areaCompute(lato)        
    }
    
    def test() {
        
        val latoPentagono: Double = 5.0f
        val latoEsagono: Double = 6.0f
        
        new PrintTest("HighOrder 1/2").printDetail(polyAreaComputer(latoPentagono, pentagonoComputer))
        new PrintTest("HighOrder 2/2").printDetail(polyAreaComputer(latoEsagono, esagonoComputer))
        
    }

}