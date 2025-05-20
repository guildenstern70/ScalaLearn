/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-25
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn.traits

import scalalearn.{ClassTemplate, LearningModule, ResultsPrinter}

object TraitsTest extends LearningModule {

  class ClassWithTraits extends Speaking with Dancing {

    def test(): Unit = {
      this.speak();
      this.dance();
    }

  }

  // Class template is a class with a name and a surname
  // The Stackable Traits in 'StackableTrait' modify the name,
  // by adding 'XXX' and 'YYY' to the name,
  // Here you can see how we can 'Stack' the traits together
  class ClassTemplateWithXXX(smName: String, smSurname: String)
      extends ClassTemplate(smName, smSurname)
      with AddXXXStackableTrait

  // Try to invert the traits here!
  // (order is important!!)
  class ClassTemplateWithXXXandYYY(smName: String, smSurname: String)
      extends ClassTemplate(smName, smSurname)
      with AddYYYStackableTrait
      with AddXXXStackableTrait

  val objectWithTraits = new TraitsTest.ClassWithTraits
  val firstObjWithStackedTraits =
    new TraitsTest.ClassTemplateWithXXX("Pippo", "Rossi")
  val secondObjWithStackedTraits =
    new TraitsTest.ClassTemplateWithXXXandYYY("Pippo", "Rossi")

  def printOutput(): Unit = {

    val test = new ResultsPrinter("Traits")

    test += "This object speaks and dance:"
    test += objectWithTraits.speak()
    test += objectWithTraits.dance()
    test += "This one has a stackable (added, mixed) traits:"
    test += firstObjWithStackedTraits.name
    test += secondObjWithStackedTraits.name

    test.print()
  }

}
