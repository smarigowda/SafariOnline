class Holder[+T](val value: T) {
  def printIt = println(s"value is : $value")
}

val h1 = new Holder(45)

class Worker
class Employee extends Worker

val h2 = new Holder(new Employee)

val h3: Holder[Worker] = h2