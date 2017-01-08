// n and d are class parameters
class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer = n
  val denom = d
  println(s"created $numer / $denom")
  override def toString = numer +"/"+ denom

  def add(that: Rational): Rational = {
    new Rational(n * that.denom + that.numer * d, d * that.denom )
  }

  def lessThan(that: Rational) = {
    this.numer * that.denom < that.numer * this.denom
  }

  def lessThanV2(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this.lessThan(that)) that else this
  def maxV2(that: Rational) = if(lessThan(that)) that else this
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


}

// By default, class Rational inherits the implementation of toString defined in class java.lang.Object
// You can override the default implementation by adding a method toString to class Rational
