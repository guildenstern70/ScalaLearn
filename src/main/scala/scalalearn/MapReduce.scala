// ScalaLearn
//
// Copyright (C) Alessio Saltarin - 2013-21
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
//  You should have received a copy of the GNU General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
package scalalearn

/**
 * Map, reduce, groupBy
 */
object MapReduce extends LearningModule
{

    case class Person(name: String, age: Int, sex: Char)

    val person1: Person = Person("Alessio", 47, 'M')
    val person2: Person = Person("Giulia", 32, 'F')
    val person3: Person = Person("Elena", 17, 'F')
    val person4: Person = Person("Marco", 39, 'M')

    val people = List(person1, person2, person3, person4)

    def averageAges: List[String] =
    {

        val groups: Map[Char, List[Person]] = people.groupBy(_.sex)

        val sexWithAges: Map[Char, List[Int]] =
            groups.view.mapValues(_.map(_.age)).toMap[Char, List[Int]]

        sexWithAges.map(map => s"${map._1} > ${map._2}").toList
    }

    def getMales: List[String] =
        people.filter(_.sex == 'M').map(_.name)


    /**
     * Return the number of people grouped by sex
     * @return
     */
    def countSex: List[String] =
    {
        val groups: Map[Char, List[Person]] = people.groupBy(_.sex)
        val personsPerSex: Map[Char, Int] = groups.map {
            case (k: Char, v: List[Person]) => (k, v.length)
        }
        personsPerSex.map {
            case (l: Char, m: Int) => s"$l = $m"
        }.toList
    }

    def printOutput(): Unit =
    {
        new ResultsPrinter("Average ages").printDetails(averageAges.iterator)
        new ResultsPrinter("Get males").printDetails(getMales.iterator)
        new ResultsPrinter("Count sex").printDetails(countSex.iterator)
    }

}
