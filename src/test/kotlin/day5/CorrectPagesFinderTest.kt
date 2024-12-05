package day5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CorrectPagesFinderTest {

    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day5/example.txt")

        assertThat(CorrectPagesFinder.solve(file)).isEqualTo(143)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day5/puzzle.txt")

        println("Result = ${CorrectPagesFinder.solve(file)}")
    }
}