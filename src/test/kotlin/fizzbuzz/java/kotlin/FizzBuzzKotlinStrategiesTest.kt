package fizzbuzz.java.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzKotlinStrategiesTest {
	@Test
	fun `given a number divisible by 3, return 'Fizz' from fizz strategy`() {
		assertThat(fizzStrategy.invoke(Pair(3, EMPTY))).isEqualTo(Pair(3, "Fizz"))
	}

	@Test
	fun `given a number not divisible by 3, return '' from fizz strategy`() {
		assertThat(fizzStrategy.invoke(Pair(4, EMPTY))).isEqualTo(Pair(4, EMPTY))
	}

	@Test
	fun `given a number divisible by 5, return 'Buzz' from buzz strategy`() {
		assertThat(buzzStrategy.invoke(Pair(5, EMPTY))).isEqualTo(Pair(5, "Buzz"))
	}

	@Test
	fun `given a number not divisible by 5, return '' from buzz strategy`() {
		assertThat(buzzStrategy.invoke(Pair(4, EMPTY))).isEqualTo(Pair(4, EMPTY))
	}

	@Test
	fun `given an identity strategy, when passing 1 return "1"`() {
		assertThat(identityStrategy.invoke(Pair(1, EMPTY))).isEqualTo(Pair(1, "1"))
	}

	@Test
	fun `given an identity strategy, when passing 3 return ""`() {
		assertThat(identityStrategy.invoke(Pair(3, EMPTY))).isEqualTo(Pair(3, EMPTY))
	}

	@Test
	fun `given an identity strategy, when passing 5 return ""`() {
		assertThat(identityStrategy.invoke(Pair(5, EMPTY))).isEqualTo(Pair(5, EMPTY))
	}
}
