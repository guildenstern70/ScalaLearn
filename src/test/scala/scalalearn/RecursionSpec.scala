package scalalearn

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RecursionSpec extends AnyFlatSpec with should.Matchers
{
    "Recursion function" should "return the correct value" in
            {
                Recursion.recursionApplied() should be(1665)
            }
}
