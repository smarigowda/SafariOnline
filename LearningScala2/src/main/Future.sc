import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val f1 = Future {
  Thread.sleep(0)
  50
}

Thread.sleep(3000)
f1.foreach(x => println(x))

val f2 = Future {
  Thread.sleep(5000)
  50 / 0
}

f2.value

Thread.sleep(6000)
f2.value

// convert to Future of type Throwable
val ff = f2.failed
ff.foreach(x => println(x))

// Notes:
// Option and Try enables us to distinguish 3 states of Future in a non blocking and functional way
// Success
// Fail
// Not Finished

