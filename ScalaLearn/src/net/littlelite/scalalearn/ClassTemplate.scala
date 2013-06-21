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
package net.littlelite.scalalearn

class ClassTemplate(name: String, surname: String) {
    
    // Constructor
    protected val className = name;
    protected val classSurname = surname;
    
    // Auxiliary constructor
    def this() = this("Null", "Null")
    
    // Preconditions
    require(name != null)
    require(surname != null)
    
    // Properties
    def nameOfClass: String = this.className
    def surnameOfClass: String = this.classSurname
    
    // Methods
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
        sb.append(ClassTemplate.this.name)
        sb.append(' ')
        sb.append(ClassTemplate.this.surname)
        sb.toString
    }
    
}