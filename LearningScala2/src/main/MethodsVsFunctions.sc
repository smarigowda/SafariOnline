val square = (n: Int) => n * n


object Test {
  def square(n: Int): Int = {
    n * n
  }
}

val square2 = (n: Int) => Test.square(n)

square2(10)

