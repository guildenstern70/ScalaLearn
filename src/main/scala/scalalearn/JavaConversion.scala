/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import scala.collection.mutable
import scala.jdk.CollectionConverters._

/**
 * Java List converted to Scala list
 * (in this case it's necessary because
 * withFilter (<-) is not a member of java.util.ArrayList[String])
 */
abstract class JavaConversion extends LearningModule
{

    val javaList = new java.util.ArrayList[String](10)
    val scalaList: mutable.Seq[String] = javaList.asScala

    for (item: String <- scalaList)
    {
        print(item)
    }

}
