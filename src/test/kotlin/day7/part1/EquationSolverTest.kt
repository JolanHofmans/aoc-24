package day7.part1

import day7.EquationSolver
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class EquationSolverTest {
  @Test
  fun example() {
   val file = this::class.java.getResourceAsStream("/day7/part1/example.txt")

   assertThat(EquationSolver.solve(file)).isEqualTo(3749)
  }

    @Test
    @Disabled
    fun puzzle() {
        val file = this::class.java.getResourceAsStream("/day7/part1/puzzle.txt")

        println("Result = ${EquationSolver.solve(file)}")
    }

    @Test
    fun example2() {
        val file = this::class.java.getResourceAsStream("/day7/part1/example.txt")

        assertThat(EquationSolver.solve2(file)).isEqualTo(11387)
    }

    @Test
    @Disabled
    fun puzzle2() {
        val file = this::class.java.getResourceAsStream("/day7/part2/puzzle.txt")

        println("Result = ${EquationSolver.solve2(file)}")
    }
 }