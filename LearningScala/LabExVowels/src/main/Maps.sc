var scores = Map("Alice" -> 10, "Bob" -> 34, "Lucy" -> 67)

"Sukruthi" -> 78

scores("Alice")

//scores("Suki")

scores.getOrElse("Suki", 100)

scores + ("Sukruthi" -> 67) + ("Alice" -> 11)
scores

scores = scores + ("Sukruthi" -> 89)
scores

scores = scores - ("Alice")
scores

for( (k, v) <- scores)
  println(k + " has scored...." + v)


// note
// result of for yield is same type as the element we are operating on
val revScores = for( (k, v) <- scores) yield (v, k)
revScores



