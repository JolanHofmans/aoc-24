package day4.part1

data class Coordinate(val x: Int, val y: Int) {
    companion object {
        val horizontalComparator = Comparator<Coordinate> { c1, c2 ->
            c1.y.compareTo(c2.y).takeIf { it != 0 } ?: c1.x.compareTo(c2.x)
        }

        val verticalComparator = Comparator<Coordinate> { c1, c2 ->
            c1.x.compareTo(c2.x).takeIf { it != 0 } ?: c1.y.compareTo(c2.y)
        }

        val descendingDiagonalComparator = Comparator<Coordinate> { c1, c2 ->
            (c1.x - c1.y).compareTo(c2.x - c2.y).takeIf { it != 0 } ?: c1.x.compareTo(c2.x)
        }

        val ascendingDiagonalComparator = Comparator<Coordinate> { c1, c2 ->
            (c1.x + c1.y).compareTo(c2.x + c2.y).takeIf { it != 0 } ?: c1.x.compareTo(c2.x)
        }

        fun isOnSameRow(coordinates: List<Coordinate>) = isOnSameLine(coordinates, { it.y })
        fun isOnSameColumn(coordinates: List<Coordinate>) = isOnSameLine(coordinates, { it.x })
        fun isOnSameDescendingDiagonal(coordinates: List<Coordinate>) = isOnSameLine(coordinates, { it.x - it.y })
        fun isOnSameAscendingDiagonal(coordinates: List<Coordinate>) = isOnSameLine(coordinates, { it.x + it.y })

        private fun isOnSameLine(coordinates: List<Coordinate>, onLine: (Coordinate) -> Int) =
            coordinates.asSequence().map { onLine(it) }.distinct().count() == 1
    }
}
