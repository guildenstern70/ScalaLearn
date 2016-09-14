package scalalearn.tests

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

import scalalearn.MapForEachAndSoOn

/**
  * Created by Alessio on 14/09/2016.
  */
@RunWith(classOf[JUnitRunner])
class MapForEachAndSoOnTest  extends FlatSpec with Matchers {


    "Maps and so on" should "contain expected values" in {

        MapForEachAndSoOn.numbersMap().sum should be (42)
        MapForEachAndSoOn.eachNumber() should be (21)
        MapForEachAndSoOn.numbersSum() should be (21)

    }

}
