/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-17
  *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package scalalearn

/**
 * A template for a common class in Scala
  *
  * @param pName    : A parameter
  * @param pSurname : Another parameter
 */
class ClassTemplate(pName: String, pSurname: String)
    extends LearningModule {

    // Constructor
    protected val objName: String = pName
    protected val objSurname: String = pSurname

    // Preconditions
    require(pName != null)
    require(pSurname != null)

    // Auxiliary constructor
    def this() = this("Unknown", "Unknown")

    // Methods
    // Parameters are VAL not VAR
    // Also note the return type = Int
    def newFunction(a: Int, b: Int): Int = {
        if (a > b)
            a
        else
            b
    }

    def printOutput {

        println("\n** TEST ClassTemplate **")
        println("Object of class ClassTemplate")
        println("Object toString => " + this.toString)
        println("Object hash => " + this.##)

        val th = new ClassTemplate("John", "Way")
        if (this == th)
        {
            println("This object is equal to " + th.toString)
        }

    }

    // Override 'Any' method: toString
    override def toString: String = s"[$name $surname]"


    // Override 'Any' method: equals (Any method '==' is final
    // and cannot be overridden
    override def equals(that: Any): Boolean = that match {
	    case that: ClassTemplate => this.isEqualTo(that)
	    case _ => false
	  }

    private def isEqualTo(that: ClassTemplate): Boolean = {

        var isEqual = false
        if (that.name.equalsIgnoreCase(this.name)) {
            if (that.surname.equalsIgnoreCase(this.surname)) {
                isEqual = true
            }
        }
        isEqual

    }

    // Properties
    def name: String = this.objName
    def surname: String = this.objSurname

    // Getters and setters
    // NOTE: both getter and setter must be present in order to work!
    private var _position = "Unknown"

    def position = _position  // Getter
    def position_=(value: String): Unit = _position = value // Setter

    // Override 'Any' method: hashCode (Any method '##' is final
    // and cannot be overridden
    override def hashCode(): Int = {
        var hash = 0

        for (c <- this.name)
            hash += c

        for (c <- this.surname)
            hash += c

        hash
    }

    // Static Methods: SCALA HAS NO STATIC METHODS IN CLASSES! Use 'object' as a factory...


}