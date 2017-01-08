def makeString(aString: Array[String]) = {
  aString.foreach(println)
}

makeString(Array("This", "is", "imperative"))


def makeStringFuncStyle(aString: Array[String]) = {
  aString.mkString(":")
}
val result = makeStringFuncStyle(Array("This", "is", "functional"))
assert(result == "This:is:functional")

