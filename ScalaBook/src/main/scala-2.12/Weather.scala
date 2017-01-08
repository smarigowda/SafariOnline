import CheckSumAccumulator.calculate

// App is a trait, scala.App
// The App trait can be used to quickly turn objects into executable programs.
// It should also be noted that the main method
// should not be overridden: the whole class body becomes
// the “main method”.

// The code between the curly braces is collected into a primary
// constructor of the singleton object, and is executed when the class is initialized
object Weather extends App {
  for(season <- List("fall", "winter", "spring")) {
    println(season + " : " + calculate(season))
  }
}

// you can't use this trait if you need to access command-line arguments, because the args array isn't available
// because of some restrictions in the JVM threading model, you need an explicit main method if your program is multi-threaded
// So you should inherit from Application only when your program is relatively simple and single-threaded