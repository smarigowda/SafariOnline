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


// trade off
// give up some control on mechanics
// for the computer to work on your behalf
val peopleCaps = people.flatten.map(name => name.capitalize)

val peopleCaps2 = people.flatMap(p => p.map(name => name.capitalize))

// delightfully clever at the expense of less maintainable code
// we write code once but read lots and lots of time
val peopleCapsTerse = people.flatMap(_.map(_.capitalize))


val lstCities = List("bangalore", "mysore", "mandya", "kodiyala")
val lstCities2 = List("bangalore", "mysore", 41, "mandya", "kodiyala")

// using lamda
// can not catch issue with bad data
lstCities.map(name => name.capitalize)

// using partial functions we can deal issues with bad data
lstCities2.map({
  case s: String => s.capitalize
})