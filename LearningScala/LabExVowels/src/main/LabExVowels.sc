//def vowels3(s: String): String = {
//  if(s.length == 0 ) ""
//  else {
//    val ch = s(0)
//    val rest = vowels3(s.substring(1))
//    if(isVowel(ch)) ch + rest else rest
//  }
//}
//
//vowels3("Mississippi")
//
//def vowels4(s: String): String = {
//  var i = 0
//  var result = ""
//  while( i < s.length) {
//    if(isVowel(s(i))) result += s(i)
//    i += 1
//  }
//  result
//}
//
//vowels4("Mississippi")
//
//def isVowel(ch: Char) = {
//  var vowel = false
//  for( v <- "aeiou" ) if (ch == v) vowel = true
//  vowel
//}

//def vowels(s: String) = for( ch <- s if isVowel(ch)) yield ch

def isVowel(ch: Char, vowelChars: String) = vowelChars.contains(ch)

//def vowels(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true) =
//  for( ch <- (if(ignoreCase) s.toLowerCase else s) if isVowel(ch, vowelChars)) yield ch

def vowels(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true): String =
  if(ignoreCase) vowels(s.toLowerCase, vowelChars, false)
  else for( ch <- s if isVowel(ch, vowelChars) ) yield ch

vowels("Nikaraguava")
vowels("Aississippi", ignoreCase = false)
vowels("Aississippi", vowelChars = "A", ignoreCase = false)