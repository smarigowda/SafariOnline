val s = "123"

val s2 = "1o"

try {
  val n = s2.toInt
} catch {
  case ex: NumberFormatException => println(ex.getMessage)
}


// do not propagate exception, not a functional way
import scala.util.{Try, Success, Failure}
// Try[T]

val s3 = "123"
val s4 = "1o4"
val s5 = "456"

val v1 = Try { s3.toInt }
val v2 = Try { s4.toInt } // no propagation of exception

v2 match {
  case Success(n) => println(n)
  case Failure(ex) => println(ex)
}

v1 match {
  case Success(n) => println(n)
  case Failure(ex) => println(ex)
}

val result = for {
  n <- Try { s3.toInt }
  m <- Try { s4.toInt }
} yield n + m

val result2 = for {
  n <- Try { s3.toInt }
  m <- Try { s5.toInt }
} yield n + m

