/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

object CaseClasses extends LearningModule {

  // Case class.
  //
  // 1. No need to instantiate with 'new'
  // 2. Parameters are treated as fields (get automatic getters)
  // 3. The class gets hashCode(), toString() and equals()
  // 4. The class gets copy() to fast generate copied objects (useful for FP!)
  // 5. The class supports pattern matching
  // 6. Parameter can be specified by name
  case class Persona(name: String, surname: String)

  val maria: Persona = Persona(surname = "Callas", name = "Maria")
  val elena: Persona = maria.copy("Elena")

  def printOutput(): Unit = {

    val results = new ResultsPrinter("CASE CLASSES")
    results += "Class name = " + CaseClasses.maria.toString
    results += "Class name = " + CaseClasses.elena.toString
    results += "Hash Code = " + CaseClasses.maria.hashCode
    results += "Name = " + CaseClasses.elena.name
    results += this.whoWas(this.maria)
    results += this.whoWas(this.elena)
    results.print()

  }

  def whoWas(p: Persona): String =
    s"${p.name} ${p.surname} ${this.matchingPersona(p)}"

  // Case classes simple match
  def matchingPersona(p: Persona): String = p match {
    case Persona("Maria", "Callas") => "was a great singer."
    case _                          => "was unknown to most."
  }

}
