// Map case class, calls apply method
// can be thought of as a partial function
val ages = Map("Santosh" -> 43, "Roopa" -> 40)
val ages2 = Map(("Santosh", 43), "Roopa" -> 40)


val d = ages("Santosh")

//val b = ages("Sukruthi") // Throws
val c = ages.get("Sukruthi")
val e = ages.getOrElse("Sukruthi", 11)

val test = ages.contains("Santosh")
val test3 = ages.isDefinedAt("Santosh")
val test2 = ages.contains("Lingaraju")

val ages3 = ages2 + ("Linganna" -> 45)
val ages4 = ages2 + (("Linganna", 45), ("Samarth" -> 25))

val concated = ages4 ++ Map("Bill" -> 34, "Jill" -> 35)


val duplicatekeys = Map("Santosh" -> 43) ++ Map("Santosh" -> 44)