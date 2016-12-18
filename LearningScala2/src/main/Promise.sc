import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

// point of Promise is to separate read and write operations from the value
// Client -- reads
// write once read many
// once the Future writes the value it will never change
// a place to hold the value

// we can register a call back with Promise
val p1 = Promise[Int]
val p2 = Promise[Int]

// derive the future from the Promise
// future always has a promise behind it
val f1 = p1.future
val f2 = p2.future

val result = for {
  a <- f1
  b <- f2
} yield a + b

result.value

p1.success(30)
result.value

p2.success(45)
Thread.sleep(2000)

result.value













