def plainOldSum(x: Int, y: Int) = x + y

plainOldSum(23, 45)

// first invocation returns a function value
def curriedSum(x: Int)(y: Int) = x + y
curriedSum(23)(45)

// demo of currying process
def first(x: Int) = (y: Int) => x + y
val second = first(20)
second(34)

// using placeholder notation
val onePlus = curriedSum(1)_
onePlus(20)

val twoPlus = curriedSum(2)_
twoPlus(30)

