package fizzbuzz.java.kotlin

import FizzBuzz
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTestKotlin() {
	@Test
	fun `given 0 return '0'`() {
		assertThat(FizzBuzz.fizzBuzz(0)).isEqualTo("0")
	}

	@Test
	fun `given 1 return '1'`() {
		assertThat(FizzBuzz.fizzBuzz(1)).isEqualTo("1")
	}

	@Test
	fun `given 2 return '2'`() {
		assertThat(FizzBuzz.fizzBuzz(2)).isEqualTo("2")
	}

	@Test
	fun `given 3 return 'Fizz'`() {
		assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo("Fizz")
	}

	@Test
	fun `given 4 return '4'`() {
		assertThat(FizzBuzz.fizzBuzz(4)).isEqualTo("4")
	}

	@Test
	fun `given 5 return 'Buzz'`() {
		assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo("Buzz")
	}

	@Test
	fun `given 6 return 'Fizz'`() {
		assertThat(FizzBuzz.fizzBuzz(6)).isEqualTo("Fizz")
	}

	@Test
	fun `given 10 return 'Buzz'`() {
		assertThat(FizzBuzz.fizzBuzz(10)).isEqualTo("Buzz")
	}

	@Test
	fun `given 15 return 'FizzBuzz'`() {
		assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo("FizzBuzz")
	}
}




