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

// String equality
val str1 = "Hello"
val str2 = "Hello"
val str3 = "H" + "ello"
str1 == str2
str1 == str3
val str4 = null
// does not throw NullPointerException
str3 == str4
str4 == str3

val str5 = "hello"
str5.toUpperCase == str1.toUpperCase

// calling a method on null throws exception
//str4.toUpperCase == str3.toUpperCase

val a = "Marisa"
val b = "marisa"
a.equalsIgnoreCase(b)


// == is defined in AnyRef class
// == method first checks fo null values, hence you do not
// have to check for null values when comparing strings

// Scala does not have a null keyword

// multi line Strings
val speech = """Four score and
               |seven years ago
               |our fathers""".stripMargin.replaceAll("\n", " ")


val speech2 = """This is known as a
          |"multiline" string
          |or 'heredoc' syntax.""". stripMargin.replaceAll("\n", " ")
