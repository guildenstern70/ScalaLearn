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
  * Option is the preferred way to handle nullable types
  */
object Options extends LearningModule
{

    def removeExcept(someString: String): Option[String] =
    {
        if (someString.startsWith("!"))
        {
            return None
        }

        Some(someString.substring(1))
    }

    def printOutput(): Unit =
    {

        val test = new ResultsPrinter("OPTIONS")

        val first = "-This is OK"
        val second = "!This is KO"

        val removeOne: Option[String] = removeExcept(first)
        val removeTwo: Option[String] = removeExcept(second)

        var removeOneResult: String = "This is not defined (None)"
        var removeTwoResult: String = "This is not defined (None)"

        if (removeOne.isDefined)
        {
            removeOneResult = removeOne.get
        }

        if (removeTwo.isDefined)
        {
            removeTwoResult = removeTwo.get
        }

        test.addResult(removeOneResult)
        test.addResult(removeTwoResult)

        test.print()
    }

}
