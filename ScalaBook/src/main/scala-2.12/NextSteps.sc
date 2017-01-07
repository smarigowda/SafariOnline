// demo
// type parameterization and value parameterization

// type is inferred
val greeting = new Array[String](3)

greeting(0) = "hello"
greeting(1) = "new"
greeting(2) = "world"

// type explicitly mentioned
val greeting2: Array[String] = new Array[String](3)

// type of greeting and greeting2 is Array[String]

for( i <- 0 to 2 )
  println(greeting(i))

// greeting(i) gets transformed into greeting.apply(i). 
// Thus accessing an element of an array in Scala is simply a method call like any other. 
// This principle is not restricted to arrays: any application of an object to some arguments in parentheses 
// will be transformed to an apply method call. Of course this will compile only if that type of object actually 
// defines an apply method. So it's not a special case; it's a general rule

// Similarly, when an assignment is made to a variable to which parentheses
// and one or more arguments have been applied, the compiler will transform that
// into an invocation of an update method that takes the arguments in parentheses
// as well as the object to the right of the equals sign. For example:

greeting(0) = "Hello"
// will be transformed to
greeting.update(0, "Hello")

// Thus, the following is semantically equivalent to previous code

val greetingStrings = new Array[String](3)

greetingStrings.update(0, "Hello")
greetingStrings.update(1, "New")
greetingStrings.update(2, "World")

for(i <- 0 to 2) {
  println(greetingStrings.apply(i))
}

// Scala achieves a conceptual simplicity by treating everything,
// from arrays to expressions, as objects with methods


// concise way to create and initialize arrays
// compiler infers the type of numNames as Array[String]
val numNames = Array("Zero", "One", "Two")

// What compiler does
val numNames2 = Array.apply("Zero", "One", "Two")
// apply method is defined on companion object

