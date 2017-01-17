val name = "Santosh"
val age = 33
val weight = 66
println(s"$name is $age years old, and weighs $weight kgs.")
// expression
println(s"Age next year = ${age + 1}")
// equality check
println(s"You are 33 years old: ${age == 33}")

// printing object fields
case class Student(name: String, score: Int)

val santu = Student("Santosh", 95)
println(s"${santu.name} has a score of ${santu.score}")

// s is a method

// f string interpolation
// format print
println(f"$name is $age years old and weighs $weight%.2f pounds")
println(f"$name is $age years old and weighs $weight%.0f pounds")

// raw interpolator
s"foo\nbar"

raw"foo\nbar"

// store formatted string in a variable
val s = "%s is %d years old".format(name, age)