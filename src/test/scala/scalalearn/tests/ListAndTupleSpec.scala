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

package scalalearn.tests

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import scalalearn.ListAndTuple

class ListAndTupleSpec extends AnyFlatSpec with should.Matchers
{


    "The #1 list" should "contain expected values" in
            {

                ListAndTuple.myList1 should be(List(0, 1, 2, 3, 4))

            }

    "The #2 list" should "contain expected values" in
            {

        ListAndTuple.myList2 should be (List(1, 2, 3, 4))

    }

    "The tuple" should "contain expected values" in {

        ListAndTuple.myTuple._1 should be (77)
        ListAndTuple.myTuple._2 should be ("Alessio")
        ListAndTuple.myTuple._3 should be (345.7)

    }

}