package org.example.day1.part2

import org.example.day1.part1.InputParser
import java.io.InputStream

class PuzzleSolver {

    companion object {
        fun solve(input: InputStream): Int {
            val sideBySideLists = InputParser.parseInput(input)
            return sideBySideLists.leftLocationIds.asSequence()
                .map { SimilarityCalculator.calculate(it, sideBySideLists.rightLocationsIds) }
                .sum()
        }
    }
}