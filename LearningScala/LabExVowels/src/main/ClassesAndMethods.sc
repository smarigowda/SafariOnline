class Point(val x: Double, val y: Double) {
  def move(dx: Double, dy: Double) = new Point(x+dx, y+dy)
  def distanceFromOrigin = math.sqrt(x*x + y*y)
  override def toString = f"(${x}, ${y})"
}

val p = new Point(3, 4)
p.move(10, 20)

p.distanceFromOrigin

p.x
p.y

//p.x = 34

