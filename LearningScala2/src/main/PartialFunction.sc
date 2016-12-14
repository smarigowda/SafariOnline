//domain and target

// domain -- input
// target -- output

// partial function can be thought of as a map

// A function (entire) works for every argument of the defined type

// A Partial Function is only defined for certain values of the defined type
// A Partial Function (Int) => String might not accept every Int.

// Note: PartialFunction is unrelated to a partially applied function

def f(n: Int) = n match {
  case 1 => "matched 1"
  case 2 => "matched 2"
}

// domain -- input
// target -- output

// above function works only for inputs 1 and 2
// throws error for any other input

f(1) // works
//f(10) // MatchError

val pf: PartialFunction[Int, String] = {
  case 1 => "matched 1...."
  case 2 => "matched 2...."
}


pf(1)

pf.isDefinedAt(10) // false
pf.isDefinedAt(1) // true



// composing Partial Functions

val one: PartialFunction[Int, String] = { case 1 => "one" }
val two: PartialFunction[Int, String] = { case 2 => "two" }
val three: PartialFunction[Int, String] = { case 3 => "three" }
val wildcard: PartialFunction[Int, String] = { case _ => "something else" }


val partial = one orElse two orElse three orElse wildcard


partial(5) // something else
partial(1) // one