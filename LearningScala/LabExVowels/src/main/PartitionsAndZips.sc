"New York".partition(_.isUpper)

val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
pairs

import scala.collection.mutable.ArrayBuffer
val buf = ArrayBuffer(1,2,-3,4,5,-6,7,-8)
val (neg, pos) = buf.partition(_ < 0)
val result = pos
result += neg(0)
result

