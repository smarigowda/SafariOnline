// Scala implicitly imports members of packages java.lang and scala,
// as well as the members of a singleton object named Predef,
// into every Scala source file

import CheckSumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for(arg <- args) {
      println( arg + ":" + calculate(arg))
    }
  }
}
