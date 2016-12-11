val n = 1

n match {
  case 1 | 3 | 5 => println("odd case")
  case 2 | 4 | 6 => println("even case")
  case _ => println("default case _")  // match any, default case
}

def doIt(x: Any) = x match {
  case _ : Int => {
    println("case Integer")
  }
  case _ : String => {
    println("case String")
  }
//  case _ => {
//    println("Anything else...")
//  }
}

doIt(4)
doIt("Santosh")
doIt(6.0)


