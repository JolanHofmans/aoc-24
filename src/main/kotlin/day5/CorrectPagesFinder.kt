package day5

import java.io.InputStream

class CorrectPagesFinder {
    companion object {
        fun solve(input: InputStream): Int {
            val givenInput = InputReader.readInput(input)

            return givenInput.pages.asSequence()
                .filter {page ->
                    givenInput.rules.asSequence().all { it.isValidForPage(page) }
                }
                .map { it.getMiddlePage() }
                .sum()
        }
    }
}