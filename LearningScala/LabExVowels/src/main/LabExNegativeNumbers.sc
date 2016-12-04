import scala.collection.mutable.ArrayBuffer

val buf = ArrayBuffer(1, 2, -3, 4, -5, 6, 7, -8)




def removeAllButFirstNegative(buf: ArrayBuffer[Int]) = {
  val indexes = for(i <- 0 until buf.length if(buf(i) < 0)) yield i
  val indexesToRemove = indexes.drop(1)
  indexesToRemove.reverse
  for( i <- indexesToRemove.reverse) buf.remove(i)
}

def removeAllButFirstNegativeV2(buf: ArrayBuffer[Int]) = {
  val indexesToRemove = (for(i <- 0 until buf.length if(buf(i) < 0)) yield i).drop(1)
  for( i <- indexesToRemove.reverse) buf.remove(i)
}

def removeAllButFirstNegativeV3(buf: ArrayBuffer[Int]) = {
  for( i <- (for(i <- 0 until buf.length if(buf(i) < 0)) yield i).drop(1).reverse) buf.remove(i)
}

def removeAllButFirstNegativeV4(buf: ArrayBuffer[Int]) = for( i <- (for(i <- 0 until buf.length if(buf(i) < 0)) yield i).drop(1).reverse) buf.remove(i)

//removeAllButFirstNegative(buf)
//removeAllButFirstNegativeV2(buf)
//removeAllButFirstNegativeV3(buf)
removeAllButFirstNegativeV4(buf)

buf




