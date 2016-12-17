val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

// sum
lst.foldLeft(0)((acc, nxt) => { acc + nxt })

// product
lst.foldLeft(1)((acc, nxt) => { acc * nxt })

// string concat
// often performance and GC impacts
val str = List("ab", "cd", "ef")
str.foldLeft("")((a,b) => a + b)

// starting point not required
lst.reduce((a,b) => a + b)

// terse
lst.reduce(_ + _)

// implementing contains
// does not terminate early !
def contains[T](lst: List[T], item: T) = {
  lst.foldLeft(false)((a,b) => a || b == item)
}

// true
contains(lst, 9)

// false
contains(lst, 78)

// reverse using foldLeft
def reverse[T](lst: List[T]): List[T] = {
  lst.foldLeft(List[T]())((a,b) => b :: a)
}

reverse(List(1, 2, 3, 4, 5, 6))

