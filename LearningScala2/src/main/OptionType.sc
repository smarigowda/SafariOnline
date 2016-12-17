val opt = Some(1)
val none = None

opt.get

case class User(name: String, city: Option[String])

val user1 = User("Santosh", Some("Reading"))
val user2 = User("Linganna", Some("Bangalore"))
val user3 = User("NoMan", None)

user1.city.get
// user3.city.get // NoSuchElementException
user3.city.getOrElse("City is None")
user1.city.getOrElse("City is None")


val users = List(
  User("Santosh", Some("UK")),
  User("Jim", None),
  User("Linganna", Some("India")),
  User("Tom", None)
)

// note None disappears
val cities = users.flatMap(x => x.city)
