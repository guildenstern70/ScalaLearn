/**
 * Scala Learn
 *
  * Copyright (C) Alessio Saltarin - 2013-16
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

object MapForEachAndSoOn extends LearningModule {

    val numeri: List[Int] = List(1, 2, 3, 4, 5, 6)

    def numeriMapped() = numeri.map(x => x * 2)

    def numeriSum() = numeri.sum

    def numeriForEach() = {
        var sum = 0
        numeri.foreach(x => sum += x)
        sum
    }

    def printOutput {
        new ResultsPrinter("List Map").printDetails(numeriMapped().iterator)
        new ResultsPrinter("List Sum").printDetail(numeriSum())
        new ResultsPrinter("List ForEach").printDetail(numeriForEach())
    }

}
