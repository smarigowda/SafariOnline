import java.io.{File, PrintWriter}

def plainOldSum(x: Int, y: Int) = x + y

plainOldSum(23, 45)

// first invocation returns a function value
def curriedSum(x: Int)(y: Int) = x + y
curriedSum(23)(45)

// demo of currying process
def first(x: Int) = (y: Int) => x + y
val second = first(20)
second(34)

// using placeholder notation
val onePlus = curriedSum(1)_
onePlus(20)

val twoPlus = curriedSum(2)_
twoPlus(30)

// new control structure
def twice(op: Double => Double, x: Double) = op(op(x))

twice(_ + 1, 5)
twice((x: Double) => x + 1, 5)

twice( _ * 1, 5 )
twice( _ * 2, 5 )

// capturing control abstraction using method
// ensures that the file is closed at the end
// loan pattern
// the abstraction opens a resource and loans it to the function
//  withPrintWriter loans a PrintWriter to the function, op
def withPrintWriter(file: File, op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

withPrintWriter(
  new File("/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12/date.txt"),
  writer => writer.println(new java.util.Date)
)

// use curly instead of parenthesis
println("Hello, world!")
// looks like built in control structure
// only if there is exactly one argument
println { "Hello, world!" }

def withPrintWriter2(file: File)(op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

val file = new File("/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12/date2.txt")
withPrintWriter2(file) {
  writer => writer.println(new java.util.Date)
}

// ByName Parameters
// implement more like if or while
// no value to pass into the code between the curly braces

var assertionEnabled = true

def myAssert(predicate: () => Boolean) = {
  if(assertionEnabled && predicate() == false) {
    throw new AssertionError
  }
}

myAssert(() => 5 > 3)
//myAssert(() => 3 > 5)


// using By Name Parameter
assertionEnabled = true
def byNameAssert(predicate: => Boolean) = {
  if (assertionEnabled && predicate == false) {
    throw new AssertionError
  }
}

//byNameAssert(5 > 3)
byNameAssert(3 > 5)

println("end of worksheet")



