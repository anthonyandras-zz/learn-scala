// def safeStringOp(s: String, f: String => String) = {
// 	if(s != null) f(s) else s
// }

def safeStringOp(s: String)(f: String => String) = {
	if(s != null) f(s) else s
}


def reverser(s: String) = s.reverse

//safeStringOp(null, reversern)

//println(safeStringOp("Anthony" s => s.reverse))

// using placeholder syntax can be used 
// because the input parameter is used only once

//println(safeStringOp(null, _.reverse))
//println(safeStringOp("Anthony", _.reverse))

def doubles(x: => Int) = {
	println("Now Doubling " + x)
	x * 2
}

//println(doubles(5))

def f(i: Int) = { println(s"Hello from f($i)"); i }
//println(doubles( f(8) ))

val uuid = java.util.UUID.randomUUID.toString
// val timedUUID = safeStringOp(uuid, {s =>
// 	val now = System.currentTimeMillis
// 	val timed = s.take(24) + now
// 	timed.toUpperCase
// })

// using currying values seems a bit cleaner
val timedUUID = safeStringOp(uuid) {s =>
	val now = System.currentTimeMillis
	val timed = s.take(24) + now
	timed.toUpperCase
}
// wow that feels like ruby.


// generic functions leveraging by-name parameters!
def timer[A](f: => A): A = {
	def now = System.currentTimeMillis
	val start = now; val a = f; val end = now
	println(s"Executed in ${end - start} ms")
	a
}

val veryRandomAmount = timer {
	util.Random.setSeed(System.currentTimeMillis)
	for(i <- 1 to 10000) util.Random.nextDouble
	util.Random.nextDouble
}

// if you are reading this and are struggling, refer to 
// page 79 of learning-scala. this is page 97 in the pdf
// do not give up.
