package net.littlelite.scalalearn

//import scala.collection.mutable.Set;

object MutableAndImmutableSet {
    
    // Set => Depends on import: mutable or immutable
    // by default Set is immutable.
    
    // MUTABLE => The collection can mutate (add or remove elements)
    
    // IMMUTABLE => The collection cannot mutate (even if you CAN STILL modify the
    // collection, but it takes time!! As in Java String)
    val s1 = "Boeing"
    val s2 = "Airbus"
        
    var jetSet: Set[String] = Set(s1, s2)
    jetSet += "Lear"
        
    def test {
        
        val test = new PrintTest("SET")
        val jetSetVal = this.jetSet;
        for (s <- jetSetVal) {
            test.addResult("> Value = %s".format(s))
        }
        test.print
    }

}