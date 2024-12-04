package day4.part1

import java.io.InputStream

class CrossWordSolver {
    companion object {
        fun solve(input: InputStream) : Int {
            val crossWord = CrossWordReader.read(input)
            return XMASFinder.findXmas(crossWord)
        }
    }
}