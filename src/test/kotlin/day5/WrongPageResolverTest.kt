package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class WrongPageResolverTest {
    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day5/example.txt")

        assertThat(WrongPageResolver.solve(file)).isEqualTo(123)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day5/puzzle.txt")

        println("Result = ${WrongPageResolver.solve(file)}")
    }
}