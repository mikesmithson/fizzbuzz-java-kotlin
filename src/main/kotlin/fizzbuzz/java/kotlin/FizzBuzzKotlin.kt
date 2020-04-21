package fizzbuzz.java.kotlin

object FizzBuzzKotlin {
	fun fizzBuzz(number: Int): String =
			identityStrategy
			.invoke(fizzStrategy
			.invoke(buzzStrategy
			.invoke(Pair(number, EMPTY))))
			.second
}
