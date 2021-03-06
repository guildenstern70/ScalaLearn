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

        val sexWithTotalSumOfAges: Map[Char, Int] =
            sexWithAges.map
            {
                case (sex, ages) => (sex, ages.reduce(_ + _))
            }

        val sexCount: Map[Char, Int] = people.groupBy(_.sex).map
        {
            case (sex, personsOfThatSex) => (sex, personsOfThatSex.length)
        }

        val sexWithAverageAge: Map[Char, Double] =
            sexWithTotalSumOfAges.map
            {
                case (sex, totalAge) =>
                    (sex, totalAge.toDouble / sexCount(sex))
            }

        sexWithAverageAge.map(map => s"${map._1} > ${map._2}").toList

    }

    def getMales: List[String] =
    {

        people.filter
        {
            case (person) => person.sex == 'M'
        }.map
        {
            p: Person => p.name
        }

    }

    def getMales2: List[String] =
    {

        people.filter
        {
            case (person) => person.sex == 'M'
        }.map(_.name)

    }

    def getMales3: List[String] = people.filter(_.sex == 'M').map(_.name)


    def countSex: List[String] =
    {

        val groups: Map[Char, List[Person]] = people.groupBy(_.sex)
        groups.map
        {
            case (sex, personsBelongingToSex) =>
                sex.toString + " > " + personsBelongingToSex.length
        }.toList
    }

    def malesAndFemales: List[String] =
    {

        val groups: Map[Char, List[Person]] = people.groupBy(_.sex)
        val namesWithSex: Map[Char, String] =
            groups.view.mapValues(_.map(_.name).mkString(" & ")).toMap[Char, String]
        namesWithSex.map
        {
            case (k, v) => s"$k: $v"
        }.toList
    }

    def printOutput(): Unit =
    {
        new ResultsPrinter("Average ages").printDetails(averageAges.iterator)
        new ResultsPrinter("Get males").printDetails(getMales.iterator)
        new ResultsPrinter("Get males 2").printDetails(getMales2.iterator)
        new ResultsPrinter("Get males 3").printDetails(getMales3.iterator)
        new ResultsPrinter("Count sex").printDetails(countSex.iterator)
        new ResultsPrinter("Males & Females").printDetails(malesAndFemales.iterator)
    }

}
