def identity[A](a: A): A = a

val s: String = identity[String]("Hello")
println(s)

val d: Double = identity[Double](1.245)
println(d)