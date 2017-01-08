// Other than String, which resides in package java.lang
// all of the types are members of package scala
// all the members of package scala and java.lang are automatically imported into every Scala source file

// Scala's basic types have the exact same ranges as the corresponding types in Java.
// This enables the Scala compiler to transform instances of Scala value types, such as Int or Double,
// down to Java primitive types in the bytecodes it produces.

// A literal is a way to write a constant value directly in code

// Integer literals

// The way an integer literal begins indicates the base of the number

val hex = 0x5
val hex2 = 0X00FF

val decimal = 35

val tower = 35L
val of = 45l

val little: Short = 367
val littler: Byte = 38

// Floating point literals
val big = 1.2345
val bigger = 1.23456e1
val biggerstill = 1234E45

// If a floating-point literal ends in an F or f, it is a Float, otherwise it is a Double

val little1 = 1.2345F
val littlebigger = 3e5f

val anotherdouble = 3e5
val yetanother = 3e5D

// Character literals
// any Unicode character between single quotes
val a = 'A'
//val c = '\101'
val d = '\u0041'

val f = '\u0044'

// escape sequences
val backslash = '\\'


// String literals
val hello = "hello"

//raw Strings, start and end with """

println(
  """Welcome to Ultamix 3000
    Type "HELP" for help """)

println("""Welcome to Ultamix 3000
    |Type "HELP" for help""".stripMargin)



val bool = true
val fool = false

// Operators
// operators are actually just a nice syntax for ordinary method calls
val sum = 1 + 2
val sumMore = (1).+(2)

val longSum = 1 + 2L

// The + symbol is an operator—an infix operator to be specific
// You can use any method in operator notation

// For example, class String has a method, indexOf, that takes one Char parameter

val s = "Hello, World!"
s indexOf 'o'

s indexOf ('o', 5)
// Scala invokes s.indexOf('o', 5)

// Any method can be an operator
//In Scala operators are not special language syntax: any method can be an operator.
// What makes a method an operator is how you use it. When you write "s.indexOf('o')",
// indexOf is not an operator. But when you write "s indexOf 'o'", indexOf is an operator,
// because you're using it in operator notation.

val found = true
// Scala also has two other operator notations: prefix and postfix
// prefix and postfix operators are unary
-7
(7).unary_-
!found
~0xFF

//7 toLong

// In Scala, you can leave off empty parentheses on method calls

val s2 = "Hello World"
s2.toLowerCase
//s2 toLowerCase // warning


def salt() = {
  println("salt")
  false
}

def pepper() = {
  println("pepper")
  true
}

// all Scala methods have a facility for delaying the evaluation of their arguments,
// or even declining to evaluate them at all
pepper() && salt()
salt() && pepper()


// == has been carefully crafted so that you get just the equality comparison you want in most cases

1 == 2
1 != 2
2 == 2
1 == 1.0
List(1, 2, 3) == List(1, 2, 3)

("he" + "llo") == "hello"



