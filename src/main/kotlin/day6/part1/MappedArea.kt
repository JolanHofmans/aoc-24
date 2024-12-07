package day6.part1

data class MappedArea(val maxCoordinate: Coordinate, val obstructions: MutableList<Coordinate>) {

    constructor(maxCoordinate: Coordinate) : this(maxCoordinate, mutableListOf())

    fun addObstruction(coordinate: Coordinate) {
        obstructions.add(coordinate)
    }

    fun hitsObstruction(coordinate: Coordinate): Boolean {
        return obstructions.contains(coordinate)
    }

    fun isCoordinateInArea(position: Coordinate): Boolean {
        if (position.x < 0 || position.y < 0) {
            return false
        } else if (position.x > maxCoordinate.x || position.y > maxCoordinate.y) {
            return false
        }
        return true
    }
}
