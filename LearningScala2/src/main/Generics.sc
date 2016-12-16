class Holder[T](val value: T) {
  def printIt = println(s"value is : $value")
}

val h1 = new Holder(45)