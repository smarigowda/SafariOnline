import java.time.LocalDateTime

/**
  * Created by sma54 on 11/12/2016.
  */
case class CashFlow( amount: Double, currency: String, due: LocalDateTime ) {

}

case class Address(city: String, country: String) {

}

case class Person(name: String, age: Int, address: Address) {

}


object CashFlow {
  def main(args: Array[String]) = {
    println("main class")
    val c1 = CashFlow(300.00, "GBP", LocalDateTime.now)

    c1 match {
      case CashFlow(v, "USD", _) => println("USD Cash Flow...")
      case CashFlow(v, "GBP", _) => println(s"UK Cash Flow... value = $v")
      case _ => println("default")
    }

    val a1 = Address("London", "UK")
    val a2 = Address("New York", "USA")

    val p1 = Person("Santosh", 43, a1)
    val p2 = Person("Lingaraju", 45, a2)

    p1 match {
      case Person(name, _, Address("London", _)) => {
        println(s"$name lives in London")
      }
    }

    p2 match {
      case Person(name, age, _) if age > 30 => {
        println(s"$name is older than 30")
      }
    }


  }
}