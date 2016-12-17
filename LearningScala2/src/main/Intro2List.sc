// constructing a List
var lst = List(1,2 , 3, 4, 5)

// another way to construct List using conns (concatenation)
// start with an empty list Nil and add the elements to the front
var lst2 = 1 :: 3 :: Nil

// empty list is a list of Nothing
// Nothing is a special type, no instances or values for Nothing
// note null is value
var lst3 = List() // list of type Nothing

Nil

println (Nil == List())

println (Nil eq List())

println (Nil equals List())

System.identityHashCode(Nil)

System.identityHashCode(List())


// while which does not terminate
// type of this expression is Nothing
//while(true) { println("infinite loop")}


// more list operations

// appending to list
val lst4 = lst :+ 6

// list concatenation
val lst5 = lst4 ::: lst2

val lst6 = List("Santosh", "Roopa", "Sukruthi")

// List of type Any
// Heterogeneous collection
// may be a code smell, use type hint
val lst7 = lst6 ::: lst5

// new value created, existing is not modified
val lst8 = lst ::: lst


lst // all elements
lst.head // only first element
lst.tail // everything except first element


def matchList[T](lst: List[T]) = lst match {
  case List() => println("empty list...")
  case List(_) => println("list with one element...")
}

val l = List()
matchList(l)
matchList(List(1))
matchList(List("Santosh"))


def printList[T](lst: List[T]): Unit = lst match {
  case Nil => println("Done...")
  case h :: t => {
    print(s"$h ")
    printList(t)
  }
}

printList(lst)