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

package scalalearn.traits

import scalalearn.ClassTemplate
import scalalearn.ResultsPrinter
import scalalearn.LearningModule

object TraitsTest extends LearningModule {

    class ClassWithTraits extends Speaking with Dancing {

        def test() {
            this.speak;
            this.dance;
        }

    }

    class StackedModifications(smName: String, smSurname: String)
        extends ClassTemplate(smName, smSurname) with StackableTrait

    val classWTraits = new TraitsTest.ClassWithTraits
    val classWStackableTrait = new TraitsTest.StackedModifications("Pippo", "Rossi")

    def printOutput() {

        val test = new ResultsPrinter("Traits")

        test += "This object speaks and dance:"
        test += classWTraits.speak
        test += classWTraits.dance
        test += "This one has a stackable (added, mixed) trait:"
        test += classWStackableTrait.name

        test.print
    }

}
