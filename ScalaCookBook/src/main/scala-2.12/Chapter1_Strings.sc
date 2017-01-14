"Hello World".getClass.getName
val s = "Hello World"
s.length

val s2 = "Hello " + "World"

"hello".foreach(println)

// treat string as a sequence of characters
for(c <- "hello") { println(c) }

// as sequence of Bytes
s.getBytes.foreach(println)

"Hello World".filter(c => { c == 'l'})
"Hello World".filter(_ != 'l')

// Scala String have both string and collection features
// drop and take are collection methods
// you treat the output from take as a String
// capitalize method is in StringOps class
"Scala".drop(2).take(2).capitalize