package scalalearn

object CaseClasses extends LearningModule {
  
  // Case class.
  //
  // 1. No need to instantiate with 'new'
  // 2. Parameters are treated as fields (get automatic getters)
  // 3. The class gets hashCode(), toString() and equals()
  // 4. The class gets copy() to fast generate other objects
  // 5. The class supports pattern matching
  case class Persona(name: String, surname: String)
  
  val maria = Persona("Maria", "Callas")
  val elena = maria.copy("Elena")
  
  // Case classes simple match
  def matchingPersona(p: Persona): String = p match {
    case Persona("Maria","Callas") => " was a great singer."
    case _ => " was unknown to most."
  }
  
  def whoWas(p: Persona): String = p.name + " " + p.surname + this.matchingPersona(p)
  
  def printOutput {
    
    val results = new ResultsPrinter("CASE CLASSES")
    results += "Class name = " + CaseClasses.maria.toString()
    results += "Class name = " + CaseClasses.elena.toString()
    results += "Hash Code = " + CaseClasses.maria.hashCode()
    results += "Name = "+ CaseClasses.elena.name
    results += this.whoWas(this.maria)
    results += this.whoWas(this.elena)
    results.print()
      
  }
  

}