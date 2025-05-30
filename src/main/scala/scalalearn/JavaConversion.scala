/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scala.collection.mutable
import scala.jdk.CollectionConverters.*

/** Java List converted to Scala list (in this case it's necessary because
  * withFilter (<-) is not a member of java.util.ArrayList[String])
  */
abstract class JavaConversion extends LearningModule {

  private val initialCapacity = 10
  private val javaList = new java.util.ArrayList[String](initialCapacity)
  private val scalaList: mutable.Seq[String] = javaList.asScala

  for (item: String <- scalaList) {
    print(item)
  }

}
