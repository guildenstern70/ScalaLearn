package net.littlelite.scalalearn

class ClassWithFunctions(name: String, surname: String) {
    
    // Constructor
    private val className = name;
    private val classSurname = surname;
    
    // Auxiliary constructor
    def this() = this("Null", "Null")
    
    // Preconditions
    require(name != null)
    require(surname != null)
    
    // Functions (methods)
    // Parameters are VAL not VAR
    def newFunction(a: Int, b: Int): Int = {
        if (a > b)
            a
        else
            b
    }
    
    // Overridden method
    override def toString() : String = {
        val sb = new StringBuilder()
        sb.append("Object of ClassWithFunctions = ")
        sb.append(this.name)
        sb.append(' ')
        sb.append(this.surname)
        sb.toString
    }
    
}