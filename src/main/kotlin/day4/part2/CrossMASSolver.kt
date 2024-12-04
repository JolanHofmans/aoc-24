package day4.part2

import day4.part1.CrossWordReader
import java.io.InputStream

class CrossMASSolver {
    companion object {
        fun solve(input: InputStream) : Int {
            val crossWord = CrossWordReader.read(input)
            return CrossMASFinder.findCrossMAS(crossWord)
        }
    }
}