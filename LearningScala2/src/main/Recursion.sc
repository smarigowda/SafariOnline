def fact(n: Int): Int = {
  if(n == 0) 1
  else n * fact(n-1)
}

fact(3)

def fact2(n: Int): Int = n match {
  case 0 => 1
  case m => m * fact2(m - 1)

}

fact2(3)



// tail recursion
def fact3(n: Int, acc: Int): Int = n match {
  case 0 => acc
  case m => fact3(n-1, m * acc)

}

fact3(4, 1)