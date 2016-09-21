package scalalearn

/**
  * Option is the preferred way to handle nullable types
  */
object Options extends LearningModule {


    def removeExcept(someString: String): Option[String] =
    {
        if (someString.startsWith("!"))
            return None

        Some(someString.substring(1))
    }

    def printOutput {

        val test = new ResultsPrinter("OPTIONS")

        val first = "-This is OK"
        val second = "!This is KO"

        val removeOne: Option[String] = removeExcept(first)
        val removeTwo: Option[String]  = removeExcept(second)

        var removeOneResult: String = "This is not defined (None)"
        var removeTwoResult: String = "This is not defined (None)"

        if (removeOne.isDefined)
            removeOneResult = removeOne.get

        if (removeTwo.isDefined)
            removeTwoResult = removeTwo.get

        test.addResult(removeOneResult)
        test.addResult(removeTwoResult)

        test.print()
    }

}
