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

// use curly instead of parans
println("Hello, world!")
// looks like built in control structure
// only if there is exactly one argument
println { "Hello, world!" }