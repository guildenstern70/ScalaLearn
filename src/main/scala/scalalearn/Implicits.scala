/**
 * Scala Learn
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
  * Implicit conversions do not need to be explicitly called.
  */
object Implicits extends LearningModule
{

    case class NumberString(number: String)

    implicit def NumberStringToNumber(d: NumberString): Int =
        d.number.toInt

    override def printOutput(): Unit =
    {

        val test = new ResultsPrinter("IMPLICIT CONVERSIONS")
        val impl = NumberString("23")

        // This should be 46
        val result = 2 * impl
        test.addResult(result.toString + " should be 46")
        test.print()
    }
}
