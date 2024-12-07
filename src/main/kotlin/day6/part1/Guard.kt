package day6.part1

data class Guard(var position: Coordinate, var direction: String, val visitedCoordinates: MutableSet<Coordinate>) {

    fun move(mappedArea: MappedArea) {
        val tempPosition = when (direction) {
            "U" -> Coordinate(position.x, position.y - 1)
            "D" -> Coordinate(position.x, position.y + 1)
            "L" -> Coordinate(position.x - 1, position.y)
            "R" -> Coordinate(position.x + 1, position.y)
            else -> throw IllegalArgumentException("Invalid direction")
        }

        if (!mappedArea.hitsObstruction(tempPosition)) {
            position = tempPosition
            if (mappedArea.isCoordinateInArea(position)) {
                visitedCoordinates.add(position)
            }
        } else {
            direction = when (direction) {
                "U" -> "R"
                "L" -> "U"
                "D" -> "L"
                "R" -> "D"
                else -> throw IllegalArgumentException("Invalid direction")
            }
        }

    }
}
