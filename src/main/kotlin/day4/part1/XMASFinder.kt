package day4.part1

import day4.part1.Coordinate.Companion.ascendingDiagonalComparator
import day4.part1.Coordinate.Companion.descendingDiagonalComparator
import day4.part1.Coordinate.Companion.horizontalComparator
import day4.part1.Coordinate.Companion.isOnSameAscendingDiagonal
import day4.part1.Coordinate.Companion.isOnSameColumn
import day4.part1.Coordinate.Companion.isOnSameDescendingDiagonal
import day4.part1.Coordinate.Companion.isOnSameRow
import day4.part1.Coordinate.Companion.verticalComparator

class XMASFinder {
    companion object {
        private val directions = listOf(
            SearchDirection(horizontalComparator, { isOnSameRow(it) }),
            SearchDirection(horizontalComparator.reversed(), { isOnSameRow(it) }),
            SearchDirection(verticalComparator, { isOnSameColumn(it) }),
            SearchDirection(verticalComparator.reversed(), { isOnSameColumn(it) }),
            SearchDirection(descendingDiagonalComparator, { isOnSameDescendingDiagonal(it) }),
            SearchDirection(descendingDiagonalComparator.reversed(), { isOnSameDescendingDiagonal(it) }),
            SearchDirection(ascendingDiagonalComparator, { isOnSameAscendingDiagonal(it) }),
            SearchDirection(ascendingDiagonalComparator.reversed(), { isOnSameAscendingDiagonal(it) }),

        )

        fun findXmas(crossWord: CrossWord): Int {

            return directions.asSequence().map {
                val list = crossWord.valueCoordinates.keys.sortedWith(it.sorting)

                list.filterIndexed { index, coordinate ->
                    if (crossWord.getCoordinatesForValue(coordinate) == 'X') {
                        val x = crossWord.getCoordinatesForValue(coordinate)
                        if (index + 3 < crossWord.valueCoordinates.size) {
                            val m = crossWord.valueCoordinates[list[index + 1]]
                            val a = crossWord.valueCoordinates[list[index + 2]]
                            val s = crossWord.valueCoordinates[list[index + 3]]
                            if (x == 'X' && m == 'M' && a == 'A' && s == 'S' && it.isSameOnLine(
                                    listOf(
                                        coordinate,
                                        list[index + 1],
                                        list[index + 2],
                                        list[index + 3]
                                    )
                                )
                            ) {
                                return@filterIndexed true
                            }
                        }
                    }
                    false
                }
                    .count()
            }
                .sum()

        }
    }
}