package org.example.day1.part1

import java.io.InputStream

class InputParser {

    companion object {
        fun parseInput(input: InputStream): SideBySideLists {
            val lines = input.bufferedReader().readLines()
            val leftLocationIds = lines.map { it.split("   ")[0] }
            val rightLocationsIds = lines.map { it.split("   ")[1] }
            return SideBySideLists(leftLocationIds, rightLocationsIds)
        }
    }
}