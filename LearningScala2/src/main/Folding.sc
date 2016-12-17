val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

// sum
lst.foldLeft(0)((acc, nxt) => { acc + nxt })

// product
lst.foldLeft(1)((acc, nxt) => { acc * nxt })