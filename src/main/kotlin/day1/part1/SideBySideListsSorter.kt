package org.example.day1.part1

import java.util.stream.IntStream
import kotlin.streams.asSequence

class SideBySideListsSorter {

    companion object {
        fun sort(sideBySide: SideBySideLists): List<LocationIdTuple> {
            val sortedLeft = sideBySide.leftLocationIds.sorted()
            val sortedRight = sideBySide.rightLocationsIds.sorted()

            require(sortedLeft.size == sortedRight.size) { "Left and right lists must have the same size" }

            return IntStream.range(0, sortedLeft.size).asSequence()
                .map { LocationIdTuple(sortedLeft[it], sortedRight[it]) }
                .toList()
        }
    }
}