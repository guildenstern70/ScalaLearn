package scalalearn

/**
  * Collections bookmark
  */
object Collections extends LearningModule
{
    /*

    Collections in Scala can be Mutable (fast add and remove) or Immutable (very slow add and remove)
    --> See MutableAndImmutableSet

    Normal object collections -> See List in ListAndTuple

    Collections of different object -> See Tuple in ListAndTuple

     */

    val dictionary : Map[Int, String] = Map(

        1 -> "AAA",
        2 -> "BBB",
        3 -> "CCC"
    )

    val keys: Iterable[Int] = dictionary.keys
    val values: Iterable[String] = dictionary.values

    if( dictionary.contains( 1 )) {
        println("Key exists with value :"  + dictionary(1))
    } else {
        println("1 key does not exist")
    }

    // Get 3rd element
    val third = dictionary.keys.drop(2).head

    def printOutput {

        val test = new ResultsPrinter("COLLECTIONS (MAPS)")

        dictionary.keys.foreach{ i =>
            test.addResult("Key = " + i )
            test.addResult("Value = " + dictionary(i) )
        }

        test.print()

    }

}
