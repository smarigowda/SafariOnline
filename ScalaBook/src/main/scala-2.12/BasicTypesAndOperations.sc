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
