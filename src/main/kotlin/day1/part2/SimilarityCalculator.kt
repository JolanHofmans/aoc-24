package org.example.day1.part2

class SimilarityCalculator {

    companion object {
        fun calculate(number: String, list: List<String>): Int {
            return number.toInt() * list.asSequence()
                                .filter { it.equals(number) }
                                .count()
        }
    }
}