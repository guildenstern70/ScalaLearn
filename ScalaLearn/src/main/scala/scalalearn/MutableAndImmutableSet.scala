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

//import scala.collection.mutable.Set;

object MutableAndImmutableSet extends LearningModule {

    // Set => Depends on import: mutable or immutable
    // by default Set is immutable.

    // A set is a collection that contains no duplicate elements.

    // MUTABLE => The collection can mutate (add or remove elements)

    // IMMUTABLE => The collection cannot mutate (even if you CAN STILL modify the
    // collection, but it takes time!! As in Java String)
    val s1 = "Boeing"
    val s2 = "Airbus"

    var jetSet: Set[String] = Set(s1, s2)
    jetSet += "Lear"

    def printOutput {

        val test = new ResultsPrinter("SET")
        val jetSetVal = this.jetSet;
        for (s <- jetSetVal) {
            test.addResult("> Value = %s".format(s))
        }
        test.print
    }

}