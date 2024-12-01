package org.example.day1.part1

import java.io.InputStream

class PuzzleSolver {

    companion object {
        fun solve(input: InputStream): Int {
            val sideBySideLists = InputParser.parseInput(input)
            return  SideBySideListsSorter.sort(sideBySideLists).asSequence()
                .map { it.distance() }
                .sum()
        }
    }
}