package day4.part2

import day4.part1.Coordinate
import day4.part1.CrossWord

class CrossMASFinder {
    companion object {

        fun findCrossMAS(crossWord: CrossWord): Int {

            return crossWord.valueCoordinates.keys.asSequence()
                .filter { crossWord.valueCoordinates[it] == 'A' }
                .filter { doesAHasFirstLeg(crossWord, it) }
                .filter { doesAHasSecondLeg(crossWord, it) }
                .count()

        }

        private fun doesAHasFirstLeg(crossWord: CrossWord, it: Coordinate) =
            ((crossWord.valueCoordinates[Coordinate(
                it.x + 1,
                it.y + 1
            )] == 'M' && crossWord.valueCoordinates[Coordinate(it.x - 1, it.y - 1)] == 'S')
                    || (crossWord.valueCoordinates[Coordinate(
                it.x - 1,
                it.y - 1
            )] == 'M' && crossWord.valueCoordinates[Coordinate(it.x + 1, it.y + 1)] == 'S'))

        private fun doesAHasSecondLeg(crossWord: CrossWord, it: Coordinate) =
            ((crossWord.valueCoordinates[Coordinate(
                it.x + 1,
                it.y - 1
            )] == 'M' && crossWord.valueCoordinates[Coordinate(it.x - 1, it.y + 1)] == 'S')
                    || (crossWord.valueCoordinates[Coordinate(
                it.x - 1,
                it.y + 1
            )] == 'M' && crossWord.valueCoordinates[Coordinate(it.x + 1, it.y - 1)] == 'S'))
    }
}