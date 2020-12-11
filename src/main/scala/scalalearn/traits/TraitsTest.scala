/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-20
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

import scalalearn.{ClassTemplate, LearningModule, ResultsPrinter}

object TraitsTest extends LearningModule
{

    class ClassWithTraits extends Speaking with Dancing
    {

        def test(): Unit =
        {
            this.speak();
            this.dance();
        }

    }

    // Class template is a class with a name and a surname
    // The Stackable Traits in 'StackableTrait' modify the name,
    // by adding 'XXX' and 'YYY' to the name,
    // Here you can see how we can 'Stack' the traits together
    class ClassTemplateWithXXX(smName: String, smSurname: String)
            extends ClassTemplate(smName, smSurname) with AddXXXStackableTrait

    // Try to invert the traits here!
    // (order is important!!)
    class ClassTemplateWithXXXandYYY(smName: String, smSurname: String)
            extends ClassTemplate(smName, smSurname)
                    with AddYYYStackableTrait with AddXXXStackableTrait

    val objectWithTraits = new TraitsTest.ClassWithTraits
    val firstObjWithStackedTraits = new TraitsTest.ClassTemplateWithXXX("Pippo", "Rossi")
    val secondObjWithStackedTraits = new TraitsTest.ClassTemplateWithXXXandYYY("Pippo", "Rossi")

    def printOutput(): Unit =
    {

        val test = new ResultsPrinter("Traits")

        test += "This object speaks and dance:"
        test += objectWithTraits.speak()
        test += objectWithTraits.dance()
        test += "This one has a stackable (added, mixed) traits:"
        test += firstObjWithStackedTraits.name
        test += secondObjWithStackedTraits.name

        test.print()
    }

}
