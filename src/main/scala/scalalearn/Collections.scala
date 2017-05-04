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

    /* Immutable: cannot add elements */
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

    val third = dictionary.keys.drop(2).head

    /* Mutable: you can add elements */
    val mutableDictionary = collection.mutable.Map.empty[Int, String]
    mutableDictionary += 1 -> "XXX"
    mutableDictionary += 2 -> "YYY"

    /* Set: collection of unique items */
    val mutableSet = collection.mutable.Set.empty[String]
    mutableSet += "AAA"
    mutableSet += "BBB"

    def printOutput {

        val test = new ResultsPrinter("COLLECTIONS (MAPS)")

        dictionary.keys.foreach{ i =>
            test.addResult("Key = " + i )
            test.addResult("Value = " + dictionary(i) )
        }

        test.print()

    }

}
