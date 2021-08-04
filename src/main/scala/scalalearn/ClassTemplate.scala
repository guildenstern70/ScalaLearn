/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

/** A template for a common class in Scala
  *
  * @param pName
  *   : A parameter
  * @param pSurname
  *   : Another parameter
  */
class ClassTemplate(pName: String, pSurname: String) extends LearningModule {

  // Constructor
  protected val objName: String = pName
  protected val objSurname: String = pSurname

  // Preconditions
  require(pName != null)
  require(pSurname != null)

  // Auxiliary constructor
  def this() = this("NoName", "NoSurname")

  // Methods
  // Parameters are VAL not VAR
  // Also note the return type = Int
  def newFunction(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  // scalastyle:off println
  def printOutput(): Unit = {

    println("\n** TEST ClassTemplate **")
    println("Object of class ClassTemplate")
    println("Object toString => " + this.toString)
    println("Object hash => " + this.##)

    val th = new ClassTemplate("John", "Way")
    if (this == th) {
      println("This object is equal to " + th.toString)
    }

  }
  // scalastyle:on println

  // Override 'Any' method: toString
  override def toString: String = s"[$name $surname]"

  // Override 'Any' method: equals (Any method '==' is final
  // and cannot be overridden
  override def equals(that: Any): Boolean = that match {
    case that: ClassTemplate => this.isEqualTo(that)
    case _                   => false
  }

  private def isEqualTo(that: ClassTemplate): Boolean = {

    var isEqual = false
    if (that.name.equalsIgnoreCase(this.name)) {
      if (that.surname.equalsIgnoreCase(this.surname)) {
        isEqual = true
      }
    }
    isEqual

  }

  // Properties
  def name: String = this.objName

  def surname: String = this.objSurname

  // Getters and setters
  // NOTE: both getter and setter must be present in order to work!
  private var _position = "Unknown"

  def position: String = this._position // Getter
  def position_=(value: String): Unit = this._position = value // Setter

  // Override 'Any' method: hashCode (Any method '##' is final
  // and cannot be overridden
  override def hashCode(): Int = {
    var hash = 0

    for (c <- this.name)
      hash += c

    for (c <- this.surname)
      hash += c

    hash
  }

  // Static Methods: SCALA HAS NO STATIC METHODS IN CLASSES! Use 'object' as a factory...

}
