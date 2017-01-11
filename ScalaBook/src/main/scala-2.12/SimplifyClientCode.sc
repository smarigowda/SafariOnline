def containsNegative(nums: List[Int]): Boolean = {
  var exists = false
  for(num <- nums)
    if(num < 0)
      exists = true
  exists
}

println(containsNegative(List(1, 2, -3, 4, 5, 67)))
println(containsNegative(List(1, 2, 3, 4, 5, 67)))