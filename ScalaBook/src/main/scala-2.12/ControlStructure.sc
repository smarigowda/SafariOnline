val fileexists = true

var filename = ""

if(fileexists)
  filename = "default.txt"

// if is an expression, so we can write
filename = if(fileexists) "default.txt" else ""

println(filename)

// or even
println(if(fileexists) "default.txt" else "")




