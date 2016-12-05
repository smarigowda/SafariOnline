val in = new java.util.Scanner(new java.net.URL("http://horstmann.com/presentations/livelessons-scala-2016/alice30.txt").openStream)

//val count = scala.collection.mutable.Map[String, Int]()

var count = Map[String, Int]()

//count = count + ("Alice" -> 10)
//count = count + ("Alice" -> 11)
//count

while(in.hasNext) {
  val word = in.next()
  count = count + (word -> (count.getOrElse(word, 0) + 1))
//  println(word)
}

count("Alice")
count("Rabbit")





