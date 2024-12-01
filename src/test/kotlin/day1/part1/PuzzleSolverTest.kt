package day1.part1

import org.assertj.core.api.Assertions.assertThat
import org.example.day1.part1.PuzzleSolver
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.io.InputStream

class PuzzleSolverTest {
    @Test
    fun example() {
        val file: InputStream = this::class.java.getResourceAsStream("/day1/part1/exampleInput.txt")

        assertThat(PuzzleSolver.solve(file)).isEqualTo(11)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file: InputStream = this::class.java.getResourceAsStream("/day1/part1/puzzle.txt")

        val result = PuzzleSolver.solve(file)

        println("Solution to puzzle1.1 = $result")
    }
}