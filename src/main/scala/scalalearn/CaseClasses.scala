//
// ScalaLearn
//
// Copyright (C) Alessio Saltarin - 2013-21
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//
package scalalearn

object CaseClasses extends LearningModule
{

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

    def printOutput(): Unit =
    {

        val results = new ResultsPrinter("CASE CLASSES")
        results += "Class name = " + CaseClasses.maria.toString
        results += "Class name = " + CaseClasses.elena.toString
        results += "Hash Code = " + CaseClasses.maria.hashCode
        results += "Name = " + CaseClasses.elena.name
        results += this.whoWas(this.maria)
        results += this.whoWas(this.elena)
        results.print()

    }

    def whoWas(p: Persona): String = s"${p.name} ${p.surname} ${this.matchingPersona(p)}"

    // Case classes simple match
    def matchingPersona(p: Persona): String = p match
    {
        case Persona("Maria", "Callas") => "was a great singer."
        case _ => "was unknown to most."
    }



}
