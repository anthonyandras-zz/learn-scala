// simple example of a lambda, or annon function
val greeter = (name: String) => s"Hello $name"

// another toy function using lambda syntax
val maximize = (a: Int, b: Int) => if (a > b) a else b

// function literals, or lambdas, don't always need args
val printMyName = () => println("Hello Me")

// we can use placeholder syntax to replace named params with 
// wildcard operators
val doubler: Int => Int = _ * 2

def combination(x: Int, y: Int, f:(Int, Int) => Int) = f(x, y)

// _ * _ is replacing the input parameters (x, y) respectively
// combination(23, 12, _ * _)

def tripleOp(a: Int, b: Int, c: Int, f:(Int, Int, Int) => Int) = f(a, b, c)
//tripleOp(23, 92, 14, _ * _ + _)