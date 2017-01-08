class CheckSumAccumulator {
  private var sum = 0
  // method parameters are vals
  // In this form, the method looks like a procedure,
  // a method that is executed only for its side effects
  def add(b: Byte) { sum += b }
  def checkSum() = ~(sum & 0xFF) + 1
}

object CheckSumAccumulator {
  private var cache = Map[String, Int]()

  def calculate(s: String): Int = {
    if(cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for( c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }
  }
}