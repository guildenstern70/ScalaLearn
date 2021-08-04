/*
 * ScalaLearn Project
 * Copyright (c) Alessio Saltarin, 2021
 * This software is licensed under MIT License
 * See LICENSE
 *
 */
package scalalearn

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class MapForEachAndSoOnSpec extends AnyFlatSpec with should.Matchers
{
    "Maps and so on" should "contain expected values" in
            {
                MapForEachAndSoOn.numbersMap().sum should be(42)
                MapForEachAndSoOn.eachNumber() should be(21)
                MapForEachAndSoOn.numbersSum() should be(21)
            }

}

