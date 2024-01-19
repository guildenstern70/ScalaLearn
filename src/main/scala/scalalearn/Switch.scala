/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021-24
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

object Switch {

  def test(): Unit = {
    val test = new ResultsPrinter("Match Test")
    test += this.tryMatch(17)
    test += this.tryMatch("hello")
    test += this.tryMatch("a dragon")
    test.print()
  }

  private def tryMatch(any: Any): String = any match {
    case 17      => "Seventeen"
    case true    => "truth"
    case "hello" => "hi!"
    case Nil     => "null"
    case _       => "something else"
  }

}
