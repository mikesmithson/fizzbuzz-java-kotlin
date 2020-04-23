package fizzbuzz.java.kotlin

const val EMPTY = ""
val fizzPredicate: (Pair<Int, String>) -> Boolean = { it.first % 3 == 0 }
val buzzPredicate: (Pair<Int, String>) -> Boolean = { it.first % 5 == 0 }
val fizzBuzzPredicate: (Pair<Int, String>) -> Boolean = { fizzPredicate.invoke(it).or(buzzPredicate.invoke(it)) }

val fizzStrategy: (Pair<Int, String>) -> Pair<Int, String> = {
	it.takeUnless(fizzPredicate) ?: Pair(it.first, "Fizz${it.second}")
}

val buzzStrategy: (Pair<Int, String>) -> Pair<Int, String> = {
	it.takeUnless(buzzPredicate) ?: Pair(it.first, "${it.second}Buzz")
}

val identityStrategy: (Pair<Int, String>) -> Pair<Int, String> = { 
	it.takeIf { fizzBuzzPredicate(it) } ?: Pair(it.first, "${it.first}")
}
