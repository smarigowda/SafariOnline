import scala.collection.mutable.ArrayBuffer


val a = Array(2, 3, 4, 5, 6, 7, 8)

val result = for(elem <- a) yield 2 * elem
result

val result2 = for(elem <- a if(elem % 2 == 0)) yield 2 * elem
result2

val b = ArrayBuffer(1, 3, 6, 2, 56, 94, 34)
b.sorted
b

val sortedB = b.sorted

sortedB.reverse

sortedB.toString()

Array(1, 2, 3,4, 5).toString
Array(2, 3, 4, 5, 6, 7).mkString(" | ")


