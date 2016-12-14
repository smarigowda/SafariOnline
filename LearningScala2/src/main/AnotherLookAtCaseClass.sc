import java.time.LocalDateTime

case class CashFlow(amount: Double, currency: String, due: LocalDateTime)

// cd SafariOnline/LearningScala2/target/scala-2.12/classes
// use javap -c CashFlow\$.class
// have a look at apply method

// when we construct the objects using below syntax
// it is the apply method which gets called.
val cf1 = CashFlow(1000.00, "GBP", LocalDateTime.now)


