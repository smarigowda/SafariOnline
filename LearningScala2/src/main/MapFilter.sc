val people = List(
  List("satnosh", "roopa", "sukruthi"),
  List(),
  List("samarth"),
  List("lingaraju", "bharathi")
)

val lst = List(1, 2, 3, 4, 5, 6)
lst.filter(n => n % 2 == 0)

lst.map(n => n + 2)

lst.map(_ + 2)


// get only the people
val onlyPeople = people.flatten
