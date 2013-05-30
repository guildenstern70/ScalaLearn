package net.littlelite.scalalearn

object MapForEachAndSoOn {
    
    val numeri: List[Int] = List(1, 2, 3, 4, 5, 6)
    
    def numeriMapped() = numeri.map( x => x*2 )
    
    def numeriSum() = numeri.sum
    
    def numeriForEach() = {
        var sum = 0
        numeri.foreach( x => sum += x )
        sum
    }
    
    def test() {
        new PrintTest("List Map").printDetails(numeriMapped().iterator)
        new PrintTest("List Sum").printDetail(numeriSum())
        new PrintTest("List ForEach").printDetail(numeriForEach())
    }
    

}