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
  * Collections bookmark
  */
object Collections extends LearningModule
{
    /*

    Collections in Scala can be Mutable (fast add and remove) or
    Immutable (very slow add and remove)
    --> See MutableAndImmutableSet

    Normal object collections -> See List in ListAndTuple
    Collections of different type of objects -> See Tuple in ListAndTuple

     */

    /* Immutable: cannot add elements */
    val dictionary: Map[Int, String] = Map(

        1 -> "AAA",
        2 -> "BBB",
        3 -> "CCC"
    )

    val keys: Iterable[Int] = dictionary.keys
    val values: Iterable[String] = dictionary.values

    // scalastyle:off println
    if (dictionary.contains(1))
    {
        println("Key exists with value :" + dictionary(1))
    }
    else
    {
        println("1 key does not exist")
    }
    // scalastyle:on println

    val third: Int = dictionary.keys.drop(2).head

    /* Mutable: you can add elements */
    val mutableDictionary = collection.mutable.Map.empty[Int, String]
    mutableDictionary += 1 -> "XXX"
    mutableDictionary += 2 -> "YYY"

    /* Set: collection of unique items */
    val mutableSet = collection.mutable.Set.empty[String]
    mutableSet += "AAA"
    mutableSet += "BBB"

    def printOutput(): Unit =
    {

        val test = new ResultsPrinter("COLLECTIONS (MAPS)")

        dictionary.keys.foreach
        { i =>
            test.addResult("Key = " + i)
            test.addResult("Value = " + dictionary(i))
        }

        test.print()

    }

}
