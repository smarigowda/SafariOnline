trait Vehicle {
  def launch
}

trait Boat extends Vehicle {
  override def launch = println("I am a boat")
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


