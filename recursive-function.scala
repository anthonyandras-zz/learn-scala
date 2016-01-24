@annotation.tailrec
def power(x: Int, n: Int, t: Int = 1): Long = {
	if (n < 1) t
	else power(x, n-1, x*t)

	//if(n >= 1) x * power(x, n-1)
	//else 1
}