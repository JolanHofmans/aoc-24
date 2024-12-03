package day3

import day3.MemorySolver.Companion.extractMultiplications
import day3.MemorySolver.Companion.solve
import day3.MemorySolver.Companion.solve2
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class MemorySolverTest {

    @Test
    fun `reading input`() {
        val string = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"

        assertThat(extractMultiplications(string))
            .contains(
                "mul(2,4)",
                "mul(5,5)",
                "mul(11,8)",
                "mul(8,5)")
    }

    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day3/part1/example.txt")

        assertThat(solve(file)).isEqualTo(161)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day3/part1/puzzle.txt")

        println("Result: ${solve(file)}")
    }

    @Test
    fun `test 2`() {
        val file = this::class.java.getResourceAsStream("/day3/part2/example.txt")

        assertThat(solve2(file)).isEqualTo(48)
    }

    @Test
    @Disabled
    fun puzzle2() {
        val file = this::class.java.getResourceAsStream("/day3/part2/puzzle.txt")

        println("Result: ${solve2(file)}")
    }

}