// a cleaner way to partially apply functions 
// is to use functions with multiple parameter
// lists
def factorOf(x: Int)(y: Int) = y % x == 0
val isEven = factorOf(2) _
val z = isEven(32)