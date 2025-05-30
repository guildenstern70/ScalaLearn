/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** */
abstract class TryCatch extends LearningModule {

  def trycatch(): Unit = {
    try {     // scalastyle:ignore
      // your code here
    } catch { // scalastyle:ignore
      case _: IndexOutOfBoundsException => print("Index Out Of Bounds")
      case bar: NotImplementedError =>
        print("Not implemented: " + bar.getLocalizedMessage)
      case _: ExceptionInInitializerError =>
        print("Got some other kind of exception")
    } finally {
      // your scala code here, such as to close a database connection
    }

  }

  // util.Try is stylish and functional!
  def utilTry(): util.Try[Int] = util.Try( 10 )

}
