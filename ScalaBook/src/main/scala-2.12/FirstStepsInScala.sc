def max(x: Int, y: Int): Int = {
  if( x > y ) x else y
}

max(12, 23)

def max2(x: Int, y: Int) = if(x > y) x else y
max2(78, 34)

def greet() = println("Hello World")

var i = 0
while( i < 5) {
  print(i)
  print(" ")
  i += 1
}
println()

// type is inferred
// foreach takes a function (function literal in this case)
"hello".foreach(ch => println(ch))

// type is explicitly mentioned
"World".foreach((ch: Char) => println(ch))

// super concise syntax for single argument function
"New World".foreach(println)