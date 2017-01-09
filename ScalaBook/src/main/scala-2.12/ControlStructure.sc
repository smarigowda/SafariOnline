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

def greet() { println("Hello World") }

greet() == () // true

// assign/ reassign to var returns Unit

var x = "Hello"

if ( (x = "New World") == ()) {
  println("re-assign returns Unit value")
}











