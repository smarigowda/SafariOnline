import java.time.LocalDateTime

class Pet {
  def feed() = {
    "Feeding at: " + LocalDateTime.now
  }
}

class Cat extends Pet {
  def hunt() = {
    println("Cat hunts")
  }
}

val c = new Cat

println(c.feed())

var p: Pet = new Cat

class Dog extends Pet {
  override val feed = {
    "Dog eating..."
  }
}

val d = new Dog

d.feed






