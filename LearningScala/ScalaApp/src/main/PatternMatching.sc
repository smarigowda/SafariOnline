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
  case _ => {
    println("Anything else...")
  }
}

doIt(4)
doIt("Santosh")
doIt(6.0)

def doIt2(x: Any) = x match {
  case n: Int => {
    println(s"it is an int: value = $n")
  }
  case s: String => {
    println(s"it is a String: value = $s")
  }
  case d => println(s"default case...value = $d")
}

doIt2(9)
doIt2(9.0)
doIt2("abc")

// pair or tuple
def doIt3(a: Int, b: Int) = (a, b) match {
  case (1, 1) => println("1, 1")
  case (1, _) => println("1, _")
  case (_, 2) => println("_, 2")
  case (_, _) => println("default case")
}

doIt3(1, 1)
doIt3(1, 4)
doIt3(8, 9)
doIt3(45, 2)
