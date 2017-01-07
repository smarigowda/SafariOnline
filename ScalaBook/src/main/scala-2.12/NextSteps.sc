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
