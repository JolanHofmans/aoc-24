package day4.part2

import day4.part1.CrossWordSolver
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CrossMASSolverTest {
    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day4/part2/example.txt")

        assertThat(CrossMASSolver.solve(file)).isEqualTo(9)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day4/part2/puzzle.txt")

        println("Result = ${CrossMASSolver.solve(file)}")
    }
}