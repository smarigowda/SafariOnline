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