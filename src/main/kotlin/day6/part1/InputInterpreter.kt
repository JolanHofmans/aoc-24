package day6.part1

import java.io.InputStream

class InputInterpreter {

    companion object {

        fun interprete(inputStream: InputStream): GivenInput {
            val givenInput = GivenInput()

            val readLines = inputStream.bufferedReader().readLines()
            val maxCoordinate = Coordinate(readLines[0].length-1, readLines.size-1)

            val mappedArea = MappedArea(maxCoordinate)
            givenInput.mappedArea = mappedArea

            readLines.forEachIndexed { y, line ->
                line.forEachIndexed { x, char ->
                    if(char == '#') {
                        mappedArea.addObstruction(Coordinate(x, y))
                    } else if (char == '^') {
                        val coor = Coordinate(x, y)
                        givenInput.guard = Guard(coor, "U", mutableSetOf(coor))
                    }
                }
            }

            return givenInput
        }
    }
}