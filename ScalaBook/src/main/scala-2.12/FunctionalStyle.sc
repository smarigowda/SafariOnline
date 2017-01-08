def makeString(aString: Array[String]) = {
  aString.foreach(println)
}

makeString(Array("This", "is", "imperative"))


def makeStringFuncStyle(aString: Array[String]) = {
  aString.mkString(":")
}
val result = makeStringFuncStyle(Array("This", "is", "functional"))
assert(result == "This:is:functional")

import java.nio.file.{Paths, Files}
import scala.io.Source
val filepath = "/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12/notes.txt"
val fileexists = Files.exists(Paths.get(filepath))

// The getLines method returns an Iterator[String]
// one line on each iteration
// for expression iterates through the lines

if(fileexists) {
  println("File exists")
  for(line <- Source.fromFile(filepath).getLines()) {
    println(line.length())
  }
} else {
  println("File does not exist")
}

// no braces required if the method has no arguments
if(fileexists) {
  println("File exists")
  for(line <- Source.fromFile(filepath).getLines) {
    println(line.length)
  }
} else {
  println("File does not exist")
}


// formatted character count
// functional style
def widthOfLength(s: String) = s.length.toString.length
if(fileexists) {

  println("File exists")
  val lines = Source.fromFile(filepath).getLines.toList
  val longestLine = lines.reduceLeft(
    (a,b) => if(a.length > b.length) a else b
  )
  val maxWdith = widthOfLength(longestLine)
  println("maxWidth = " + maxWdith)

  for(line <- lines) {
    val numSpaces = maxWdith - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }

} else {
  println("File does not exist")
}

