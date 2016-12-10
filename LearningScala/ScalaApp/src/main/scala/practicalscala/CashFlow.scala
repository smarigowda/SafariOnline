package practicalscala

import java.time.{ LocalDateTime }

class CashFlow(amount: Double, currency: String, due: LocalDateTime) {

  def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due) // auxiliary constructor
  def this(amount: Double) = this(amount, LocalDateTime.now)

  private lazy val processedAt = LocalDateTime.now // value computed only when accessed
  val settle = due.toLocalDate.plusDays(2) // public by default

  def rollForward() = {
    val retval = new CashFlow(amount, currency, due.plusDays(1))
    retval.processedAt
    retval
  }

}

object CashFlow {
  def main(args: Array[String]) = {
    println("Testing CashFlow...")
    val c1 = new CashFlow(100.0)
    println(c1.settle)
    val c2 = c1.rollForward()
    Thread.sleep(10000)
    println(c2.settle)
    println(c1.processedAt)
    println(c2.processedAt)
  }
}

