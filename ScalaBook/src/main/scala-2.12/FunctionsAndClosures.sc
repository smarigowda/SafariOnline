import scala.io.Source

// functions as method, private method
object LongLines {
  def processFiles(filename: String, width: Int): Unit = {
    val source = Source.fromFile(filename)
    for(line <- source.getLines) {
      processLine(filename, width, line)
    }
  }

  private def processLine(filename: String, width: Int, line: String): Unit = {
    if(line.length > width) {
      println(filename + " : " + line.trim)
    }
  }
}

val fname = "/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12/ControlStructure.sc"
LongLines.processFiles(fname, 40)

// using local function
// function inside function

def processFile(filename: String, width: Int): Unit = {

  def processLine(line: String): Unit = {
    if(line.length > width) {
      println(filename + ": " + line)
    }
  }

  val source = Source.fromFile(filename)
  for(line <- source.getLines) {
    processLine(line)
  }
}

processFile(fname, 40)

// Function literals
var increase = (x: Int) => x + 1
println(increase(10))

increase = (x: Int) => x + 9999
println(increase(10))

val someNumbers = List(1, 2, 3, -5, -9, 8)
someNumbers.foreach((x: Int) => println(x))

val filteredlist = someNumbers.filter((x: Int) => x > 0)
val filteredlist2 = someNumbers.filter(x => x > 0)
val filteredlist3 = someNumbers.filter(_ > 0)

// partially applied functions
someNumbers.map(println _)

someNumbers.map(println)

def sum(a: Int, b: Int, c: Int) = a + b + c

sum(1,2,3)

// Partially applied function
val newSum = sum _
newSum(1,2,3)

val sum2args = sum(_: Int, 10, _: Int)
sum2args(10,10)

val sumOneArg = sum(10, 20, _: Int)
sumOneArg(30)



var more = 1 // free variable (closure)
// x is bound variable
val addMore = (x: Int) => x + more

addMore(20) // 21

more = 20
addMore(20) // 40

def makeIncreaser(more: Int) = (x: Int) => x + more

val inc1 = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)

println(inc1(10))
println(inc9999(10))

// repeated arguments
// named arguments
// default arguments

def echo(args: String*) = { // type of arg is Array[String]
  for(arg <- args) println(arg)
}

echo()
echo("Hello")
echo("Hello", "Scala", "World")

def speed(distance: Float, time: Float): Float = distance/ time

speed(100, 10)
speed(time = 10, distance = 100)
speed(distance = 100, time = 10)


























