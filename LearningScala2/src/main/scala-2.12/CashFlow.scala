import java.time.LocalDateTime

/**
  * Created by sma54 on 11/12/2016.
  */
case class CashFlow( amount: Double, currency: String, due: LocalDateTime ) {

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
  }
}