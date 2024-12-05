package day5

import java.io.InputStream
import java.util.stream.IntStream

class WrongPageResolver {
    companion object {
        fun solve(input: InputStream): Int {
            val givenInput = InputReader.readInput(input)

            return givenInput.pages.asSequence()
                .filter {page ->
                    givenInput.rules.asSequence().any { !it.isValidForPage(page) }
                }
                .map { orderCorectly(it, givenInput.rules) }
                .map { it.getMiddlePage() }
                .sum()
        }

        fun orderCorectly(pages: Pages, rules: List<Rule>): Pages {
            val result = mutableListOf<Int>()

            pages.pages.forEach() { page ->
                for (i in 0..result.size) {
                    val tempResult = mutableListOf<Int>()
                    tempResult.addAll(result)

                    tempResult.add(i, page)

                    if (rules.all { it.isValidForPage(Pages(tempResult)) }) {
                        result.add(i, page)
                        break // Exit the loop after adding the first valid page
                    }
                }
            }

            return Pages(result)
        }

    }
}