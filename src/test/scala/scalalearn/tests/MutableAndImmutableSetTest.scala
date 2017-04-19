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

package scalalearn.tests

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

import scalalearn.MutableAndImmutableSet

@RunWith(classOf[JUnitRunner])
class MutableAndImmutableSetTest extends FlatSpec with Matchers {

    "The given set" should "cointain the expected number of elements" in {

        MutableAndImmutableSet.jetSet.size should be (3)

    }

    it should "only contain unique items" in {

        // We try to add an element that is already present
        MutableAndImmutableSet.jetSet += "Lear"
        MutableAndImmutableSet.jetSet.size should be (3)

    }



}
