def factorOf(x: Int, y: Int) = y % x == 0

// using wildcard syntax, create a function pointer
val f = factorOf _ 
val x = f(7, 20)

// we can partially apply functions with 
// the wildcard operator...
val multipleOf3 = factorOf(3, _:Int)
val y = multipleOf3(78)
