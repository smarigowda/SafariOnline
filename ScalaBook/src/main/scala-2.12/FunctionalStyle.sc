def makeString(aString: Array[String]) = {
  aString.foreach(println)
}

makeString(Array("This", "is", "imperative"))


def makeStringFuncStyle(aString: Array[String]) = {
  aString.mkString(":")
}
println(makeStringFuncStyle(Array("This", "is", "functional")))

