package scalalearn

import java.util

/**
  * Use this import!
  */
import scala.collection.JavaConversions._

/**
  *
  */
abstract class JavaConversions extends LearningModule
{
    // Please note the import
    // Do not use JavaConverters (obsolete)

    val javaList = new util.ArrayList[String]()

    for (item: String <- javaList)
    {
        print(item)
    }

}
