/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** Map, reduce, groupBy
  */
object MapReduce extends LearningModule {

  case class Person(name: String, age: Int, sex: Char)

  private val person1: Person = Person("Alessio", 47, 'M')
  private val person2: Person = Person("Giulia", 32, 'F')
  private val person3: Person = Person("Elena", 17, 'F')
  private val person4: Person = Person("Marco", 39, 'M')

  private val people = List(person1, person2, person3, person4)

  private def averageAges: List[String] =
      people.groupBy(_.sex)
        .view
        .mapValues(_.map(_.age))
        .toMap[Char, List[Int]]
        .map(item => s"${item._1} > ${item._2}")
        .toList

  private def getMales: List[String] =
    people.filter(_.sex == 'M').map(_.name)

  /** Return the number of people grouped by sex
    * @return
    */
  private def countSex: List[String] = {
    val groups: Map[Char, List[Person]] = people.groupBy(_.sex)
    val personsPerSex: Map[Char, Int] = groups.map {
      case (k: Char, v: List[Person]) => (k, v.length)
    }
    personsPerSex.map { case (l: Char, m: Int) =>
      s"$l = $m"
    }.toList
  }

  def printOutput(): Unit = {
    new ResultsPrinter("Average ages").printDetails(averageAges.iterator)
    new ResultsPrinter("Get males").printDetails(getMales.iterator)
    new ResultsPrinter("Count sex").printDetails(countSex.iterator)
  }

}
