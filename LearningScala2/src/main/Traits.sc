trait Vehicle {
  def launch
}

trait Boat extends Vehicle {
  override def launch = println("I am a real boat")
}

trait MockBoat extends Vehicle {
  override def launch = println("I am a mock boat")
}

trait Plane extends Vehicle {
  override def launch = println("I am a plane")
}

//class SeaPlane extends Boat with Plane {
//
//}

// trait linearization

class SeaPlane extends Plane with Boat {

}

val s = new SeaPlane
s.launch

// mixin(g) trait during the object creation! Brilliant
val s2 = new SeaPlane with MockBoat
s2.launch


