def max(a: Int, b: Int, c: Int) = {
	def max(x: Int, y: Int) = if (x > y) x else y
	max(a, max(b, c))
}

//println(max(3, 4, 5))

// example of a vararg parameter
def sum(items: Int*): Int = {
	var total = 0
	for (i <- items) total += i
	total
}