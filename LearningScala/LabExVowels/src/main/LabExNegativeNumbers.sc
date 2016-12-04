import scala.collection.mutable.ArrayBuffer

val buf = ArrayBuffer(1, 2, -3, 4, -5, 6, 7, -8)




def removeAllButFirstNegative(buf: ArrayBuffer[Int]) = {
  val indexes = for(i <- 0 until buf.length if(buf(i) < 0)) yield i
  val indexesToRemove = indexes.drop(1)
  indexesToRemove.reverse
  for( i <- indexesToRemove.reverse) buf.remove(i)
}

removeAllButFirstNegative(buf)
buf




