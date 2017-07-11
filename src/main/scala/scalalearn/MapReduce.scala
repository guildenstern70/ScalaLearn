package scalalearn

/**
  * Map, reduce, groupBy
  */
object MapReduce extends LearningModule {

    case class Person(name: String, age: Int, sex: Char)

    val person1 = Person("Alessio", 47, 'M' )
    val person2 = Person("Giulia", 32, 'F')
    val person3 = Person("Elena", 17, 'F' )
    val person4 = Person("Marco", 39, 'M' )

    val people = List(person1, person2, person3, person4)

    def averageAges: List[String] = {

        val groups: Map[Char, List[Person]] = people.groupBy( _.sex )

        val sexWithAges: Map[Char, List[Int]] =
            groups.mapValues( _.map (_.age) )

        val sexWithTotalSumOfAges: Map[Char, Int] =
            sexWithAges.map {
                case ( sex, ages ) => ( sex, ages.reduce(_+_))
            }

        val sexCount: Map[Char, Int] = people.groupBy( _.sex ).map {
            case (sex, personsOfThatSex) => (sex, personsOfThatSex.length)
        }

        val sexWithAverageAge: Map[Char, Double] =
            sexWithTotalSumOfAges.map {
                case (sex, totalAge ) =>
                    (sex, totalAge.toDouble / sexCount(sex))
            }

        sexWithAverageAge.map( map => map._1 + " > " + map._2.toString).toList

    }

    def getMales: List[String] = {

        people.filter {
            case (person) => person.sex == 'M'
        }.map {
            p: Person => p.name
        }

    }

    def getMales2: List[String] = {

        people.filter {
            case (person) => person.sex == 'M'
        }.map(_.name)

    }

    def getMales3: List[String] = people.filter(_.sex == 'M').map(_.name)


    def countSex: List[String] = {

        val groups: Map[Char, List[Person]] = people.groupBy( _.sex )
        groups.map {
            case (sex, personsBelongingToSex) =>
                sex.toString + " > " + personsBelongingToSex.length
        }.toList
    }

    def malesAndFemales: List[String] = {

        val groups: Map[Char, List[Person]] = people.groupBy( _.sex )
        val namesWithSex: Map[Char, String] = groups.mapValues( _.map(_.name).mkString(" & ") )
        namesWithSex.map {
            case (k, v) => k + ": " + v
        }.toList
    }

    def printOutput {
        new ResultsPrinter("Average ages").printDetails(averageAges.iterator)
        new ResultsPrinter("Get males").printDetails(getMales.iterator)
        new ResultsPrinter("Get males 2").printDetails(getMales2.iterator)
        new ResultsPrinter("Get males 3").printDetails(getMales3.iterator)
        new ResultsPrinter("Count sex").printDetails(countSex.iterator)
        new ResultsPrinter("Males & Females").printDetails(malesAndFemales.iterator)
    }

}
