/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** Collections bookmark
  */
object Collections extends LearningModule {
  /*

    Collections are arrays of the same type of objects, containing
    a variable number of items.

    Collections in Scala can be Mutable (fast add/remove, slow read) or
    Immutable (very slow add/remove, very fast read)
    --> See also MutableAndImmutableSet

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
  if (dictionary.contains(1)) {
    println("Key exists with value :" + dictionary(1))
  } else {
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

  def printOutput(): Unit = {

    val test = new ResultsPrinter("COLLECTIONS (MAPS)")

    dictionary.keys.foreach { (i: Int) =>
      test.addResult("Key = " + i)
      test.addResult("Value = " + dictionary(i))
    }

    test.print()

  }

}
