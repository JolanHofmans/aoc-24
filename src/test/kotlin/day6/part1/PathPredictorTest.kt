package day6.part1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PathPredictorTest {
    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day6/part1/example.txt")

        assertThat(PathPredictor.predictPath(file)).isEqualTo(41)
    }

    @Test
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day6/part1/puzzle.txt")

        println("Result = ${PathPredictor.predictPath(file)}")
    }
}