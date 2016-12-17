// for comprehension

// <- generator operator

1 to 5 // range object

for( i <- 1 to 5) {
  println(i)
}

for((k, v) <- List("Santosh" -> 43, "Roopa" -> 39)) {
  println(s"key = $k value = $v")
}

// multiple generator elements
// nested loop
for((k,v) <- List("Sky" -> 34, "Vodafone" -> 45); i <- 1 to 4) {
  println(s"key= $k i= $i")
}

for((k,v) <- List("Sky" -> 34, "Vodafone" -> 45) if(v > 35); i <- 1 to 4) {
  println(s"key= $k i= $i")
}