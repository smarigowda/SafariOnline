object FileMatcher {
  private def filesHere = (new java.io.File("/Users/sma54/SAN/github/SafariOnline/ScalaBook/src/main/scala-2.12")).listFiles

  private def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for(file <- filesHere; if(matcher(file.getName, query)))
      yield file
  }

  def filesEnding(query: String) = {
    filesMatching(query: String, (filename: String, query: String) => { filename.endsWith(query) })
  }

  def filesContaining(query: String) = {
    filesMatching(query, _.contains(_))
  }

  def filesRegex(query: String) = {
    filesMatching(query, _.matches(_))
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
