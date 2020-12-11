/**
 * Scala Learn
 *
 * Copyright (C) Alessio Saltarin - 2013-20
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
  *
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  *
  */
package scalalearn

object Switch
{

    def test(): Unit =
    {
        val test: Printer = new Printer("Match Test")
        test += this.tryMatch(17)
        test += this.tryMatch("hello")
        test += this.tryMatch("a dragon")
        test.print()
    }

    def tryMatch(any: Any): String = any match
    {
        case 17 => "Seventeen"
        case true => "truth"
        case "hello" => "hi!"
        case Nil => "null"
        case _ => "something else"
    }

}
