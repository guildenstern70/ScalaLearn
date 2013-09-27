/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013
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
 * @parameter pName: A parameter
 * @parameter pSurname: Another parameter
 */
class ClassTemplate(pName: String, pSurname: String) {

    // Constructor
    protected val objName = pName;
    protected val objSurname = pSurname;

    // Preconditions
    require(pName != null)
    require(pSurname != null)

    // Auxiliary constructor
    def this() = this("Unknown", "Unknown")

    // Properties
    def name: String = this.objName
    def surname: String = this.objSurname

    // Methods
    // Parameters are VAL not VAR
    // Also note the return type = Int
    def newFunction(a: Int, b: Int): Int = {
        if (a > b)
            a
        else
            b
    }

    // Overridden method
    override def toString(): String = {
        val sb = new StringBuilder()
        sb.append("Object of ClassWithFunctions = ")
        sb.append(this.name)
        sb.append(' ')
        sb.append(this.surname)
        sb.toString
    }

}