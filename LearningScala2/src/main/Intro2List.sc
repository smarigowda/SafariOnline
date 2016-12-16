// constructing a List
var lst = List(1,2,3,4,5)

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