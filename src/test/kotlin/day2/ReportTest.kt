package day2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class ReportTest {

    @Test
    fun example() {
        val file = this::class.java.getResourceAsStream("/day2/example.txt")

        assertThat(Report.solve(file)).isEqualTo(2)
    }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day2/puzzle.txt")

        println("Result = ${Report.solve(file)}")
    }

    @Test
    fun exampleDampener() {
        val file = this::class.java.getResourceAsStream("/day2/example.txt")

        assertThat(Report.solveDampener(file)).isEqualTo(4)
    }

    @Test
    @Disabled
    fun puzzleDampener() {
        val file = this::class.java.getResourceAsStream("/day2/puzzle.txt")

        println("Result = ${Report.solveDampener(file)}")
    }
}