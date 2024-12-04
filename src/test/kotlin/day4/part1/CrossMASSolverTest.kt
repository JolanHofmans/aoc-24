package day4.part1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CrossMASSolverTest {
    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day4/part1/example.txt")

        assertThat(CrossWordSolver.solve(file)).isEqualTo(18)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day4/part1/puzzle.txt")

        println("Result = ${CrossWordSolver.solve(file)}")
    }
}