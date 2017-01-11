object FileMatcher {
  private def filesHere = (new java.io.File("/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12")).listFiles

  def filesEnding(query: String) = {
    for (file <- filesHere; if (file.getName.endsWith(query)))
      yield file
  }

  def filesContaining(query: String) = {
    for(file <- filesHere; if(file.getName.contains(query)))
      yield file
  }

  def filesRegex(query: String) = {
    for(file <- filesHere; if(file.getName.matches(query)))
      yield file
  }

}

val filteredFiles1 = FileMatcher.filesEnding(".sc")
val filteredFiles2 = FileMatcher.filesContaining("Class")
val filteredFiles3 = FileMatcher.filesRegex(".*")

for(file <- filteredFiles1) {
  println(file)
}

for(file <- filteredFiles2) {
  println(file)
}

for(file <- filteredFiles3) {
  println(file)
}
