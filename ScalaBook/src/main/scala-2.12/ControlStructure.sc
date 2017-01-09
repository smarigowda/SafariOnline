val fileexists = true

var filename = ""

if(fileexists)
  filename = "default.txt"

// if is an expression, so we can write
filename = if(fileexists) "default.txt" else ""

println(filename)

// or even
println(if(fileexists) "default.txt" else "")

// imperative style
// while does not return any value
// while and do while are not expressions
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while(a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

val gcd = gcdLoop(34, 24)
println(gcd)

// while always returns result of type Unit
// Unit has only one value which is ()

//def greet() { println("Hello World") }

//greet() == () // true

// assign/ reassign to var returns Unit

var x = "Hello"

//if ( (x = "New World") == ()) {
//  println("re-assign returns Unit value")
//}

// functional style
def gcdFuncStyle(x: Long, y: Long): Long = {
  if(y == 0) x else gcdFuncStyle(y, x % y)
}

println(gcdFuncStyle(6, 24))

val files = new java.io.File("/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12").listFiles
for(file <- files) { // generator syntax
  println(file)
}

// for expression works on any type of collection

// Range, special case
1 to 4 // immutable Range inclusive
for(i <- 1 to 4) {
  println(s"Iteration $i")
}

for(i <- 1 until 4) println(i)

for(file <- files if file.getName.endsWith(".scala"))
  println(file)

def fileLines(file: java.io.File) = {
//  println("----")
//  println(file)
  scala.io.Source.fromFile(file).getLines.toList
}

for(file <- files if file.isFile; if file.getName.endsWith(".scala")) {
  println(file)
}

// nested iteration
def grep(pattern: String) = {
  for (
    file <- files
    if file.getName.endsWith("Structure.sc");
    line <- fileLines(file)
    if(line.trim.matches(pattern))
  ) {
    println(line.trim)
  }
}

println("----- calling grep ------")
grep(".*grep.*")

def scalaFiles = {
  for {
    file <- files
  } yield file
}

for ( f <- scalaFiles ) println(f)



val linelengths = for {
  file <- files
  if file.getName.endsWith(".sc");
  line <- fileLines(file)
  if line.trim.matches(".*grep.*")
} yield line.trim.length

for ( length <- linelengths ) println(length)