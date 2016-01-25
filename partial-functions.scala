// a partial function only accepts
// a partial amount of all possible
// input values

val statusHandler: Int => String = {
	case 200 => "Okay"
	case 400 => "Your Error"
	case 500 => "Our error"
}

println(statusHandler(200))
println(statusHandler(400))