// n and d are class parameters
class Rational(n: Int, d: Int) {
  require(d != 0)


  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = {
    this(n, 1)
  }
  println(s"created $numer / $denom")

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom )
  }

  def lessThan(that: Rational) = {
    this.numer * that.denom < that.numer * this.denom
  }

  def lessThanV2(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this.lessThan(that)) that else this
  def maxV2(that: Rational) = if(lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }
}

object Main extends App {
  // Scala compiler would place the call to println into Rational's primary constructor. The println call will,
  // therefore, print its debug message whenever you create a new Rational instance
  val r1 = new Rational(3, 4)
  println(r1)
  //  val r2 = new Rational(3, 0) // Illegal arguments exception

  val onehalf = new Rational(1, 2)
  val oneforth = new Rational(1, 4)
  println(onehalf add oneforth)

  println(oneforth lessThan onehalf)
  println(onehalf.lessThan(oneforth))

  println(onehalf.lessThanV2(oneforth))

  println(onehalf.max(oneforth))
  println(onehalf.maxV2(oneforth))

  println(new Rational(56))

  println(new Rational(66, 42))

}

// By default, class Rational inherits the implementation of toString defined in class java.lang.Object
// You can override the default implementation by adding a method toString to class Rational
