package day1.part2

import org.assertj.core.api.Assertions.assertThat
import org.example.day1.part2.PuzzleSolver
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class PuzzleSolverTest {

    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day1/part1/exampleInput.txt")

        assertThat(PuzzleSolver.solve(file)).isEqualTo(31)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day1/part2/puzzle.txt")

        val result = PuzzleSolver.solve(file)

        println("Solution to puzzle1.2 = $result")
    }
}