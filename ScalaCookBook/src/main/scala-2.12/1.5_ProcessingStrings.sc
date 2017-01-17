val upper = "hello world".map(c => c.toUpper)
val upper2 = "hello world".map(_.toUpper)

"hello world".filter(c => c != 'l').map(_.toUpper)

for(c <- "hello") println(c)

// for like a map
val upper3 = for(c <- "hello world") yield c.toUpper

val upper4 = for(c <- "hello world" if c != 'l') yield c.toUpper

"hello".foreach(println)

"Hello".map {
  c => {
    c.toByte + 32
  }
}

def toLower = (c: Char) => (c.toByte + 32).toChar

"HELLO".map(toLower)