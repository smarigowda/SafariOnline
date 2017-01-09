import scala.io.Source

// functions as method, private method
object LongLines {
  def processFiles(filename: String, width: Int): Unit = {
    val source = Source.fromFile(filename)
    for(line <- source.getLines) {
      processLine(filename, width, line)
    }
  }

  private def processLine(filename: String, width: Int, line: String): Unit = {
    if(line.length > width) {
      println(filename + " : " + line.trim)
    }
  }
}

val fname = "/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12/ControlStructure.sc"
LongLines.processFiles(fname, 40)

// using local function
// function inside function

def processFile(filename: String, width: Int): Unit = {

  def processLine(line: String): Unit = {
    if(line.length > width) {
      println(filename + ": " + line)
    }
  }

  val source = Source.fromFile(filename)
  for(line <- source.getLines) {
    processLine(line)
  }
}

processFile(fname, 40)