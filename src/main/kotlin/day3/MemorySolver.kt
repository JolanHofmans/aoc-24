package day3

import day3.Multiplication.Companion.parse
import java.awt.SystemColor.text
import java.io.InputStream
import java.util.regex.Matcher
import java.util.regex.Pattern


class MemorySolver {

    companion object {

        fun solve(input: InputStream): Int {
            return read(input).asSequence()
                .map { extractMultiplications(it) }
                .flatMap { it.asSequence() }
                .map { parse(it) }
                .map { it.multiply() }
                .sum()
        }

        fun solve2(input: InputStream): Int {
            val multiplicationFilter = MultiplicationFilter(true)
            return read(input).asSequence()
                .map { extractExecutedInstructions(it) }
                .flatMap { it.asSequence() }
                .filter { multiplicationFilter.filter(it) }
                .map { parse(it) }
                .map { it.multiply() }
                .sum()
        }

        fun read(input: InputStream): List<String> {
            return input.bufferedReader().readLines()
        }

        fun extractMultiplications(string: String): List<String> {
            val matches = mutableListOf<String>()
            val regex = Regex(pattern = "mul\\([0-9]*,[0-9]*\\)")
            val m: Matcher = Pattern.compile("(?=($regex))").matcher(string)
            while (m.find()) {
                matches.add(m.group(1));
            }
            return matches
        }

        fun extractExecutedInstructions(string: String): List<String> {
            val matches = mutableListOf<String>()
            val regex = Regex(pattern = "(mul\\([0-9]*,[0-9]*\\))|(do\\(\\))|(don\\'t\\(\\))")
            val m: Matcher = Pattern.compile("(?=($regex))").matcher(string)
            while (m.find()) {
                matches.add(m.group(1));
            }

            return matches
        }
    }
}