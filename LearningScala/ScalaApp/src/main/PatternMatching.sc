val n = 2

val m = 2
n match {
  case 1 => println("case is one")
  case _ => println("default case _")  // match any, default case
  case m => println("case is two")

}