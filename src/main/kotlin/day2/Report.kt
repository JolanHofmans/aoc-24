package day2

import java.io.InputStream
import java.util.stream.IntStream
import kotlin.streams.asSequence

data class Report(val levels: List<Int>) {

    fun isDampenerSafe() = isSafe() || isSafeWithMissingValue()

    fun isSafe() = (isDecreasing() || isIncreasing()) && hasProperLevelDifference()

    fun isIncreasing() = levels == levels.sorted()

    fun isDecreasing() = levels == levels.sortedDescending()

    fun hasProperLevelDifference() : Boolean{
        return levels.asSequence()
            .mapIndexed { index, level ->
                if (index < levels.size - 1) {
                    Math.abs(levels[index + 1] - level)
                } else {
                    2
                }
            }
            .filter { it == 0 || it > 3 }
            .count() == 0
    }

    fun isSafeWithMissingValue() : Boolean {
        return IntStream.range(0, levels.size)
            .asSequence()
            .map{
                val duplicateLevels = mutableListOf<Int>()
                duplicateLevels.addAll(levels)
                duplicateLevels
            }
            .mapIndexed() { index, duplicateLevels ->
                duplicateLevels.removeAt(index)
                duplicateLevels
            }
            .filter { Report(it).isSafe() }
            .count() > 0
    }

    companion object {
        fun solve(input: InputStream): Int {
            val reports = parseReports(input)
            return reports.asSequence()
                .filter { it.isSafe() }
                .count()
        }

        fun solveDampener(input: InputStream): Int {
            val reports = parseReports(input)
            return reports.asSequence()
                .filter { it.isDampenerSafe() }
                .count()
        }

        private fun parseReports(input: InputStream): List<Report> {
            val lines = input.bufferedReader().readLines()
            return lines.map {
                Report(it.split(" ").map { it.toInt() })
            }
        }
    }

}
