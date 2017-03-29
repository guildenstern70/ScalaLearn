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
