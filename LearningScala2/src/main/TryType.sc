val s = "123"

val s2 = "1o"

try {
  val n = s2.toInt
} catch {
  case ex: NumberFormatException => println(ex.getMessage)
}