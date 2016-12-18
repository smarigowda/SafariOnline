import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val f1 = Future { Thread.sleep(5000); 50 }

val f2 = f1.map(x => x * 10)

Thread.sleep(6000)
println(f2.value)

// we can now chain operations

val f3 = f1.map(x => x * 1000).filter(x => x > 0)

Thread.sleep(2000)
println(f3.value)
