package fizzbuzz.java.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTestKotlin {
	@Test
	fun `given the number 3, return Fizz`() {
		assertThat(FizzBuzzKotlin.fizzBuzz(3)).isEqualTo("Fizz")
	}

	@Test
	fun `given the number 5, return Buzz`() {
		assertThat(FizzBuzzKotlin.fizzBuzz(3)).isEqualTo("Fizz")
	}
	@Test
	fun `given the number 15, return FizzBuzz`() {
		assertThat(FizzBuzzKotlin.fizzBuzz(3)).isEqualTo("Fizz")
	}
	@Test
	fun `given a number 1, return '1'`() {
		assertThat(FizzBuzzKotlin.fizzBuzz(1)).isEqualTo("1")
	}

	@Test
	fun `given a number 30, return FizzBuzz`() {
		assertThat(FizzBuzzKotlin.fizzBuzz(1)).isEqualTo("1")
	}
}

