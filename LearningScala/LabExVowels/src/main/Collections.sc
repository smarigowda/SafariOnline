object Collections {

  println("Welcome to the worksheet")
  val a = new Array[Int](10)

  for( i <- 0 until a.length) a(i) = i * i
  a
  for(elem <- a) println(elem)

  import scala.collection.mutable.ArrayBuffer
  val b = ArrayBuffer("Santosh", "Roopa", "Sukruthi")
  b+= "Samarth"
  b+= ("Lingaraju", "Bharathi")
  b++= Array("Mandya", "Kodiyala")
  b.remove(2)
  b
  b.insert(2, "SUKRUTHI")
  b

  b.trimEnd(2)
  b
  
}