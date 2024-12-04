package day4.part1

data class CrossWord(val valueCoordinates: MutableMap<Coordinate, Char> = mutableMapOf()) {
    
    fun getCoordinatesForValue(coordinate: Coordinate) = valueCoordinates[coordinate]
    
    fun addCoordinateForValue(coordinate: Coordinate, value: Char) {
        value.also { valueCoordinates[coordinate] = it }
    }
}
