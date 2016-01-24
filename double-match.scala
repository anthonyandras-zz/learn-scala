val someAmount = 5.50
// note that someAmount appears to be an argument to match
someAmount match {
	case amount if amount > 0 => println("greater")
	case amount if amount == 0 => println("same")
	case amount => println("less")
}