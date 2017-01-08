// n and d are class parameters
class Rational(n: Int, d: Int) {
  require(d != 0)
  println(s"created $n / $d")
  override def toString = n +"/"+ d
}

object Main extends App {
  // Scala compiler would place the call to println into Rational's primary constructor. The println call will,
  // therefore, print its debug message whenever you create a new Rational instance
  val r1 = new Rational(3, 4)
  println(r1)
  val r2 = new Rational(3, 0) // Illegal arguments exception
}

// By default, class Rational inherits the implementation of toString defined in class java.lang.Object
// You can override the default implementation by adding a method toString to class Rational
