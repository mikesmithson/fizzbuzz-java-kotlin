package fizzbuzz.java.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTestKotlin {

	@Test
	fun `you can put in a todo for a test that doesnt exist`() {
		assertThat(System.currentTimeMillis()).isGreaterThan(0)
	}
}

