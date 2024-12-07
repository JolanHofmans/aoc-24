package day6.part2

import day6.part1.Coordinate
import day6.part1.MappedArea
import java.io.InputStream

class LoopObstacleAdder {

    companion object {

        fun AddObstacleForLoop(input: InputStream): Int {
            val givenInput = InputInterpreter.interprete(input)
            val guard = givenInput.guard!!
            val startPostion = guard.position
            val mappedArea = givenInput.mappedArea!!

            val posibleLoops = mutableSetOf<Coordinate>()

            while (mappedArea.isCoordinateInArea(guard.position)) {
                guard.move(mappedArea)
            }

            guard.visitedSteps
                .asSequence()
                .distinct()
                .toList()
                .parallelStream()
                .peek {
                    val indexOf = guard.visitedSteps.indexOf(it)
                    println("Started coordinate $indexOf of ${guard.visitedSteps.size}")
                }
                .map { it.coordinate }
                .forEach {

                    if (!mappedArea.obstructions.contains(it)) {
                        val newObstacleMap = MappedArea(mappedArea.maxCoordinate)
                        newObstacleMap.obstructions.addAll(mappedArea.obstructions)
                        newObstacleMap.obstructions.add(it)

                        val newGuard = Guard(startPostion, "U", mutableListOf(Step(startPostion, "U")))

                        while (newObstacleMap.isCoordinateInArea(newGuard.position) && newGuard.visitedSteps.asSequence()
                                .distinct().toList().size == newGuard.visitedSteps.size
                        ) {
                            newGuard.move(newObstacleMap)
                            if (newGuard.visitedSteps.asSequence().distinct()
                                    .toList().size != newGuard.visitedSteps.size
                            ) {
                                posibleLoops.add(it)
                            }
                        }
                    }
                }

            return posibleLoops.size
        }
    }
}