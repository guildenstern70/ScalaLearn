/**
  * Scala Learn
  *
  * Copyright (C) Alessio Saltarin - 2013-17
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

/**
  *
  */
abstract class TryCatch extends LearningModule
{

    def trycatch(): Unit =
    {
        try
        {
            // your scala code here
        }
        catch
        {
            case foo: IndexOutOfBoundsException => print("Index Out Of Bounds")
            case bar: NotImplementedError => print("Not implemented")
            case _: Throwable => println("Got some other kind of exception")
        }
        finally
        {
            // your scala code here, such as to close a database connection
        }

    }


}
