package org.example.day1.part1

data class LocationIdTuple(val locationId1: Int, val locationId2: Int) {
    constructor(locationId1: String, locationId2: String) : this(locationId1.toInt(), locationId2.toInt())

    fun distance(): Int {
        return Math.abs(locationId1 - locationId2)
    }
}
