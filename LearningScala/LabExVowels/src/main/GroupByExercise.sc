println("Welome to group by exercise...")

val words = Array("Mary", "Had", "a", "little", "lamb")

val groupby = words.groupBy(_.substring(0, 1))
for( ele <- groupby) println(ele)

words.groupBy(_.length)


