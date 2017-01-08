// n and d are class parameters
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs) // goes into primary constructor
  val numer = n / g // goes into primary constructor
  val denom = d / g // goes into primary constructor

  def this(n: Int) = {
    this(n, 1)
  }

  println(s"created $numer / $denom") // goes into primary constructor

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom )
  }

  def * (that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational = {
    new Rational(numer * i, denom)
  }

  def - (that: Rational) = new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  def / (that: Rational) = new Rational(numer * that.denom, denom * that.numer)

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
  println(onehalf + oneforth)

  println(oneforth lessThan onehalf)
  println(onehalf.lessThan(oneforth))

  println(onehalf.lessThanV2(oneforth))

  println(onehalf.max(oneforth))
  println(onehalf.maxV2(oneforth))

  println(new Rational(56))

  println(new Rational(66, 42))

  println(onehalf + onehalf * oneforth)

  println(onehalf - oneforth)
  println(onehalf - onehalf)

  println(onehalf / onehalf)

  // mixed arithmetic
  // compiler picks the version of an overloaded method that correctly matches the types of the arguments
  println(onehalf * 3)

  // You can create an implicit conversion that automatically converts integers to rational numbers when needed
  implicit def intToRational(x: Int) = new Rational(x)

  // Note that for an implicit conversion to work, it needs to be in scope.
  // If you place the implicit method definition inside class Rational,
  // it won't be in scope in the interpreter. For now, you'll need to define it directly
  // in the interpreter
  println(34 * new Rational(1,17))

  // As you can glimpse from this example, implicit conversions are a very powerful technique
  // for making libraries more flexible and more convenient to use. Because they are so powerful,
  // they can also be easily misused. You'll find out more on implicit conversions,
  // including ways to bring them into scope where they are needed

}

// By default, class Rational inherits the implementation of toString defined in class java.lang.Object
// You can override the default implementation by adding a method toString to class Rational
