package day5

import java.io.InputStream

class InputReader {
    companion object {

        fun readInput(input: InputStream): GivenInput {
            val stringRule = mutableListOf<String>()
            val stringPage = mutableListOf<String>()

            input.bufferedReader().readLines().forEach{
                if(it.contains("|")) {
                    stringRule.add(it)
                } else if (it.contains(",")) {
                    stringPage.add(it)
                }
            }

            val rules = parseRules(stringRule)
            val pages = parsePages(stringPage)

            return GivenInput(rules, pages)
        }

        private fun parsePages(stringPage: List<String>) = stringPage.asSequence()
            .map {
                Pages(
                    it.split(",")
                        .toList().asSequence()
                        .map { it.toInt() }
                        .toList())
            }
            .toList()

        private fun parseRules(stringRule: List<String>) = stringRule.asSequence()
            .filter { it.contains("|") }
            .map { Rule(it.split("|")[0].toInt(), it.split("|")[1].toInt()) }
            .toList()
    }
}