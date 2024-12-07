package day6.part1

import java.io.InputStream

class PathPredictor {

    companion object {

            fun predictPath(input: InputStream): Int {
                val givenInput = InputInterpreter.interprete(input)
                val guard = givenInput.guard!!
                val mappedArea = givenInput.mappedArea!!

                while(mappedArea.isCoordinateInArea(guard.position)) {
                    guard.move(mappedArea)
                }

                return guard.visitedCoordinates.size
            }
    }
}