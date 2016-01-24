def fizzbuzz(): Unit = {
	for(x <- 1 to 100) {
		x match {
			case x if x % 3 == 0 && x % 5 == 0 => println("fizzbuzz")
			case x if x % 3 == 0 => println("fizz")
			case x if x % 5 == 0 => println("buzz")
			case x => println(x)
		}
	}
}

fizzbuzz()