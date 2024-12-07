package day6.part2

import day6.part1.Coordinate
import day6.part1.MappedArea

data class Guard(var position: Coordinate, var direction: String, val visitedSteps: MutableList<Step>) {

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
                visitedSteps.add(Step(position, direction))
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

    fun isInLoop(): Boolean {
        return visitedSteps.contains(Step(position, direction))
    }
}

