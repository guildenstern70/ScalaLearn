/**
 * ScalaLearn
 *
 * Copyright (C) Alessio Saltarin - 2013-21
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
 * By name parameters allows to
 * pass - instead of a function as it happens with High Order Functions -
 * a "piece of code" inside a function.
 * The syntax is:
 * def myFunction(pieceOfCode: => A)
 */
object ByNameParam extends LearningModule
{

    def functionWithParamByName(pieceOfCode: => Unit): Unit =
    {
        println("Do some stuff before calling piece of code...")
        pieceOfCode
        println("... Ok, done.")
    }

    def callByName(): Unit =
    {
        functionWithParamByName(println("Hi everybody!"))
    }

    def printOutput(): Unit =
    {
        callByName()
    }

}
