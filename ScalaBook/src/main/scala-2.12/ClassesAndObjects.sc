class CheckSumAccumulator {
  private var sum = 0
  // method parameters are vals
  // In this form, the method looks like a procedure,
  // a method that is executed only for its side effects
  def add(b: Byte) { sum += b }
  def checkSum() = ~(sum & 0xFF) + 1
}

val acc = new CheckSumAccumulator
val csa = new CheckSumAccumulator

// instance variable
// every instance gets its own set of the variables
//acc.sum = 34
// when you changed one, the other was unaffected.
//println(csa.sum)

// Won't compile, because acc is a val
// acc = new CheckSumAccumulator

// so acc will always point to the same instance
// but fields contained inside the object may change

// One important way to pursue robustness of an object is to
// ensure that the object's state—the values of its instance
// variables—remains valid during its entire lifetime.
// The first step is to prevent outsiders from accessing the fields
// directly by making the fields private


acc.add(18)
println(acc.checkSum())
println(acc.checkSum)