package day7

import java.io.InputStream

class EquationSolver {

    companion object {
        fun solve(input: InputStream): Long {
            val equations = InputInterpreter.interprete(input)
            return equations.asSequence()
                .filter { it.canAchieveTotalWithSumAndProduct() }
                .map { it.total }
                .sum()
        }

        fun solve2(input: InputStream): Long {
            val equations = InputInterpreter.interprete(input)
            return equations.asSequence()
                .filter { it.canAchieveTotalWithSumAndProductAndConcatenation() }
                .map { it.total }
                .sum()
        }

    }
}