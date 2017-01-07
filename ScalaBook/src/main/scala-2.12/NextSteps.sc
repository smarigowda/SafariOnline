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

